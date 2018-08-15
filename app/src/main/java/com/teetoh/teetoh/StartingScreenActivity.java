package com.teetoh.teetoh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartingScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.starting_screen);
    }

    public void LoadTutorPage(View view){

    }

    public void LoadStudentPage(View view){
        Intent student = new Intent(StartingScreenActivity.this, StudentHome.class);
        startActivity(student);
    }
}
