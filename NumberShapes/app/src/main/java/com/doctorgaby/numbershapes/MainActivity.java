package com.doctorgaby.numbershapes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void test(View view){
        //variable to hold all the possible combinations of messages
        String message;
        EditText number = (EditText) findViewById(R.id.numberField);

        Log.i("gotNumber", number.getText().toString());
        if (number.getText().toString().isEmpty()) {

            message = "Please enter a number";

        } else {
            //create class object
            Number checkNumber = new Number();

            checkNumber.number = Integer.parseInt(number.getText().toString());
            if (checkNumber.isSquare()) {
                if (checkNumber.isTriangular()) {
                    message = checkNumber.number + " is both triangular and square!";
                } else {
                    message = checkNumber.number + " is square, but not triangular.";
                }
            } else {
                if (checkNumber.isTriangular()) {
                    message = checkNumber.number + " is triangular but not square.";
                } else {
                    message = checkNumber.number + " is neither square nor triangular.";
                }
            }
        }
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
