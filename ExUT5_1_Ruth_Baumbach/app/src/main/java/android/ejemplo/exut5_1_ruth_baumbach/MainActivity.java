package android.ejemplo.exut5_1_ruth_baumbach;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =findViewById(R.id.textView);
        editText=findViewById(R.id.editText);
        button =findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        textView.setText(""+factorial(Integer.parseInt(editText.getText().toString())));

                    }
                }).start();
            }
        });

    }
    public int factorial(int number){
        if (number==0)
            return 1;
        else
            return number*factorial(number-1);
    }
}