package com.emtvoinos.studentwork;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.emtvoinos.studentwork.R;

public class BonusMiniGameActivity extends AppCompatActivity {

    private BonusMiniGame bonusMiniGame;
    private ImageButton tree1;
    private ImageButton tree2;
    private ImageButton tree3;
    private ImageView result1;
    private ImageView result2;
    private ImageView result3;
    private Intent win;
    private Intent lose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini);

        int poacher = R.drawable.poacher;
        bonusMiniGame = new BonusMiniGame();
        result1 = findViewById(R.id.result1);
        result2 = findViewById(R.id.result2);
        result3 = findViewById(R.id.result3);
        tree1 = findViewById(R.id.tree1);
        tree2 = findViewById(R.id.tree2);
        tree3 = findViewById(R.id.tree3);


        if(bonusMiniGame.getPosition1().equals("Win")){
            result1.setImageResource(poacher);
        } else if (bonusMiniGame.getPosition2().equals("Win")){
            result2.setImageResource(poacher);
        } else {
            result3.setImageResource(poacher);
        }

        win = new Intent(this, OnStartPlayActivity.class);
        win.putExtra("playerFunds", 10);
        lose = new Intent(this, GOActivity.class);


    }

    public void setAllTreesInvisible(){
        tree1.setVisibility(View.INVISIBLE);
        tree2.setVisibility(View.INVISIBLE);
        tree3.setVisibility(View.INVISIBLE);
    }

    public void setResultsVisible(){
        result1.setVisibility(View.VISIBLE);
        result2.setVisibility(View.VISIBLE);
        result3.setVisibility(View.VISIBLE);
    }

    public void onTree1Clicked(View button){
        setAllTreesInvisible();
        setResultsVisible();
        if(bonusMiniGame.getPosition1().equals("Win")){
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(win);
                }
            }, 2000);
        } else {
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(lose);
                }
            }, 2000);
        }
    }

    public void onTree2Clicked(View button){
        setAllTreesInvisible();
        setResultsVisible();
        if(bonusMiniGame.getPosition2().equals("Win")){
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(win);
                }
            }, 2000);
        } else {
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(lose);
                }
            }, 2000);
        }
    }

    public void onTree3Clicked(View button){
        setAllTreesInvisible();
        setResultsVisible();
        if(bonusMiniGame.getPosition3().equals("Win")){
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(win);
                }
            }, 2000);
        } else {
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(lose);
                }
            }, 2000);
        }
    }

}
