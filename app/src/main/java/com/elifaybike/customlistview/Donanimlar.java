package com.elifaybike.customlistview;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Smsung on 17.6.2017.
 */

public class Donanimlar extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] donanimBirimleri;
    private final Integer[] resimIdleri;

    public Donanimlar(Activity context, String[] donanimBirimleri, Integer[] resimIdleri) {
        super(context, R.layout.single_row, donanimBirimleri);
        this.context = context;
        this.donanimBirimleri = donanimBirimleri;
        this.resimIdleri = resimIdleri;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View satir = inflater.inflate(R.layout.single_row,null,true);

        TextView txtBirim= (TextView) satir.findViewById(R.id.textViewBaslik);
        ImageView resim = (ImageView) satir.findViewById(R.id.imageViewIcon);

        txtBirim.setText(donanimBirimleri[position]);
        resim.setImageResource(resimIdleri[position]);
        return satir;


    }
}
