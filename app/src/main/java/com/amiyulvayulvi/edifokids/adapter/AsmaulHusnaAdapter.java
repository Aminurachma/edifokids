package com.amiyulvayulvi.edifokids.adapter;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.amiyulvayulvi.edifokids.R;
import com.amiyulvayulvi.edifokids.model.AsmaulHusna;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AsmaulHusnaAdapter extends RecyclerView.Adapter<AsmaulHusnaAdapter.ViewHolder>{

    private Context context;
    private ArrayList<AsmaulHusna> listAsmaulHusna;

    public AsmaulHusnaAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<AsmaulHusna> getListAsmaulHusna() {
        return listAsmaulHusna;
    }

    public void setListAsmaulHusna(ArrayList<AsmaulHusna> listAsmaulHusna) {
        this.listAsmaulHusna = listAsmaulHusna;
    }

    @NonNull
    @Override
    public AsmaulHusnaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_asmaul_husna,viewGroup,false);
        return new AsmaulHusnaAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AsmaulHusnaAdapter.ViewHolder viewHolder, int i) {
        viewHolder.textAs.setText(getListAsmaulHusna().get(i).getNamaAS());
        viewHolder.artiAs.setText(getListAsmaulHusna().get(i).getArtiAS());
        Glide.with(context)
                .load(getListAsmaulHusna().get(i).getPhoto())
                .into(viewHolder.imgAs);
    }

    @Override
    public int getItemCount() {
        return getListAsmaulHusna().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.textas)
        TextView textAs;

        @BindView(R.id.artias)
        TextView artiAs;

        @BindView(R.id.imgas)
        ImageView imgAs;


        public ViewHolder(@NonNull final View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition();
//                    AlertDialog.Builder alertbox = new AlertDialog.Builder(v.getRootView().getContext());
//                    alertbox.setMessage(getListAsmaulHusna().get(pos).getArtiAS());
//                    alertbox.setTitle(getListAsmaulHusna().get(pos).getNamaAS());
//                    alertbox.setIcon(getListAsmaulHusna().get(pos).getPhoto());
//
//                    alertbox.setNeutralButton("OK",
//                            new DialogInterface.OnClickListener() {
//
//                                public void onClick(DialogInterface arg0,
//                                                    int arg1) {
//
//                                }
//                            });
//
//                    AlertDialog.Builder builder = new AlertDialog.Builder(context);
//                    ImageView img = v.findViewById(R.id.iv_icon);
//                    img.setImageResource(getListAsmaulHusna().get(pos).getPhoto());
//                    LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//                    View dialogLayout = inflater.inflate(R.layout.popup, null);
//
//                    builder.setPositiveButton("OK", null);
//                    builder.setView(dialogLayout);
//                    builder.show();

                    final Dialog dialog = new Dialog(context);
                    dialog.setContentView(R.layout.popup);
                    dialog.setTitle("Title");

                    ImageView image = dialog.findViewById(R.id.iv_icon);
                    image.setImageResource(getListAsmaulHusna().get(pos).getPhoto());

                    TextView nama = dialog.findViewById(R.id.iv_nama);
                    nama.setText(getListAsmaulHusna().get(pos).getNamaAS());

                    TextView arti = dialog.findViewById(R.id.iv_arti);
                    arti.setText(getListAsmaulHusna().get(pos).getArtiAS());

                    dialog.show();



                }
            });




        }
    }

}
