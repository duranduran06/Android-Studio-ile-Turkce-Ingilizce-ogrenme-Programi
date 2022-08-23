package com.example.Turk_Ing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

import java.util.Locale;

public class telaffuzActivity extends AppCompatActivity {
    private TextToSpeech mtts;
    private EditText editText;
    private SeekBar sekbarkalınince;
    private SeekBar sekbarspeed;
    private Button mbuttonspeak;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telaffuz);
        mbuttonspeak=findViewById(R.id.button2);
        mtts=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status==TextToSpeech.SUCCESS)
                {
                    int result=mtts.setLanguage(Locale.ENGLISH);
                    if(result==TextToSpeech.LANG_MISSING_DATA||result==TextToSpeech.LANG_NOT_SUPPORTED)
                    {
                        Log.e("TTS","Dil yok veya desteklenmıyor");
                    }
                    else{
                        mbuttonspeak.setEnabled(true);
                    }

                }
                else
                {
                    Log.e("TTS","başarısız");
                }
            }
        });
        editText=findViewById(R.id.edit);
        sekbarkalınince=findViewById(R.id.seekBar5);
        sekbarspeed=findViewById(R.id.seekBar6);
        mbuttonspeak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speak();
            }
        });
    }
    private void speak()
    {String text=editText.getText().toString();
        float pitch=(float) sekbarkalınince.getProgress()/50;
        if(pitch<0.1) pitch=0.1f;
        float speed=(float) sekbarspeed.getProgress()/50;
        if(speed<0.1) speed=0.1f;

        mtts.setPitch(pitch);
        mtts.setSpeechRate(speed);
        mtts.speak(text,TextToSpeech.QUEUE_FLUSH,null);
    }
    protected void onDestroy() {
        if(mtts!=null)
        {mtts.stop();
            mtts.shutdown();
        }
        super.onDestroy();
    }
}