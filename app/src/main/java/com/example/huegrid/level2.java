package com.example.huegrid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class level2 extends AppCompatActivity {
    ImageView iv;
    TextView b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
    boolean page=true;
    ArrayList<TextView> levelButtons;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        try
        {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);
        iv=findViewById(R.id.nextpage);
        b1=findViewById(R.id.b13);
        b2=findViewById(R.id.b14);
        b3=findViewById(R.id.b15);
        b4=findViewById(R.id.b16);
        b5=findViewById(R.id.b17);
        b6=findViewById(R.id.b18);
        b7=findViewById(R.id.b19);
        b8=findViewById(R.id.b20);
        b9=findViewById(R.id.b21);
        b10=findViewById(R.id.b22);
        b11=findViewById(R.id.b23);
        b12=findViewById(R.id.b24);
        b13=findViewById(R.id.b25);

        levelButtons = new ArrayList<TextView>();
        levelButtons.add(b1);
        levelButtons.add(b2);
        levelButtons.add(b3);
        levelButtons.add(b4);
        levelButtons.add(b5);
        levelButtons.add(b6);
        levelButtons.add(b7);
        levelButtons.add(b8);
        levelButtons.add(b9);
        levelButtons.add(b10);
        levelButtons.add(b11);
        levelButtons.add(b12);

            for (int i = 0; i<12;i++)
            {
                int finalI = i;
                levelButtons.get(i).setOnClickListener(new View.OnClickListener()
                {
                     @Override
                     public void onClick(View view)
                     {
                     if(page)
                     {
                          gotoLevel(finalI +1);
                     }
                     else
                     {
                          gotoLevel(finalI + 13);
                     }

                }
                });
            }

            iv.setOnClickListener(new View.OnClickListener()
            {
            @Override
            public void onClick(View v)
            {
                b1.setText("13");
                b2.setText("14");
                b3.setText("15");
                b4.setText("16");
                b5.setText("17");
                b6.setText("18");
                b7.setText("19");
                b8.setText("20");
                b9.setText("21");
                b10.setText("22");
                b11.setText("23");
                b12.setText("24");
                b13.setText("25");
                page = false;

                View namebar = v.findViewById(R.id.nextpage);
                ViewGroup parent = (ViewGroup) namebar.getParent();
                if (parent != null)
                {
                    parent.removeView(namebar);
                }

                b13.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        gotoLevel(25);
                    }
                });
            }
        });

    }
        catch(Exception e)
        {
            Toast.makeText(this, e.toString(), Toast.LENGTH_LONG).show();
        }
    }

    public void gotoLevel(int i)
    {
        static1.chosenlevel=i;
        Toast.makeText(this, "Level "+static1.chosenlevel, Toast.LENGTH_SHORT).show();

        if(i<4)
        {
            Intent intent=new Intent(getApplicationContext(),square.class);
            startActivity(intent);
            finish();
        }

        else if(i<10)
        {
            Intent intent=new Intent(getApplicationContext(),square2.class);
            startActivity(intent);
            finish();
        }

        else if(i<16)
        {
            Intent intent=new Intent(getApplicationContext(),square3.class);
            startActivity(intent);
            finish();
        }

        else if(i<20)
        {
            Intent intent=new Intent(getApplicationContext(),triangle.class);
            startActivity(intent);
            finish();
        }

        else
        {
            Intent intent=new Intent(getApplicationContext(),rhombus.class);
            startActivity(intent);
            finish();
        }
    }

    public void onBackPressed()
    {
        try {

            super.onBackPressed();
            Intent i;

            if(page)
                i = new Intent(getApplicationContext(),MainActivity.class);
            else
                i = new Intent(getApplicationContext(),level2.class);

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