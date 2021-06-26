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

public class triangle extends AppCompatActivity {
    ImageButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    ArrayList<Integer> color;
    ArrayList<ImageButton> buttons;
    int level,level2;
    TextView lev;
    ImageView back, retry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
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
            color = new ArrayList<>();
            buttons = new ArrayList<>();
            level2=static1.chosenlevel;
            level=level2/2-7;
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
            for(int i=0; i<9; i++)
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
                                    break;

                            case 5: color.set(4,(color.get(4)==level)?0:color.get(4)+1);
                                    color.set(1,(color.get(1)==level)?0:color.get(1)+1);
                                    color.set(6,(color.get(6)==level)?0:color.get(6)+1);
                                    break;

                            case 6: color.set(5,(color.get(5)==level)?0:color.get(5)+1);
                                    color.set(7,(color.get(7)==level)?0:color.get(7)+1);
                                    break;

                            case 7: color.set(3,(color.get(3)==level)?0:color.get(3)+1);
                                    color.set(6,(color.get(6)==level)?0:color.get(6)+1);
                                    color.set(8,(color.get(8)==level)?0:color.get(8)+1);
                                    break;

                            case 8: color.set(7,(color.get(7)==level)?0:color.get(7)+1);
                                    break;
                        }

                        for(int k=0; k<9; k++)
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
        if(level2==16) {
            color.clear();
            color.add(1);
            color.add(1);
            color.add(0);
            color.add(1);
            color.add(1);
            color.add(1);
            color.add(0);
            color.add(0);
            color.add(1);
        }

        if(level2==17) {
            lev.setText("Level 17");
            color.clear();
            color.add(1);
            color.add(0);
            color.add(1);
            color.add(1);
            color.add(1);
            color.add(0);
            color.add(0);
            color.add(0);
            color.add(1);
        }

        if(level2==18)
        {
            lev.setText("Level 18");
            color.clear();
            /*Tough*/
            color.add(1);
            color.add(2);
            color.add(0);
            color.add(2);
            color.add(1);
            color.add(0);
            color.add(0);
            color.add(1);
            color.add(2);
        }

        if(level2==19)
        {
            lev.setText("Level 19");
            color.clear();
            color.add(2);
            color.add(0);
            color.add(1);
            color.add(0);
            color.add(1);
            color.add(0);
            color.add(0);
            color.add(1);
            color.add(2);
        }

        if(level2==20)
        {
            lev.setText("Level 20");
            color.clear();
            color.add(1);
            color.add(3);
            color.add(3);
            color.add(2);
            color.add(1);
            color.add(2);
            color.add(0);
            color.add(3);
            color.add(0);
        }

        if(level2==21)
        {
            lev.setText("Level 21");
            color.clear();
            color.add(1);
            color.add(3);
            color.add(0);
            color.add(3);
            color.add(1);
            color.add(2);
            color.add(0);
            color.add(0);
            color.add(0);
        }

        for(int i=0; i<9;i++)
        {
            colorchange(buttons.get(i),color.get(i),i);
        }
    }

    public void colorchange(ImageButton imb, int i, int j) {
        if(j==2||j==5||j==7)
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
            }
        }

    }

    public boolean checkfinish()
    {
        int sum=color.get(0);

        for(int j=1; j<9; j++)
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
