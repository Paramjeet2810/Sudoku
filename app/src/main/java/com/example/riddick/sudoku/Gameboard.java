package com.example.riddick.sudoku;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

import static android.graphics.Color.parseColor;

public class Gameboard extends AppCompatActivity {
    int arryAns[][] = new int[9][9],displayHeight;
    int arryQuestion[][] = new int[9][9];
    int levelOfDifficulty ; //1 for hard  2 for medium 3 for easy
    final boolean changeable[]=new boolean[81];
    Button pickup1,pickup2,pickup3,pickup4,pickup5,pickup6,pickup7,pickup8,pickup9;
    String numToBePlaced="Empty";
    GridView gameBoard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        displayHeight = displaymetrics.heightPixels;
        setContentView(R.layout.activity_gameboard);
        pickup1= (Button) findViewById(R.id.numPick1);
        pickup2= (Button) findViewById(R.id.numPick2);
        pickup3= (Button) findViewById(R.id.numPick3);
        pickup4= (Button) findViewById(R.id.numPick4);
        pickup5= (Button) findViewById(R.id.numPick5);
        pickup6= (Button) findViewById(R.id.numPick6);
        pickup7= (Button) findViewById(R.id.numPick7);
        pickup8= (Button) findViewById(R.id.numPick8);
        pickup9= (Button) findViewById(R.id.numPick9);
        gameBoard = (GridView) findViewById(R.id.gridView);
        Button submit=(Button) (findViewById(R.id.submit));
        TextView difficulty= (TextView) findViewById(R.id.difficulty);
        Intent intent=getIntent();
        this.levelOfDifficulty=Integer.parseInt(intent.getStringExtra("difficulty"));
        if(levelOfDifficulty==1)
            difficulty.setText("HARD");
        if(levelOfDifficulty==2)
            difficulty.setText("MEDIUM");
        if(levelOfDifficulty==3)
            difficulty.setText("EASY");

        pickup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numToBePlaced="1";
                pickup1.setBackgroundColor(parseColor("#00000000"));
                pickup2.setBackgroundColor(parseColor("#3F51B5"));
                pickup3.setBackgroundColor(parseColor("#3F51B5"));
                pickup4.setBackgroundColor(parseColor("#3F51B5"));
                pickup5.setBackgroundColor(parseColor("#3F51B5"));
                pickup6.setBackgroundColor(parseColor("#3F51B5"));
                pickup7.setBackgroundColor(parseColor("#3F51B5"));
                pickup8.setBackgroundColor(parseColor("#3F51B5"));
                pickup9.setBackgroundColor(parseColor("#3F51B5"));
            }
        });
        pickup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numToBePlaced="2";
                pickup1.setBackgroundColor(parseColor("#3F51B5"));
                pickup2.setBackgroundColor(parseColor("#00000000"));
                pickup3.setBackgroundColor(parseColor("#3F51B5"));
                pickup4.setBackgroundColor(parseColor("#3F51B5"));
                pickup5.setBackgroundColor(parseColor("#3F51B5"));
                pickup6.setBackgroundColor(parseColor("#3F51B5"));
                pickup7.setBackgroundColor(parseColor("#3F51B5"));
                pickup8.setBackgroundColor(parseColor("#3F51B5"));
                pickup9.setBackgroundColor(parseColor("#3F51B5"));
            }
        });
        pickup3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numToBePlaced="3";
                pickup1.setBackgroundColor(parseColor("#3F51B5"));
                pickup2.setBackgroundColor(parseColor("#3F51B5"));
                pickup3.setBackgroundColor(parseColor("#00000000"));
                pickup4.setBackgroundColor(parseColor("#3F51B5"));
                pickup5.setBackgroundColor(parseColor("#3F51B5"));
                pickup6.setBackgroundColor(parseColor("#3F51B5"));
                pickup7.setBackgroundColor(parseColor("#3F51B5"));
                pickup8.setBackgroundColor(parseColor("#3F51B5"));
                pickup9.setBackgroundColor(parseColor("#3F51B5"));
            }
        });
        pickup4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numToBePlaced="4";
                pickup1.setBackgroundColor(parseColor("#3F51B5"));
                pickup2.setBackgroundColor(parseColor("#3F51B5"));
                pickup3.setBackgroundColor(parseColor("#3F51B5"));
                pickup4.setBackgroundColor(parseColor("#00000000"));
                pickup5.setBackgroundColor(parseColor("#3F51B5"));
                pickup6.setBackgroundColor(parseColor("#3F51B5"));
                pickup7.setBackgroundColor(parseColor("#3F51B5"));
                pickup8.setBackgroundColor(parseColor("#3F51B5"));
                pickup9.setBackgroundColor(parseColor("#3F51B5"));
            }
        });
        pickup5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numToBePlaced="5";
                pickup1.setBackgroundColor(parseColor("#3F51B5"));
                pickup2.setBackgroundColor(parseColor("#3F51B5"));
                pickup3.setBackgroundColor(parseColor("#3F51B5"));
                pickup4.setBackgroundColor(parseColor("#3F51B5"));
                pickup5.setBackgroundColor(parseColor("#00000000"));
                pickup6.setBackgroundColor(parseColor("#3F51B5"));
                pickup7.setBackgroundColor(parseColor("#3F51B5"));
                pickup8.setBackgroundColor(parseColor("#3F51B5"));
                pickup9.setBackgroundColor(parseColor("#3F51B5"));
            }
        });
        pickup6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numToBePlaced="6";
                pickup1.setBackgroundColor(parseColor("#3F51B5"));
                pickup2.setBackgroundColor(parseColor("#3F51B5"));
                pickup3.setBackgroundColor(parseColor("#3F51B5"));
                pickup4.setBackgroundColor(parseColor("#3F51B5"));
                pickup5.setBackgroundColor(parseColor("#3F51B5"));
                pickup6.setBackgroundColor(parseColor("#00000000"));
                pickup7.setBackgroundColor(parseColor("#3F51B5"));
                pickup8.setBackgroundColor(parseColor("#3F51B5"));
                pickup9.setBackgroundColor(parseColor("#3F51B5"));
            }
        });
        pickup7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numToBePlaced="7";
                pickup1.setBackgroundColor(parseColor("#3F51B5"));
                pickup2.setBackgroundColor(parseColor("#3F51B5"));
                pickup3.setBackgroundColor(parseColor("#3F51B5"));
                pickup4.setBackgroundColor(parseColor("#3F51B5"));
                pickup5.setBackgroundColor(parseColor("#3F51B5"));
                pickup6.setBackgroundColor(parseColor("#3F51B5"));
                pickup7.setBackgroundColor(parseColor("#00000000"));
                pickup8.setBackgroundColor(parseColor("#3F51B5"));
                pickup9.setBackgroundColor(parseColor("#3F51B5"));
            }
        });
        pickup8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numToBePlaced="8";
                pickup1.setBackgroundColor(parseColor("#3F51B5"));
                pickup2.setBackgroundColor(parseColor("#3F51B5"));
                pickup3.setBackgroundColor(parseColor("#3F51B5"));
                pickup4.setBackgroundColor(parseColor("#3F51B5"));
                pickup5.setBackgroundColor(parseColor("#3F51B5"));
                pickup6.setBackgroundColor(parseColor("#3F51B5"));
                pickup7.setBackgroundColor(parseColor("#3F51B5"));
                pickup8.setBackgroundColor(parseColor("#00000000"));
                pickup9.setBackgroundColor(parseColor("#3F51B5"));
            }
        });
        pickup9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numToBePlaced="9";
                pickup1.setBackgroundColor(parseColor("#3F51B5"));
                pickup2.setBackgroundColor(parseColor("#3F51B5"));
                pickup3.setBackgroundColor(parseColor("#3F51B5"));
                pickup4.setBackgroundColor(parseColor("#3F51B5"));
                pickup5.setBackgroundColor(parseColor("#3F51B5"));
                pickup6.setBackgroundColor(parseColor("#3F51B5"));
                pickup7.setBackgroundColor(parseColor("#3F51B5"));
                pickup8.setBackgroundColor(parseColor("#3F51B5"));
                pickup9.setBackgroundColor(parseColor("#00000000"));
            }
        });

        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 9; i++) {
                arryAns[j][i] = 0;
                arryQuestion[j][i] = 0;
            }
        }
        Random ran = new Random();
        int startPosition = ran.nextInt(9) + 1;
        for (int j = 0; j < 9; j++) {
            int num = 1;
            for (int i = 0; i < 9; i++) {
                arryAns[j][(startPosition + i + j * 3 + j / 3) % 9] = num % 9 + 1;
                num++;
            }
        }

        for (int p = 0; p < 3; p++) {
            int r1 = ran.nextInt(3) + 3 * p;
            int r2 = ran.nextInt(3) + 3 * p;
            int c1 = r1;
            int c2 = r2;
            swapRow(r1, r2);
            swapCol(c1, c2);
        }


        for (int i = 0; i < 9; i++) {
            int rowPosInBlock = ran.nextInt(3) + 3 * (i / 3);
            int colPosInBLock = ran.nextInt(3) + 3 * (i % 3);
            for (int j = 0; j < 3 + levelOfDifficulty; j++) {
                arryQuestion[(rowPosInBlock + j) % 9][(colPosInBLock + j) % 9] = arryAns[(rowPosInBlock + j) % 9][(colPosInBLock + j) % 9];

            }
        }

        for(int i=0;i<81;i++){
            if(arryQuestion[i/9][i%9]==0){
                changeable[i]=true;
            }
            else
                changeable[i]=false;
        }


        gameBoard.setAdapter(new DataAdapter(this));
        gameBoard.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                DataAdapter temp=new DataAdapter();
                if(changeable[position]) {
                    if(numToBePlaced.equals("Empty")){
                        Toast.makeText(Gameboard.this, "Select a number first", Toast.LENGTH_SHORT).show();
                        if(arryQuestion[position/9][position%9]>=1 && arryQuestion[position/9][position%9]<=9){
                            arryQuestion[position/9][position%9]=0;
                        }
                    }
                    else{
                        arryQuestion[position / 9][position % 9] =Integer.parseInt(numToBePlaced);
                        numToBePlaced="Empty";
                    }
                   // view.setBackgroundColor(16777215);
                    //view.findViewById(R.id.textView).setBackgroundColor(16777215);
                }
                gameBoard.setAdapter(new DataAdapter(Gameboard.this));
                }
            }
        );
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int flag=0;
                String display="Congratulations you completed the Sudoku ";
                for(int i=0;i<9;i++) {
                    for (int j = 0; j < 9; j++) {
                        if (arryQuestion[i][j] == arryAns[i][j]) {
                            continue;
                        }
                        if (arryQuestion[i][j] != arryAns[i][j]) {
                            flag = 1;
                            display = "Sorry the Sudoku is incorrect or incomplete";
                            break;
                        }

                    }
                }
                    AlertDialog alert = new AlertDialog.Builder(Gameboard.this).create();
                    alert.setTitle("RESULT");
                    alert.setMessage(display);
                    if(flag==1) {
                        alert.setButton(DialogInterface.BUTTON_NEUTRAL, "Continue", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                    }
                    else
                    alert.setButton(DialogInterface.BUTTON_NEUTRAL, "Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                         Intent i=new Intent(Gameboard.this,MainActivity.class);
                            startActivity(i);
                        }
                    });
                    alert.show();
                }



        });
    }

    public class DataAdapter extends BaseAdapter {
        Context context;
        int positionChange=-1,num=-1;
        public DataAdapter(Context c){
            this.context=c;
        }
        public DataAdapter(){
        }
        public DataAdapter(Context c,int p,int num){
            this.context=c;
            this.positionChange=p;
            this.num=num;
            Log.d("Constructor:",""+p);
        }
        @Override
        public int getCount() {
            return arryQuestion.length*arryQuestion.length;
        }

        @Override
        public Object getItem(int position) {
            return arryQuestion[position/9][position%9];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View gridView;
            if(convertView==null){
                Log.d("Hie",""+positionChange);
                gridView=new View(context);
                gridView=inflater.inflate(R.layout.single_item,null);
                TextView textView=(TextView) gridView.findViewById(R.id.textView);
                textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, (float) (0.048*displayHeight));
                if(position==3||position==4||position==5||position==12||position==13||position==14||position==21||position==22||position==23||position==27||position==28||position==29
                        ||position==33||position==34||position==35||position==36||position==37||position==38||position==42||position==43||position==44||position==45||position==46
                        ||position==47||position==51||position==52||position==53||position==57||position==58||position==59||position==66||position==67||position==68||position==75||position==76||position==77)
                {
                    textView.setBackgroundColor(parseColor("#78ebf5"));
                }


                if(arryQuestion[position/9][position%9]!=0) {
                    textView.setText(String.valueOf(arryQuestion[position / 9][position % 9]));
                    Log.d("Size",""+0.045*displayHeight);
                   if(changeable[position]){
                       textView.setTextColor(parseColor("#ff0000"));
                   }
                    if(position==positionChange){
                        //Log.d("Hie",""+position);
                        textView.setBackgroundColor(parseColor("#777777"));
                    }
                }
                else
                    textView.setText(" ");
                if(position==positionChange){
                    //Log.d("Hint",""+position);
                    textView.setBackgroundColor(parseColor("#777777"));
                }
            }
            else{
                gridView=(View) convertView;
            }
            pickup1.setBackgroundColor(parseColor("#3F51B5"));
            pickup2.setBackgroundColor(parseColor("#3F51B5"));
            pickup3.setBackgroundColor(parseColor("#3F51B5"));
            pickup4.setBackgroundColor(parseColor("#3F51B5"));
            pickup5.setBackgroundColor(parseColor("#3F51B5"));
            pickup6.setBackgroundColor(parseColor("#3F51B5"));
            pickup7.setBackgroundColor(parseColor("#3F51B5"));
            pickup8.setBackgroundColor(parseColor("#3F51B5"));
            pickup9.setBackgroundColor(parseColor("#3F51B5"));
            switch(num){
                case 1:pickup1.setBackgroundColor(parseColor("#00000000"));break;
                case 2:pickup2.setBackgroundColor(parseColor("#00000000"));break;
                case 3:pickup3.setBackgroundColor(parseColor("#00000000"));break;
                case 4:pickup4.setBackgroundColor(parseColor("#00000000"));break;
                case 5:pickup5.setBackgroundColor(parseColor("#00000000"));break;
                case 6:pickup6.setBackgroundColor(parseColor("#00000000"));break;
                case 7:pickup7.setBackgroundColor(parseColor("#00000000"));break;
                case 8:pickup8.setBackgroundColor(parseColor("#00000000"));break;
                case 9:pickup9.setBackgroundColor(parseColor("#00000000"));break;
            }
            return gridView;
        }
    }

     public void swapRow(int r1, int r2) {
        for (int i = 0; i < 9; i++) {
            int temp = arryAns[r1][i];
            arryAns[r1][i] = arryAns[r2][i];
            arryAns[r2][i] = temp;
        }
    }

    public void swapCol(int c1, int c2) {
        for (int i = 0; i < 9; i++) {
            int temp = arryAns[i][c1];
            arryAns[i][c1] = arryAns[i][c2];
            arryAns[i][c2] = temp;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        //Toast.makeText(Gameboard.this, "You clicked on hint", Toast.LENGTH_SHORT).show();
        if(id==R.id.hint){
            int position=-1,num=-1;
            for(int i=0;i<81;i++) {
                if (arryQuestion[i / 9][i % 9] != arryAns[i / 9][i % 9]) {
                    position = i;
                    num = arryAns[i / 9][i % 9];
                    break;
                }
            }
            gameBoard.setAdapter(new DataAdapter(Gameboard.this,position,num));

            numToBePlaced=String.valueOf(num);
            Log.d("Char:",numToBePlaced);
            return true;
        }
        if (id == android.R.id.home) {
            onBackPressed();
            //Toast.makeText(MainActivity.this,"HEllo"+id, Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}

