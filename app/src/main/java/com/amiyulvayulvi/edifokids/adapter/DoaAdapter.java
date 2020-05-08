package com.amiyulvayulvi.edifokids.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.amiyulvayulvi.edifokids.DetailDoaActivity;
import com.amiyulvayulvi.edifokids.DetailKisahNabiActivity;
import com.amiyulvayulvi.edifokids.R;
import com.amiyulvayulvi.edifokids.model.Doa;
import com.amiyulvayulvi.edifokids.model.Nabi;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DoaAdapter extends RecyclerView.Adapter<DoaAdapter.ViewHolder>{
    private Context context;
    private ArrayList<Doa> listDoa;

    public DoaAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Doa> getListDoa() {
        return listDoa;
    }

    public void setListDoa(ArrayList<Doa> listDoa) {
        this.listDoa = listDoa;
    }

    @NonNull
    @Override
    public DoaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_doa,viewGroup,false);
        return new DoaAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DoaAdapter.ViewHolder viewHolder, int i) {
        viewHolder.namaDoa.setText(getListDoa().get(i).getNamaDoa());
    }

    @Override
    public int getItemCount() {
        return getListDoa().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.nama_doa)
        TextView namaDoa;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int post = getAdapterPosition();
                    Intent intent = new Intent(context , DetailDoaActivity.class);
                    intent.putExtra("namaDoa", getListDoa().get(post).getNamaDoa());
                    intent.putExtra("photoDoa",getListDoa().get(post).getPhoto());
                    intent.putExtra("suaraDoa",getListDoa().get(post).getSuara());

                    context.startActivity(intent);
                }
            });
        }
    }
}
