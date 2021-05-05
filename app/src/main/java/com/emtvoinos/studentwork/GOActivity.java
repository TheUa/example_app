package com.emtvoinos.studentwork;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.emtvoinos.studentwork.R;

public class GOActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gover);
    }

    public void onAddMoneyClicked(View button){
        Intent i = new Intent(this, StartMoneyActivity.class);
            startActivity(i);
    }

    public void onQuitClicked(View button){
        Intent i = new Intent(this, MenuActivity.class);
        startActivity(i);
    }
}
