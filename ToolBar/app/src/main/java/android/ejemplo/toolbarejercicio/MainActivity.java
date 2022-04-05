package android.ejemplo.toolbarejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void mensaje (int resid){
        Toast.makeText(this, getText(resid), Toast.LENGTH_SHORT).show();
    }

    @SuppressLint("NonConstantResourceId")
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.barra_nuevo:
                mensaje(R.string.cadena_barra_nuevo);
                return true;
            case R.id.barra_editar:
                mensaje(R.string.cadena_barra_editar);
                return true;
            case R.id.barra_configurar:
                mensaje(R.string.cadena_barra_configurar);
                return true;
            case R.id.barra_ayuda:
                mensaje(R.string.cadena_barra_ayuda);
                return true;
            case R.id.barra_acerca:
                mensaje(R.string.cadena_barra_acerca);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}