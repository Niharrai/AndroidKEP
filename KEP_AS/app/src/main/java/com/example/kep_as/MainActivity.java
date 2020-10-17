package com.example.kep_as;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private EditText et1;
    private String toast = "This is a test toast";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.Button1);
        et1 = findViewById(R.id.EditText1);
       /* if(et1.getText() != null)
        {
            toast = et1.getText().toString();
        }*/
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               /*if(!et1.getText().toString().matches(""))
                {
                    toast = et1.getText().toString();
                }*/
                Toast.makeText(MainActivity.this, "This is a test toast", Toast.LENGTH_SHORT).show();
                //Toast.makeText(MainActivity.this, toast, Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void Clicked(View v){
        //add the intent
    }

}