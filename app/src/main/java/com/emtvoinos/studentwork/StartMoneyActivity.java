package com.emtvoinos.studentwork;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.emtvoinos.studentwork.R;

public class StartMoneyActivity extends AppCompatActivity {

    private int currentFunds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mega);

        Intent i = getIntent();
        Bundle extras = i.getExtras();

        if(i.hasExtra("currentFunds")){
            currentFunds = extras.getInt("currentFunds");
        } else {
            currentFunds = 0;
        }

    }

    public void onFiveButtonClicked(View button){
        Intent i = new Intent(this, OnStartPlayActivity.class);
        i.putExtra("playerFunds", 5 + currentFunds);
        startActivity(i);
        }

    public void onTenButtonClicked(View button){
        Intent i = new Intent(this, OnStartPlayActivity.class);
        i.putExtra("playerFunds", 10 + currentFunds);
        startActivity(i);
    }

    public void onTwentyButtonClicked(View button){
        Intent i = new Intent(this, OnStartPlayActivity.class);
        i.putExtra("playerFunds", 20 + currentFunds);
        startActivity(i);
    }

    public void onFiftyButtonClicked(View button){
        Intent i = new Intent(this, OnStartPlayActivity.class);
        i.putExtra("playerFunds", 50 + currentFunds);
        startActivity(i);
    }


}
