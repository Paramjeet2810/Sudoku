package com.example.riddick.sudoku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button newGame=(Button) (findViewById(R.id.newGame));
        newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openNewGame=new Intent(MainActivity.this,NewGame.class);
                startActivity(openNewGame);
            }
        });

        Button instructions=(Button) (findViewById(R.id.instructions));
        instructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openInstructions=new Intent(MainActivity.this,Instructions.class);
                startActivity(openInstructions);
            }
        });

        Button about=(Button) (findViewById(R.id.about));
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openAbout=new Intent(MainActivity.this,About.class);
                startActivity(openAbout);
            }
        });




    }
}
