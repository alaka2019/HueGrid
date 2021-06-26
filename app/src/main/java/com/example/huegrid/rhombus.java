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

public class rhombus extends AppCompatActivity {
    ImageButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18;
    ArrayList<Integer> color;
    ArrayList<ImageButton> buttons;
    int level;
    TextView lev;
    ImageView back, retry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhombus);
        try
        {
            b1 = findViewById(R.id.b1);
            b2 = findViewById(R.id.b2);
            b3 = findViewById(R.id.b3);
            b4 = findViewById(R.id.b4);
            b5 = findViewById(R.id.b5);
            b6 = findViewById(R.id.b6);
            b7 = findViewById(R.id.b7);
            b8 = findViewById(R.id.b8);
            b9 = findViewById(R.id.b9);
            b10 = findViewById(R.id.b10);
            b11 = findViewById(R.id.b11);
            b12 = findViewById(R.id.b12);
            b13 = findViewById(R.id.b13);
            b14 = findViewById(R.id.b14);
            b15 = findViewById(R.id.b15);
            b16 = findViewById(R.id.b16);
            b17 = findViewById(R.id.b17);
            b18 = findViewById(R.id.b18);

            color = new ArrayList<>();
            buttons = new ArrayList<>();
            level=static1.chosenlevel-21;
            lev=findViewById(R.id.level);
            back=findViewById(R.id.back);
            retry=findViewById(R.id.retry);

            buttons.add(b1);
            buttons.add(b2);
            buttons.add(b3);
            buttons.add(b4);
            buttons.add(b5);
            buttons.add(b6);
            buttons.add(b7);
            buttons.add(b8);
            buttons.add(b9);
            buttons.add(b10);
            buttons.add(b11);
            buttons.add(b12);
            buttons.add(b13);
            buttons.add(b14);
            buttons.add(b15);
            buttons.add(b16);
            buttons.add(b17);
            buttons.add(b18);


            initgame();

            back.setOnClickListener(view->{
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                finish();
            });

            retry.setOnClickListener(view->initgame());
        }

        catch(Exception e)
        {
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }

        try
        {
            for(int i=0; i<18; i++)
            {
                int finalI = i;
                buttons.get(i).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        color.set(finalI,(color.get(finalI)==level)?0:color.get(finalI)+1);

                        switch(finalI)
                        {
                            case 0: color.set(2,(color.get(2)==level)?0:color.get(2)+1);
                                    break;

                            case 1: color.set(2,(color.get(2)==level)?0:color.get(2)+1);
                                    color.set(5,(color.get(5)==level)?0:color.get(5)+1);
                                    break;

                            case 2: color.set(0,(color.get(0)==level)?0:color.get(0)+1);
                                    color.set(1,(color.get(1)==level)?0:color.get(1)+1);
                                    color.set(3,(color.get(3)==level)?0:color.get(3)+1);
                                    break;

                            case 3: color.set(2,(color.get(2)==level)?0:color.get(2)+1);
                                    color.set(7,(color.get(7)==level)?0:color.get(7)+1);
                                    break;

                            case 4: color.set(5,(color.get(5)==level)?0:color.get(5)+1);
                                    color.set(9,(color.get(9)==level)?0:color.get(9)+1);
                                    break;

                            case 5: color.set(4,(color.get(4)==level)?0:color.get(4)+1);
                                    color.set(1,(color.get(1)==level)?0:color.get(1)+1);
                                    color.set(6,(color.get(6)==level)?0:color.get(6)+1);
                                    break;

                            case 6: color.set(5,(color.get(5)==level)?0:color.get(5)+1);
                                    color.set(7,(color.get(7)==level)?0:color.get(7)+1);
                                    color.set(11,(color.get(11)==level)?0:color.get(11)+1);
                                    break;

                            case 7: color.set(3,(color.get(3)==level)?0:color.get(3)+1);
                                    color.set(6,(color.get(6)==level)?0:color.get(6)+1);
                                    color.set(8,(color.get(8)==level)?0:color.get(8)+1);
                                    break;

                            case 8: color.set(7,(color.get(7)==level)?0:color.get(7)+1);
                                    color.set(13,(color.get(13)==level)?0:color.get(13)+1);
                                    break;

                            case 9: color.set(4,(color.get(4)==level)?0:color.get(4)+1);
                                    color.set(10,(color.get(10)==level)?0:color.get(10)+1);
                                    break;

                            case 10: color.set(9,(color.get(9)==level)?0:color.get(9)+1);
                                    color.set(11,(color.get(11)==level)?0:color.get(11)+1);
                                    color.set(14,(color.get(14)==level)?0:color.get(14)+1);
                                    break;

                            case 11: color.set(12,(color.get(12)==level)?0:color.get(12)+1);
                                    color.set(10,(color.get(10)==level)?0:color.get(10)+1);
                                    color.set(6,(color.get(6)==level)?0:color.get(6)+1);
                                    break;

                            case 12: color.set(11,(color.get(11)==level)?0:color.get(11)+1);
                                color.set(13,(color.get(13)==level)?0:color.get(13)+1);
                                color.set(16,(color.get(16)==level)?0:color.get(16)+1);
                                break;

                            case 13: color.set(8,(color.get(8)==level)?0:color.get(8)+1);
                                    color.set(12,(color.get(12)==level)?0:color.get(12)+1);
                                    break;

                            case 14: color.set(15,(color.get(15)==level)?0:color.get(15)+1);
                                    color.set(10,(color.get(10)==level)?0:color.get(10)+1);
                                    break;

                            case 15: color.set(14,(color.get(14)==level)?0:color.get(14)+1);
                                    color.set(17,(color.get(17)==level)?0:color.get(17)+1);
                                    color.set(16,(color.get(16)==level)?0:color.get(16)+1);
                                    break;

                            case 16: color.set(15,(color.get(15)==level)?0:color.get(15)+1);
                                    color.set(12,(color.get(12)==level)?0:color.get(12)+1);
                                    break;

                            case 17: color.set(15,(color.get(15)==level)?0:color.get(15)+1);
                                    break;

                        }

                        for(int k=0; k<18; k++)
                        {
                            colorchange(buttons.get(k),color.get(k),k);
                        }

                        boolean flag=checkfinish();

                        if(flag)
                        {
                            Intent in=new Intent(getApplicationContext(),next.class);
                            startActivity(in);
                            finish();
                        }

                    }
                });
            }
        }

        catch(Exception e)
        {
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }
    }

    public void initgame()
    {
        if(level==1) {
            color.clear();
            color.add(1);
            color.add(1);
            color.add(0);
            color.add(1);
            color.add(1);
            color.add(0);
            color.add(1);
            color.add(0);
            color.add(1);
            color.add(1);
            color.add(0);
            color.add(1);
            color.add(0);
            color.add(1);
            color.add(0);
            color.add(1);
            color.add(1);
            color.add(1);
        }

        if(level==2)
        {
            lev.setText("Level 23");
            color.clear();
            /*Tough*/
            color.add(2);
            color.add(0);
            color.add(1);
            color.add(2);
            color.add(1);
            color.add(0);
            color.add(1);
            color.add(0);
            color.add(2);
            color.add(0);
            color.add(1);
            color.add(1);
            color.add(2);
            color.add(0);
            color.add(0);
            color.add(1);
            color.add(1);
            color.add(2);
        }

        if(level==3)
        {
            lev.setText("Level 24");
            color.clear();
            color.add(1);
            color.add(3);
            color.add(3);
            color.add(3);
            color.add(3);
            color.add(3);
            color.add(2);
            color.add(3);
            color.add(1);
            color.add(3);
            color.add(2);
            color.add(2);
            color.add(1);
            color.add(1);
            color.add(2);
            color.add(1);
            color.add(1);
            color.add(0);
        }

        if(level==4)
        {
            lev.setText("Level 25");
            color.clear();
            color.add(4);
            color.add(0);
            color.add(3);
            color.add(2);
            color.add(4);
            color.add(0);
            color.add(3);
            color.add(2);
            color.add(0);
            color.add(3);
            color.add(0);
            color.add(1);
            color.add(2);
            color.add(4);
            color.add(4);
            color.add(2);
            color.add(3);
            color.add(1);
        }

        for(int i=0; i<18;i++)
        {
            colorchange(buttons.get(i),color.get(i),i);
        }
    }

    public void colorchange(ImageButton imb, int i, int j) {
        if(j==2||j==5||j==7||j==9||j==11||j==13||j==14||j==16||j==17)
        {
            switch (i) {
                case 0:
                    imb.setImageResource(R.drawable.bg11);
                    break;
                case 1:
                    imb.setImageResource(R.drawable.bg22);
                    break;
                case 2:
                    imb.setImageResource(R.drawable.bg33);
                    break;
                case 3:
                    imb.setImageResource(R.drawable.bg44);
                    break;
                case 4:
                    imb.setImageResource(R.drawable.bg55);
                    break;
            }
        }

        else
        {
            switch (i) {
                case 0:
                    imb.setImageResource(R.drawable.bg1);
                    break;
                case 1:
                    imb.setImageResource(R.drawable.bg2);
                    break;
                case 2:
                    imb.setImageResource(R.drawable.bg3);
                    break;
                case 3:
                    imb.setImageResource(R.drawable.bg4);
                    break;
                case 4:
                    imb.setImageResource(R.drawable.bg5);
                    break;
            }
        }

    }

    public boolean checkfinish()
    {
        int sum=color.get(0);

        for(int j=1; j<18; j++)
            if(color.get(j)!=sum)
                return false;

        return true;

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
