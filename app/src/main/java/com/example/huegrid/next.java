package com.example.huegrid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class next extends AppCompatActivity {

    ImageView home, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        home=findViewById(R.id.home);
        next=findViewById(R.id.next);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),level2.class);
                startActivity(in);
                finish();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                static1.chosenlevel=static1.chosenlevel+1;
                gotolevel(static1.chosenlevel);
            }
        });
    }

    public void gotolevel(int i) {
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
}