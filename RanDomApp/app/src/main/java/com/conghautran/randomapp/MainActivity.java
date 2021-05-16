package com.conghautran.randomapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView editTxtNumber1;
    TextView editTxtNumber2;
    Button btnRandom;
    TextView numberRandom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        map();
        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string1=editTxtNumber1.getText().toString().trim();
                String string2=editTxtNumber2.getText().toString().trim();

                if (string1.length()==0||string2.length()==0)
                {
                    Toast.makeText(MainActivity.this,"Vui long nhap so",Toast.LENGTH_SHORT).show();
                }
                else {
                    int number1=Integer.parseInt(string1);
                    int number2=Integer.parseInt(string2);
                    Random random=new Random();
                    int number=random.nextInt(number2-number1)+number1;
                    numberRandom.setText(String.valueOf(number));
                }
            }
        });
    }
    private void map()
    {
        editTxtNumber1=(TextView) findViewById(R.id.editTxtNumber1);
        editTxtNumber2=(TextView) findViewById(R.id.editTxtNumber2);
        btnRandom=(Button) findViewById(R.id.btnRandom);
        numberRandom=(TextView)findViewById(R.id.numberRandom);
    }

}