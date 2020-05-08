package com.amiyulvayulvi.edifokids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.kisahnabi)
    Button kisahNabii;

    @BindView(R.id.asmaulhusna)
    Button asmaulHusnaa;

    @BindView(R.id.doapendek)
    Button doaPendekk;

    @BindView(R.id.txkisah)
    TextView txkisahNabii;

    @BindView(R.id.txasmaul)
    TextView txasmaulHusnaa;

    @BindView(R.id.txdoa)
    TextView txdoaPendekk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        kisahNabii.setOnClickListener(this);
        asmaulHusnaa.setOnClickListener(this);
        doaPendekk.setOnClickListener(this);
        txasmaulHusnaa.setOnClickListener(this);
        txdoaPendekk.setOnClickListener(this);
        txkisahNabii.setOnClickListener(this);


        }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.txkisah:
                Intent kisahIntent = new Intent(MainActivity.this,KisahNabiActivity.class);
                startActivity(kisahIntent);
                break;
            case R.id.txasmaul:
                Intent asmaulIntent = new Intent(MainActivity.this,AsmaulHusnaActivity.class);
                startActivity(asmaulIntent);
                break;
            case R.id.txdoa:
                Intent doaIntent = new Intent(MainActivity.this,DoaPendekActivity.class);
                startActivity(doaIntent);
                break;
            case R.id.kisahnabi:
                Intent kisahhIntent = new Intent(MainActivity.this,KisahNabiActivity.class);
                startActivity(kisahhIntent);
                break;
            case R.id.asmaulhusna:
                Intent asmaullIntent = new Intent(MainActivity.this,AsmaulHusnaActivity.class);
                startActivity(asmaullIntent);
                break;
            case R.id.doapendek:
                Intent doaaIntent = new Intent(MainActivity.this,DoaPendekActivity.class);
                startActivity(doaaIntent);
                break;


        }
    }
}


