package com.example.huegrid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class square3 extends AppCompatActivity {
    ImageButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25;
    ImageView home, retry;
    int level, level2;
    TextView lev;
    ArrayList<Integer> color;
    ArrayList<ArrayList<ImageButton>> buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square3);
        level2=static1.chosenlevel;
        level=level2/2-4;
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b10=findViewById(R.id.b10);
        b11=findViewById(R.id.b11);
        b12=findViewById(R.id.b12);
        b13=findViewById(R.id.b13);
        b14=findViewById(R.id.b14);
        b15=findViewById(R.id.b15);
        b16=findViewById(R.id.b16);
        b17=findViewById(R.id.b17);
        b18=findViewById(R.id.b18);
        b19=findViewById(R.id.b19);
        b20=findViewById(R.id.b20);
        b21=findViewById(R.id.b21);
        b22=findViewById(R.id.b22);
        b23=findViewById(R.id.b23);
        b24=findViewById(R.id.b24);
        b25=findViewById(R.id.b25);
        home=findViewById(R.id.im2);
        retry=findViewById(R.id.im1);
        lev=findViewById(R.id.level1);
        color = new ArrayList<>();
        buttons= new ArrayList<>();
        ArrayList<ImageButton> temp1 = new ArrayList<>();
        temp1.add(b1);
        temp1.add(b2);
        temp1.add(b3);
        temp1.add(b4);
        temp1.add(b5);
        buttons.add(temp1);
        ArrayList<ImageButton> temp2 = new ArrayList<>();
        temp2.add(b6);
        temp2.add(b7);
        temp2.add(b8);
        temp2.add(b9);
        temp2.add(b10);
        buttons.add(temp2);
        ArrayList<ImageButton> temp3 = new ArrayList<>();
        temp3.add(b11);
        temp3.add(b12);
        temp3.add(b13);
        temp3.add(b14);
        temp3.add(b15);
        buttons.add(temp3);
        ArrayList<ImageButton> temp4 = new ArrayList<>();
        temp4.add(b16);
        temp4.add(b17);
        temp4.add(b18);
        temp4.add(b19);
        temp4.add(b20);
        buttons.add(temp4);
        ArrayList<ImageButton> temp5 = new ArrayList<>();
        temp5.add(b21);
        temp5.add(b22);
        temp5.add(b23);
        temp5.add(b24);
        temp5.add(b25);
        buttons.add(temp5);

        initgame();

        home.setOnClickListener(view->{
            Intent i = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
            finish();
        });

        retry.setOnClickListener(view->initgame());

        for(int i=0; i<5; i++)
        {    for(int j=0; j<5; j++)
        {
            int finalJ = j;
            int finalI = i;

            buttons.get(i).get(j).setOnClickListener(view -> {

                for (int k = 0; k < 5; k++)
                {
                    if (color.get(finalI * 5 + k) == level && k != finalJ) //row
                    {
                        color.set(finalI * 5 + k, 0);
                    }

                    else if(k!= finalJ)
                    {
                        color.set(finalI * 5 + k, color.get(finalI * 5 + k) + 1);
                    }

                    if (color.get(k * 5 + finalJ) == level) //column 1 to 0
                    {
                        color.set(k * 5 + finalJ, 0);
                    }

                    else //0 to 1
                    {
                        color.set(k * 5 + finalJ, color.get(k * 5 + finalJ) + 1);
                    }

                    if(k != finalJ) //same row other than the button color change
                    {
                        colorchange(buttons.get(finalI).get(k), color.get(finalI * 5 + k));
                    }

                    //all col buttons color change including the button clicked
                    colorchange(buttons.get(k).get(finalJ),color.get(k * 5 + finalJ));

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

        for(int j=1; j<25; j++)
            if(color.get(j)!=sum)
                return false;

        return true;

    }

    public void initgame()
    {
        if(level2==10) {
            color.clear();
            color.add(1);
            color.add(1);
            color.add(0);
            color.add(0);
            color.add(1);
            color.add(0);
            color.add(1);
            color.add(0);
            color.add(1);
            color.add(1);
            color.add(1);
            color.add(0);
            color.add(0);
            color.add(0);
            color.add(0);
            color.add(0);
            color.add(0);
            color.add(1);
            color.add(1);
            color.add(1);
            color.add(1);
            color.add(1);
            color.add(0);
            color.add(1);
            color.add(0);
        }

        if(level2==11) {
            lev.setText("Level 11`");
            color.clear();
            color.add(0);
            color.add(0);
            color.add(1);
            color.add(1);
            color.add(0);
            color.add(1);
            color.add(1);
            color.add(0);
            color.add(1);
            color.add(1);
            color.add(0);
            color.add(0);
            color.add(0);
            color.add(0);
            color.add(0);
            color.add(1);
            color.add(0);
            color.add(1);
            color.add(1);
            color.add(1);
            color.add(0);
            color.add(1);
            color.add(0);
            color.add(1);
            color.add(0);
        }

        if(level2==12)
        {
            lev.setText("Level 12");
            color.clear();
            color.add(1);
            color.add(0);
            color.add(2);
            color.add(0);
            color.add(1);
            color.add(0);
            color.add(1);
            color.add(0);
            color.add(2);
            color.add(0);
            color.add(2);
            color.add(2);
            color.add(1);
            color.add(2);
            color.add(2);
            color.add(1);
            color.add(1);
            color.add(1);
            color.add(2);
            color.add(0);
            color.add(0);
            color.add(2);
            color.add(0);
            color.add(1);
            color.add(0);
        }

        if(level2==13)
        {
            lev.setText("Level 13");
            color.clear();
            color.add(2);
            color.add(1);
            color.add(0);
            color.add(1);
            color.add(2);
            color.add(1);
            color.add(1);
            color.add(0);
            color.add(2);
            color.add(0);
            color.add(0);
            color.add(2);
            color.add(1);
            color.add(2);
            color.add(2);
            color.add(2);
            color.add(1);
            color.add(1);
            color.add(2);
            color.add(0);
            color.add(1);
            color.add(2);
            color.add(0);
            color.add(1);
            color.add(0);
        }

        if(level2==14)
        {
            lev.setText("Level 14");
            color.clear();
            color.add(1);
            color.add(0);
            color.add(1);
            color.add(1);
            color.add(0);
            color.add(0);
            color.add(2);
            color.add(1);
            color.add(3);
            color.add(1);
            color.add(0);
            color.add(2);
            color.add(0);
            color.add(2);
            color.add(3);
            color.add(1);
            color.add(1);
            color.add(2);
            color.add(0);
            color.add(3);
            color.add(1);
            color.add(2);
            color.add(3);
            color.add(1);
            color.add(0);
        }

        if(level2==15)
        {
            lev.setText("Level 15");
            color.clear();
            color.add(2);
            color.add(1);
            color.add(2);
            color.add(2);
            color.add(1);
            color.add(1);
            color.add(2);
            color.add(1);
            color.add(3);
            color.add(1);
            color.add(1);
            color.add(2);
            color.add(0);
            color.add(2);
            color.add(3);
            color.add(2);
            color.add(1);
            color.add(2);
            color.add(0);
            color.add(3);
            color.add(2);
            color.add(2);
            color.add(3);
            color.add(1);
            color.add(0);
        }

        for(int i=0; i<5;i++)
        {
            for(int j=0; j<5; j++)
            {
                colorchange(buttons.get(i).get(j),color.get(i*5+j));
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

    public void onBackPressed() {
        try {
            super.onBackPressed();
            Intent i = new Intent(getApplicationContext(),level2.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            finish();
        }
        catch (Exception e)
        {
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }
    }

}