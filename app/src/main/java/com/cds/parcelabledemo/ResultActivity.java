package com.cds.parcelabledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Bundle data = getIntent().getExtras();
        Student student = (Student) data.getParcelable("Student");

        Toast.makeText(getApplicationContext(),"Name: "+student.getName()+" Age: "+student.getAge(),Toast.LENGTH_LONG).show();
    }
}
