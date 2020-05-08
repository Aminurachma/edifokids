package com.amiyulvayulvi.edifokids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailKisahNabiActivity extends AppCompatActivity {

    @BindView(R.id.detail_nama)
    TextView detailNama;
    @BindView(R.id.detail_kisah)
    TextView detailKisah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kisah_nabi);

        ButterKnife.bind(this);

        Intent intent = getIntent();
        String namaNabi = intent.getExtras().getString("nama");
        String kisahNabi = intent.getExtras().getString("kisah");

        detailNama.setText(namaNabi);
        detailKisah.setText(kisahNabi);

        if (getSupportActionBar() != null ){
            getSupportActionBar().setTitle(namaNabi);
        }

    }
}
