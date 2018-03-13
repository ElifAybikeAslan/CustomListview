package com.elifaybike.customlistview;

import android.app.ListActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    String[] donanimBirimleri;
    Integer[] resimIdleri;
    Donanimlar  donanimlar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getImageId();
        setAdapterForView();


    }

    private void getImageId(){
        donanimBirimleri=new String[]{
                "Klavye",
                "Fare",
                "Harddisk",
                "Kamera",
                "Monitör",
                "Optikdisk",
                "Tarayıcı",
                "Yazıcı"
        };

        resimIdleri=new Integer[]{
            R.drawable.klavye,
            R.drawable.fare,
            R.drawable.harddisk,
            R.drawable.kamera,
            R.drawable.monitor,
            R.drawable.optikdisk,
            R.drawable.tarayici,
            R.drawable.yazici
        };
    }

    private void setAdapterForView(){
        donanimlar=new Donanimlar(this,donanimBirimleri,resimIdleri);
        setListAdapter(donanimlar);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        AlertDialog.Builder diyalogolusturucu = new
                AlertDialog.Builder(MainActivity.this);
        diyalogolusturucu.setMessage(donanimBirimleri[position])
                .setCancelable(false)
                .setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        diyalogolusturucu.create().show();
    }
}
