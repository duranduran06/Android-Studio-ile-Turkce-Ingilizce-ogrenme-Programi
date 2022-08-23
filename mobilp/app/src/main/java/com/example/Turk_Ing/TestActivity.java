package com.example.Turk_Ing;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Random;

public class TestActivity extends AppCompatActivity {


    private test eleman=new test();
    private String cevap;
    private int skortablo=0;
    Random r;
    private int soruuzunluk=eleman.sorular.length;
    private TextView skor,soru;
    private Button cevapa,cevapb,cevapc,cevapd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        r=new Random();
        skor=findViewById(R.id.skor);
        soru=findViewById(R.id.soru);
        cevapa=findViewById(R.id.buttonA);
        cevapb=findViewById(R.id.buttonB);
        cevapc=findViewById(R.id.buttonC);
        cevapd=findViewById(R.id.buttonD);

        sorugüncelle(r.nextInt(soruuzunluk));
        skor.setText("SKOR= "+skortablo);

        cevapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cevapa.getText()==cevap)
                {
                    skortablo++;
                    skor.setText("SKOR= "+skortablo);
                    sorugüncelle(r.nextInt(soruuzunluk));

                }
                else
                {
                    gameover();
                }

            }
        });

        cevapb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cevapb.getText()==cevap)
                {
                    skortablo++;
                    skor.setText("SKOR= "+skortablo);
                    sorugüncelle(r.nextInt(soruuzunluk));

                }
                else
                {
                    gameover();
                }

            }
        });

        cevapc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cevapc.getText()==cevap)
                {
                    skortablo++;
                    skor.setText("SKOR= "+skortablo);
                    sorugüncelle(r.nextInt(soruuzunluk));

                }
                else
                {
                    gameover();
                }
            }
        });

        cevapd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cevapd.getText()==cevap)
                {
                    skortablo++;
                    skor.setText("SKOR= "+skortablo);
                    sorugüncelle(r.nextInt(soruuzunluk));

                }
                else
                {
                    gameover();
                }
            }
        });
    }
    public void sorugüncelle(int num){

        soru.setText(eleman.getsoru(num));
        cevapa.setText(eleman.getsecim1(num));
        cevapb.setText(eleman.getsecim2(num));
        cevapc.setText(eleman.getsecim3(num));
        cevapd.setText(eleman.getsecim4(num));
        cevap=eleman.getdoğrucevap(num);
    }
    private void gameover(){
        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(TestActivity.this);
        alertDialogBuilder.setMessage("GAME OVER SKOR= "+skortablo+"puan")
                .setCancelable(false)
                .setPositiveButton("YENİ OYUN", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(getApplicationContext(),TestActivity.class));
                        finish();
                    }
                })
        .setNegativeButton("ÇIKIŞ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alertDialog=alertDialogBuilder.create();
        alertDialog.show();

    }

}