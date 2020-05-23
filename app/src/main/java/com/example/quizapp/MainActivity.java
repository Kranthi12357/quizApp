package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     RadioGroup rQuesiton2,rQuestion3;
     RadioButton rAnswer2,rAnswer3;
     CheckBox cbQuestion1optionA,cbQuestion1optionB,cbQuestion1optionC;
     EditText ans;
     int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbQuestion1optionA = (CheckBox)findViewById(R.id.checkbox1);
        cbQuestion1optionB = (CheckBox)findViewById(R.id.checkbox2);
        cbQuestion1optionC = (CheckBox) findViewById(R.id.checkbox3);
        rQuesiton2 = (RadioGroup) findViewById(R.id.radiogroup2);
        rQuestion3 = (RadioGroup) findViewById(R.id.radiogroup3);
        ans = (EditText)findViewById(R.id.edittext);

    }
    public void submit(View view){


        int id2 = rQuesiton2.getCheckedRadioButtonId();
        int id3 = rQuestion3.getCheckedRadioButtonId();
        String s = ans.getText().toString();
        Log.v("Hello",s);
        if (cbQuestion1optionA.isChecked() && cbQuestion1optionB.isChecked() && !cbQuestion1optionC.isChecked()){
            score = score+1;
            Toast.makeText(this,"correct",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this,"wrong",Toast.LENGTH_SHORT).show();
        }
        if(s.equals("china")){
            score = score +1;
            Toast.makeText(this,"correct",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this,"wrong",Toast.LENGTH_SHORT).show();
        }
        if(id2!=-1) {
            rAnswer2 = (RadioButton)findViewById(id2);
            if (rAnswer2.getId() == R.id.option23) {
                score = score + 1;
                Toast.makeText(this,"correct",Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this,"false",Toast.LENGTH_SHORT).show();
            }
        }
        if(id3!=-1) {
            rAnswer3 = (RadioButton)findViewById(id3);
            if (rAnswer3.getId() == R.id.option33) {
                score = score + 1;
                Toast.makeText(this,"correct",Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this,"wrong",Toast.LENGTH_SHORT).show();
            }
        }

        Toast.makeText(this,score+""+"/4",Toast.LENGTH_SHORT).show();
        score = 0;
    }

}
