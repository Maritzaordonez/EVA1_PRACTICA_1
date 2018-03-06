package edu.tectii.eva1_practica_1;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

public class PrincipalActivity extends AppCompatActivity implements View.OnClickListener {
    boolean play = false;
    RadioButton rb1, rb2,rb3;
    FragmentManager manager;
    FragmentTransaction transaction;
    audioFragment audio;
    imagenFragment imagen;
    textoFragment texto;
    MediaPlayer media;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        rb1 = (RadioButton)findViewById(R.id.rb1);
        rb2 = (RadioButton)findViewById(R.id.rb2);
        rb3 = (RadioButton)findViewById(R.id.rb3);
        manager = getSupportFragmentManager();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rb1:
                transaction = manager.beginTransaction();
                texto = new textoFragment();
                transaction.replace(R.id.frag, texto);
                transaction.commit();
                if (play == true){
                    media.stop();}

                break;
            case R.id.rb2:
                transaction = manager.beginTransaction();
                imagen = new imagenFragment();
                transaction.replace(R.id.frag, imagen);
                transaction.commit();
                if (play == true){
                    media.stop();}
                break;

            case R.id.rb3:
                transaction = manager.beginTransaction();
                audio = new audioFragment();
                transaction.replace(R.id.frag, audio);
                transaction.commit();
                play= true;
                media = MediaPlayer.create(this, R.raw.aerosmith_crazy);
                media.start();
                break;
        }

    }

}
