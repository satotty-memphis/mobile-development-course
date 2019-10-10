package com.example.assignment2solution;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int number;

    EditText editText;

    Button buttonCountUp;
    Button buttonCountDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        buttonCountUp = (Button) findViewById(R.id.buttonCountUp);
        buttonCountDown = (Button) findViewById(R.id.buttonCountDown);

    }

    //Log.i("info","our message here");

    public void countUp(View v){
        //Toast.makeText(this, "In countUp method",Toast.LENGTH_LONG).show();
        number = Integer.valueOf(editText.getText().toString());
        String message = "";
        if(validValue(number)) {
            for(int i = number; i <= 10; i++){
                Log.i("message","count = " + i);
                message = message + i + " ";
            }
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "Number must be between 1 and 10.", Toast.LENGTH_LONG).show();
        }
    }

    public void countDown(View v){
        //Toast.makeText(this, "In countDown method",Toast.LENGTH_LONG).show();
        number = Integer.valueOf(editText.getText().toString());
        String message = "";
        if(validValue(number)) {
            for(int i = number; i >= 1; i--){
                Log.i("message","count = " + i);
                message = message + i + " ";
            }
            Toast.makeText(this, message ,Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Number must be between 1 and 10.",Toast.LENGTH_LONG).show();
        }
    }

    Boolean validValue(int numberEntered){
        Boolean isValid = false;
        if(numberEntered >= 1 & numberEntered <= 10){
            isValid = true;
        }
        return isValid;
    }
}


