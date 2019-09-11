
package com.przepisyKulinarne;

import android.app.Activity;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;





public class RecipesActivity extends Activity {


    TextView nazwa,opis,porcje,kalorie,skladniki,przygotowanie;
    ImageView zdjecie;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        nazwa = (TextView) findViewById(R.id.nazwa);
        opis = (TextView) findViewById(R.id.opis);
        porcje = (TextView) findViewById(R.id.porcje);
        kalorie = (TextView) findViewById(R.id.kalorie);
        skladniki = (TextView) findViewById(R.id.skladniki);
        przygotowanie = (TextView) findViewById(R.id.przygotowanie);
        zdjecie = (ImageView) findViewById(R.id.photo);

        Przepisy przepisy = (Przepisy) getIntent().getSerializableExtra("mykey");
        if(przepisy !=null){
            nazwa.setText(przepisy.getNazwa());
            opis.setText(przepisy.getOpis());
            porcje.setText(przepisy.getPorcje());
            kalorie.setText(przepisy.getKalorie());
            skladniki.setText(przepisy.getSkladniki());
            przygotowanie.setText(przepisy.getPrzygotowanie());
            zdjecie.setImageResource(przepisy.getResourceID());
        }
    }

}
