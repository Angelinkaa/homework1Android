package ru.gb.homework1;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class NewActivity extends AppCompatActivity {

    private EditText text;
    private EditText phone;
    private EditText number;
    private EditText textPassword;
    private EditText textEmailAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);

        text = findViewById(R.id.text);
        phone = findViewById(R.id.phone);
        number = findViewById(R.id.number);
        textPassword = findViewById(R.id.textPassword);
        textEmailAddress = findViewById(R.id.textEmailAddress);
    }

}
