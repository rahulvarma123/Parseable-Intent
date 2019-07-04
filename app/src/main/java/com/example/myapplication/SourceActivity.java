package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SourceActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etStudentNum, etStudentName, etStudentMarks;
    Button btnMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_source);

        etStudentNum = findViewById(R.id.etStNum);
        etStudentName = findViewById(R.id.etStName);
        etStudentMarks = findViewById(R.id.etStMarks);

        btnMove = findViewById(R.id.btnMove);

        btnMove.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        int stNum = Integer.parseInt(etStudentNum.getText().toString());
        String stName = etStudentName.getText().toString();
        int stMarks = Integer.parseInt(etStudentMarks.getText().toString());

        Intent intent = new Intent(this, TargetActivity.class);

        Bundle bundle = new Bundle();

        Student st = new Student();
        st.setStNum(stNum);
        st.setStName(stName);
        st.setStMarks(stMarks);

        bundle.putParcelable("student", st);

        intent.putExtra("stbundle", bundle);

        startActivity(intent);
    }
}
