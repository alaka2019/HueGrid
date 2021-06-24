package com.example.huegrid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class square extends AppCompatActivity {
    ImageButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    ImageView home, retry;
    int level;

    ArrayList<Integer> color;
    ArrayList<ArrayList<ImageButton>> buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
        level=static1.chosenlevel;
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        home=findViewById(R.id.im2);
        retry=findViewById(R.id.im1);
        color = new ArrayList<>();
        buttons= new ArrayList<>();
        ArrayList<ImageButton> temp1 = new ArrayList<>();
        temp1.add(b1);
        temp1.add(b2);
        temp1.add(b3);
        buttons.add(temp1);
        ArrayList<ImageButton> temp2 = new ArrayList<>();
        temp2.add(b4);
        temp2.add(b5);
        temp2.add(b6);
        buttons.add(temp2);
        ArrayList<ImageButton> temp3 = new ArrayList<>();
        temp3.add(b7);
        temp3.add(b8);
        temp3.add(b9);
        buttons.add(temp3);

        initgame();

        home.setOnClickListener(view->{
            Intent i = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
            finish();
        });

        retry.setOnClickListener(view->initgame());

        for(int i=0; i<3; i++)
        {    for(int j=0; j<3; j++)
            {
                int finalJ = j;
                int finalI = i;

                buttons.get(i).get(j).setOnClickListener(view -> {

                    for (int k = 0; k < 3; k++)
                    {
                        if (color.get(finalI * 3 + k) == level && k != finalJ) //row
                        {
                            color.set(finalI * 3 + k, 0);
                        }

                        else if(k!= finalJ)
                        {
                            color.set(finalI * 3 + k, color.get(finalI * 3 + k) + 1);
                        }

                        if (color.get(k * 3 + finalJ) == level) //column 1 to 0
                        {
                            color.set(k * 3 + finalJ, 0);
                        }

                        else //0 to 1
                        {
                            color.set(k * 3 + finalJ, color.get(k * 3 + finalJ) + 1);
                        }

                        if(k != finalJ) //same row other than the button color change
                        {
                            colorchange(buttons.get(finalI).get(k), color.get(finalI * 3 + k));
                        }

                        //all col buttons color change including the button clicked
                        colorchange(buttons.get(k).get(finalJ),color.get(k * 3 + finalJ));

                    }

                    boolean flag=checkfinish();

                    if(flag)
                    {
                        Intent in=new Intent(getApplicationContext(),next.class);
                        startActivity(in);
                        finish();
                    }
                });

            }

        }

    }

    public boolean checkfinish() {
    int sum=color.get(0);

        for(int j=1; j<9; j++)
              if(color.get(j)!=sum)
                  return false;

        return true;

    }

    public void initgame()
    {

        if(level==1) {
            color.clear();
            color.add(0);
            color.add(0);
            color.add(1);
            color.add(1);
            color.add(0);
            color.add(0);
            color.add(0);
            color.add(1);
            color.add(0);
        }

        if(level==2)
        {
            color.clear();
            color.add(1);
            color.add(0);
            color.add(2);
            color.add(1);
            color.add(2);
            color.add(0);
            color.add(2);
            color.add(0);
            color.add(0);
        }

        if(level==3)
        {
            color.clear();
            color.add(2);
            color.add(1);
            color.add(0);
            color.add(1);
            color.add(0);
            color.add(0);
            color.add(0);
            color.add(0);
            color.add(3);
        }

        for(int i=0; i<3;i++)
        {
            for(int j=0; j<3; j++)
            {
                colorchange(buttons.get(i).get(j),color.get(i*3+j));
            }
        }
    }


    public void colorchange(ImageButton imb, int i) {
        switch(i)
        {
            case 0: imb.setImageResource(R.drawable.sqbg1);
                break;
            case 1: imb.setImageResource(R.drawable.sqbg2);
                break;
            case 2: imb.setImageResource(R.drawable.sqbg3);
                break;
            case 3: imb.setImageResource(R.drawable.sqbg4);
                break;
        }

    }


}