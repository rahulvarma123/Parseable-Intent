package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TargetActivity extends AppCompatActivity {

    TextView tvStudentNum, tvStudentName, tvStudentMarks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        tvStudentNum = findViewById(R.id.txtViewStNum);
        tvStudentName = findViewById(R.id.txtViewStName);
        tvStudentMarks = findViewById(R.id.txtViewStMarks);

        Intent intent = getIntent();

        Bundle bundle = intent.getBundleExtra("stbundle");

        Student student = bundle.getParcelable("student");

        int studentNum = student.getStNum();
        String studentName = student.getStName();
        int studentMarks = student.getStMarks();

        tvStudentNum.setText(String.valueOf(studentNum));
        tvStudentName.setText(studentName);
        tvStudentMarks.setText(String.valueOf(studentMarks));

    }
}
