package com.example.riddick.sudoku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class NewGame extends AppCompatActivity {
String difficult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);

        Button easy=(Button) findViewById(R.id.easy);
        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(NewGame.this,Gameboard.class);
                difficult="3";
                i.putExtra("difficulty",difficult);
                startActivity(i);
            }
        });

        Button medium=(Button) findViewById(R.id.medium);
        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(NewGame.this,Gameboard.class);
                difficult="2";
                i.putExtra("difficulty",difficult);
                startActivity(i);
            }
        });

        Button hard=(Button) findViewById(R.id.hard);
        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(NewGame.this,Gameboard.class);
                difficult="1";
                i.putExtra("difficulty",difficult);
                startActivity(i);
            }
        });

    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.home){
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
