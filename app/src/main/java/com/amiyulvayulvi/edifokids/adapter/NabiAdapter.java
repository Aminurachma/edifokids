package com.amiyulvayulvi.edifokids.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.amiyulvayulvi.edifokids.DetailKisahNabiActivity;
import com.amiyulvayulvi.edifokids.R;
import com.amiyulvayulvi.edifokids.model.Nabi;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NabiAdapter extends RecyclerView.Adapter<NabiAdapter.ViewHolder>{

    private Context context;
    private ArrayList<Nabi> listNabi;

    public NabiAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Nabi> getListNabi() {
        return listNabi;
    }

    public void setListNabi(ArrayList<Nabi> listNabi) {
        this.listNabi = listNabi;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_nabi,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.noNabi.setText(getListNabi().get(i).getNoNabi());
        viewHolder.namaNabi.setText(getListNabi().get(i).getNamaNabi());
    }

    @Override
    public int getItemCount() {
        return getListNabi().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.no_nabi)
        TextView noNabi;

        @BindView(R.id.nama_nabi)
        TextView namaNabi;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int post = getAdapterPosition();
                    Intent intent = new Intent(context , DetailKisahNabiActivity.class);
                    intent.putExtra("nama", getListNabi().get(post).getNamaNabi());
                    intent.putExtra("kisah", getListNabi().get(post).getKisahNabi());
                    context.startActivity(intent);
                }
            });
        }
    }

}
