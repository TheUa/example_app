package com.emtvoinos.studentwork;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.emtvoinos.studentwork.R;

public class NewActivity extends AppCompatActivity {

    Integer startMoney;
    Integer endMoney;
    TextView collectMessage;
    TextView collectValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_col);

        collectMessage = findViewById(R.id.collectMessageText);
        collectValue = findViewById(R.id.collectValueText);

        Intent i = getIntent();
        Bundle extras = i.getExtras();
        startMoney = extras.getInt("startMoney");
        endMoney = extras.getInt("endMoney");

        collectValue.setText("$" + endMoney.toString());

        if(startMoney > endMoney){
            collectMessage.setText("Better Luck Next Time!");
        } else {
            collectMessage.setText("Congratulations!!");
        }
    }

    public void onPlayAgainClicked(View button){
        Intent i = new Intent(this, MenuActivity.class);
        startActivity(i);
    }

}
