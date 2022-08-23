package com.example.Turk_Ing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class HikayeActivity extends AppCompatActivity {
   private RadioGroup grup;
   public int durum;
   MediaPlayer player;
   private TextView text;
   private Button play,pause,rest;
   private SeekBar bar;
   Handler handler=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hikaye);
        grup = findViewById(R.id.radioGroup);
        text = findViewById(R.id.textView);
        play = findViewById(R.id.button);
        pause = findViewById(R.id.button3);
        rest = findViewById(R.id.button4);
        bar = findViewById(R.id.seekBar);
        grup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton) {
                    stopplayer();
                    durum = 1;
                    text.setText("Sara Smith, a Pasadena resident, went shopping. She is 30, and has lived at 3037 N. Foothill Street since 1992. Sara has been married to John for seven years. They have two children; Bob is five years old and Nancy is three. Sara owns a 1995 four-door blue Toyola. At 9 a.m., Sara got into her car and drove to Barget, a department store a mile away.\n" +
                            "\n" +
                            "Barget was having a holiday sale. Sara bought a four-slice toaster for $29.95 plus tax. The regular price was $39.95. She paid by check. On her way home, Sara stopped at MilkPlus to buy a gallon of nonfat milk. The milk was $3.50. Sara got 50 cents back in change.\n" +
                            "\n" +
                            "Sara arrived home at 10 a.m. John and the kids were still sleeping. She woke them up and then made a hot and nutritious breakfast for everyone\n");


                    SpannableString ss = new SpannableString(text.getText());
                    ClickableSpan clickableSpan = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            Toast.makeText(HikayeActivity.this, "YERLEŞİK", Toast.LENGTH_SHORT).show();
                        }
                    };
                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            Toast.makeText(HikayeActivity.this, "CADDE", Toast.LENGTH_SHORT).show();
                        }
                    };
                    ClickableSpan clickableSpan3 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            Toast.makeText(HikayeActivity.this, "EVLİ", Toast.LENGTH_SHORT).show();
                        }
                    };
                    ClickableSpan clickableSpan4 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            Toast.makeText(HikayeActivity.this, "BÖLÜM", Toast.LENGTH_SHORT).show();
                        }
                    };
                    ClickableSpan clickableSpan5 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            Toast.makeText(HikayeActivity.this, "TATİL", Toast.LENGTH_SHORT).show();
                        }
                    };
                    ClickableSpan clickableSpan6 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            Toast.makeText(HikayeActivity.this, "SATIN ALMAK", Toast.LENGTH_SHORT).show();
                        }
                    };
                    ClickableSpan clickableSpan7 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            Toast.makeText(HikayeActivity.this, "DÜZENLİ", Toast.LENGTH_SHORT).show();
                        }
                    };
                    ClickableSpan clickableSpan8 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            Toast.makeText(HikayeActivity.this, "GERİ DEĞİŞİKLİK", Toast.LENGTH_SHORT).show();
                        }
                    };
                    ClickableSpan clickableSpan9 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            Toast.makeText(HikayeActivity.this, "YAĞSIZ", Toast.LENGTH_SHORT).show();
                        }
                    };
                    ClickableSpan clickableSpan10 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            Toast.makeText(HikayeActivity.this, "GERİ DEĞİŞİKLİK", Toast.LENGTH_SHORT).show();
                        }
                    };
                    ClickableSpan clickableSpan11 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            Toast.makeText(HikayeActivity.this, "UYUYOR", Toast.LENGTH_SHORT).show();
                        }
                    };
                    ClickableSpan clickableSpan12 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            Toast.makeText(HikayeActivity.this, "KAHVALTI", Toast.LENGTH_SHORT).show();
                        }
                    };
                    ss.setSpan(clickableSpan, 23, 31, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss.setSpan(clickableSpan2, 93, 99, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss.setSpan(clickableSpan3, 126, 133, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss.setSpan(clickableSpan4, 321, 331, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss.setSpan(clickableSpan5, 372, 380, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss.setSpan(clickableSpan6, 390, 397, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss.setSpan(clickableSpan7, 444, 450, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss.setSpan(clickableSpan8, 600, 616, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss.setSpan(clickableSpan9, 549, 556, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss.setSpan(clickableSpan10, 600, 616, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss.setSpan(clickableSpan11, 675, 683, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss.setSpan(clickableSpan12, 738, 748, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    text.setText(ss);
                    text.setMovementMethod(LinkMovementMethod.getInstance());

                }
                else if (checkedId == R.id.radioButton2) {
                    stopplayer();
                    durum = 2;
                    text.setText("A 79-year-old man was slightly injured on Saturday while waiting in his brand new convertible in a drive-through lane at Burger Prince restaurant. Herman Sherman of Northville suffered a mild burn about 9:00 p.m. when a young female employee accidentally spilled a cup of coffee into his lap. Sherman said the coffee was hot but not scalding.\n" +
                            "\n" +
                            "He refused medical aid, saying the only problem was the stain on his slacks, but it would wash out. He was given a fresh refill. Before Sherman drove off, the restaurant manager, John Johnson, gave him two free gift certificates--one for an extra-large coffee and one for the restaurant's newest sandwich, the McRap.\n" +
                            "\n" +
                            "The employee, who was a new hire, was let go later that evening. She was quite upset. She said she would probably sue Burger Prince for letting her go. She said it was the man's fault for ordering something that she might be able to spill.");

                    SpannableString ss = new SpannableString(text.getText());
                    ClickableSpan clickableSpan = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            Toast.makeText(HikayeActivity.this, "MARKA", Toast.LENGTH_SHORT).show();
                        }
                    };
                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            Toast.makeText(HikayeActivity.this, "RESTORAN", Toast.LENGTH_SHORT).show();
                        }
                    };
                    ClickableSpan clickableSpan3 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            Toast.makeText(HikayeActivity.this, "GENÇ", Toast.LENGTH_SHORT).show();
                        }
                    };
                    ClickableSpan clickableSpan4 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            Toast.makeText(HikayeActivity.this, "SÖYLEDİ", Toast.LENGTH_SHORT).show();
                        }
                    };
                    ClickableSpan clickableSpan5 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            Toast.makeText(HikayeActivity.this, "REDDETTİ", Toast.LENGTH_SHORT).show();
                        }
                    };
                    ss.setSpan(clickableSpan, 72, 77, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss.setSpan(clickableSpan2, 135, 145, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss.setSpan(clickableSpan3, 220, 225, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss.setSpan(clickableSpan4, 301, 306, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss.setSpan(clickableSpan5, 346, 354, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    text.setText(ss);
                    text.setMovementMethod(LinkMovementMethod.getInstance());


                }

            }
        });

    }

    public void play(View view)
    {
        if(player==null)//içi boş ise oluştur
        {
            if(durum==1)
            {    player=MediaPlayer.create(this,R.raw.storyone);//player ıcını doldurdum
                //altın yaptıgı görev şarkı bıttıgınde sonunu yaklamak ve durdurmak
                player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        stopplayer();
                    }
                });}
            else if(durum==2)
            {
                player=MediaPlayer.create(this,R.raw.storytwo);//player ıcını doldurdum
                //altın yaptıgı görev şarkı bıttıgınde sonunu yaklamak ve durdurmak
                player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        stopplayer();
                    }
                });
            }

        }
        player.start();
        bar.setMax(player.getDuration());//muzık kadar gıtsın bar
        UpdateBar guncelle=new UpdateBar();//sürekli barı güncelle
        handler.post(guncelle);
        bar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(player!=null) {//müzik varsa sardırma yapabılır
                    if (fromUser)
                        player.seekTo(progress);
                }
                else//yoksa hep 0 da kal
                {
                    bar.setProgress(0);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    public void pause(View view)
    {
        if(player!=null)//daha önce başlatıldıysa içinde veri varsa
        {
            player.pause();
        }
    }
    public void rest(View view)
    {stopplayer();}

    public void stopplayer()
    {
        if(player!=null)//içi dolu ise
        {

            player.release();
            player=null;
            Toast.makeText(this, "TEKRAR HİKAYE SEÇİN", Toast.LENGTH_SHORT).show();
            UpdateBar guncelle2=new UpdateBar();
            handler.post(guncelle2);
        }
    }
    public class UpdateBar implements Runnable
    {


        @Override
        public void run() {
            if(player!=null) {//içi boşmu dıye bakmazsan patlıyo stop yapınca içini null yaptıgım ıcın
                bar.setProgress(player.getCurrentPosition());
                handler.postDelayed(this, 100);
            }
            else
            {
                bar.setProgress(0);
            }
        }
    }
}