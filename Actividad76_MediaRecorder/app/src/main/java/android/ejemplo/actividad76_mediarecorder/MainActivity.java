package android.ejemplo.actividad76_mediarecorder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private static final int MICRO_PERMISSION=200;
    ImageButton btnRecord, btnPause, btnPlay;
    MediaRecorder recorder;
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRecord=findViewById(R.id.btnRecord);
        btnPause=findViewById(R.id.btnPause);
        btnPlay=findViewById(R.id.btnPlay);

        if(microExists()){
            getMicroPermission();
        }
    }

    public void record(View view){
        recorder = new MediaRecorder();
        try{
            recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
            recorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
            recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
            recorder.setOutputFile(getFile());
            recorder.prepare();
            recorder.start();
            Toast.makeText(getApplicationContext(), "Grabando", Toast.LENGTH_SHORT).show();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void play(View view){
        player = new MediaPlayer();
        try{
            player.setDataSource(getFile());
            player.prepare();
            player.start();
            Toast.makeText(getApplicationContext(), "Reproduciendo", Toast.LENGTH_SHORT).show();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void pause(View view){
        if(recorder==null){
            Toast.makeText(getApplicationContext(), "No existe ninguna grabación", Toast.LENGTH_SHORT).show();
        }else{
            recorder.stop();
            recorder.release();
            Toast.makeText(getApplicationContext(), "Pausado", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean microExists(){
        return this.getPackageManager().hasSystemFeature(PackageManager.FEATURE_MICROPHONE);
    }

    private void getMicroPermission(){
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO)==PackageManager.PERMISSION_DENIED){
            ActivityCompat.requestPermissions(this, new String[]{
                    Manifest.permission.RECORD_AUDIO
            }, MICRO_PERMISSION);
        }
    }

    private String getFile(){
        ContextWrapper wrapper = new ContextWrapper(getApplicationContext());
        File musicDirectory = wrapper.getExternalFilesDir(Environment.DIRECTORY_MUSIC);
        File file = new File(musicDirectory, "record"+".mp3");
        return file.getPath();
    }
}