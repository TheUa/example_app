package com.emtvoinos.studentwork;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.emtvoinos.studentwork.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void onClickNewGameButton(View button){
        Intent i = new Intent(this, StartMoneyActivity.class);
        startActivity(i);
    }


}
