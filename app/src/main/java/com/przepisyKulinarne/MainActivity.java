package com.przepisyKulinarne;

import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.View;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
   /* private RecipesDatabaseOpen mDBHelper;
    private SQLiteDatabase mDb; */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);













        /* mDBHelper = new RecipesDatabaseOpen(this);

        try {
            mDBHelper.updateDataBase();
        } catch (IOException mIOException) {
            throw new Error("UnableToUpdateDatabase");
        }

        try {
            mDb = mDBHelper.getWritableDatabase();
        } catch (SQLException mSQLException) {
            throw mSQLException;
        }

    }

*/
    }
    public void MainActivity(View view){
            Intent intent = new Intent(this,RecipesListActivity.class);
        startActivity(intent);
    }
    }

