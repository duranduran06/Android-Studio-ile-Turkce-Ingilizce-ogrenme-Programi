package com.example.Turk_Ing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompatSideChannelService;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class oyunActivity extends AppCompatActivity {

    ImageView curview=null;
    private int countpair=0;
    final int[] drawable=new int[]{R.drawable.airplane,R.drawable.ball,R.drawable.book,R.drawable.car,R.drawable.child
            ,R.drawable.computer,R.drawable.pencil,R.drawable.table,R.drawable.uacak,R.drawable.top,R.drawable.kitap,R.drawable.araba
            ,R.drawable.cc,R.drawable.bilgisayar,R.drawable.kalem,R.drawable.masa
    };
   //int [] pos={0,1,2,3,4,5,6,7,0,1,2,3,4,5,6,7};
   int [] pos={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    int currentPos=-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyun);
        GridView gridView=(GridView) findViewById(R.id.grid);
        oyunresim eleman=new oyunresim(this);
        gridView.setAdapter(eleman);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(currentPos<0)
                {
                    currentPos=position;
                    curview=(ImageView) view;
                    ((ImageView)view).setImageResource(drawable[pos[position]]);
                }
                else
                {
                    System.out.println("en bastayız"+currentPos);
                    System.out.println("en bastayız"+position);
                    if(currentPos<=7)
                        currentPos+=8;
                    else if (currentPos>7)
                        currentPos-=8;

                    if(pos[currentPos]==pos[position])
                    {
                        ((ImageView)view).setImageResource(drawable[pos[position]]);


                    }
                    else if(pos[currentPos]!=pos[position])
                    {
                        curview.setImageResource(R.drawable.sorui);
                        Toast.makeText(oyunActivity.this, "YANLIŞ EŞLEŞME", Toast.LENGTH_SHORT).show();
                        System.out.println("eşit degıldeyım");
                    }
                    else
                    {
                        ((ImageView)view).setImageResource(drawable[pos[position]]);
                        countpair++;
                        if(countpair==0)
                        {
                            Toast.makeText(oyunActivity.this, "kazandın", Toast.LENGTH_SHORT).show();
                        }
                    }
                    currentPos=-1;
                    System.out.println("en sondayım");
                }
            }
        });
    }
}