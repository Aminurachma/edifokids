package com.amiyulvayulvi.edifokids;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailDoaActivity extends AppCompatActivity {

    @BindView(R.id.detail_nama)
    TextView detailnamaDoa;


    @BindView(R.id.detail_photo)
    ImageView detailPhoto;

    @BindView(R.id.sound)
    FloatingActionButton suaraDoa;

   MediaPlayer mediaPlayer;

    @Override
    public void onBackPressed() {
        if (mediaPlayer.isPlaying())
        {
            mediaPlayer.stop();
        }
        super.onBackPressed();
    }



    @Nullable



    @Override
    public Intent getSupportParentActivityIntent() {
        if (mediaPlayer.isPlaying())
        {
            mediaPlayer.stop();
        }
        return super.getSupportParentActivityIntent();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_doa);

        ButterKnife.bind(this);

        Intent intent = getIntent();
        String namaaDoa = intent.getExtras().getString("namaDoa");
        int photooDoa = intent.getExtras().getInt("photoDoa");
        int suaraaDoa = intent.getExtras().getInt("suaraDoa");

        mediaPlayer = MediaPlayer.create(this,suaraaDoa);

        suaraDoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        detailnamaDoa.setText(namaaDoa);
        Glide.with(this)
                .load(photooDoa)
                .into(detailPhoto);

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(namaaDoa);
        }



    }
}
