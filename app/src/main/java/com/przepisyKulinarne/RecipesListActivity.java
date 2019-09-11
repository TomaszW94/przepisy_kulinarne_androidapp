package com.przepisyKulinarne;


import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class RecipesListActivity extends AppCompatActivity {
    RecyclerView rvRecipes;


    android.support.v7.widget.Toolbar toolbar;
    RecipesCustomAdapter adapter;
    SearchView sw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_recipes);

        rvRecipes = (RecyclerView) findViewById(R.id.listap);
        rvRecipes.setHasFixedSize(true);
        rvRecipes.setLayoutManager(new LinearLayoutManager(this));
        rvRecipes.setItemAnimator(new DefaultItemAnimator());


        RecipesDatabaseHelper rdh = new RecipesDatabaseHelper(this);


        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // List<Przepisy> item = rdh.getAllRecipesData("SELECT * FROM przepisy");
        rvRecipes.setAdapter(new RecipesCustomAdapter(rdh.getAllRecipesData("SELECT * FROM przepisy"), rvRecipes));
    }


        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            super.onCreateOptionsMenu(menu);
            //menu.add(R.menu.main_menu);
            //menu.add(Menu.NONE, 101,Menu.FIRST,this.getResources().getString(R.string.Title));
            MenuInflater mi = getMenuInflater();
            mi.inflate(R.menu.menu_items, menu);
            return true;
        }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        {
            RecipesDatabaseHelper rdh = new RecipesDatabaseHelper(this);
            if( R.id.sortkuch_pol==item.getItemId())
                rvRecipes.setAdapter(new RecipesCustomAdapter(rdh.getAllRecipesData("SELECT * FROM przepisy WHERE kategoria='Polska'"), rvRecipes));

            if( R.id.sortkuch_ita==item.getItemId())
                rvRecipes.setAdapter(new RecipesCustomAdapter(rdh.getAllRecipesData("SELECT * FROM przepisy WHERE kategoria='Włoska'"), rvRecipes));

            if( R.id.sortkuch_spain==item.getItemId())
                rvRecipes.setAdapter(new RecipesCustomAdapter(rdh.getAllRecipesData("SELECT * FROM przepisy WHERE kategoria='Hiszpańska'"), rvRecipes));

            if( R.id.sortkuch_mex==item.getItemId())
                rvRecipes.setAdapter(new RecipesCustomAdapter(rdh.getAllRecipesData("SELECT * FROM przepisy WHERE kategoria='Meksykańska'"), rvRecipes));

            if( R.id.sortkuch_desserts==item.getItemId())
                rvRecipes.setAdapter(new RecipesCustomAdapter(rdh.getAllRecipesData("SELECT * FROM przepisy WHERE kategoria='Deser'"), rvRecipes));

            if( R.id.sort_az==item.getItemId())
                rvRecipes.setAdapter(new RecipesCustomAdapter(rdh.getAllRecipesData("SELECT * FROM przepisy ORDER BY nazwa ASC"), rvRecipes));

            if( R.id.sort_za==item.getItemId())
                rvRecipes.setAdapter(new RecipesCustomAdapter(rdh.getAllRecipesData("SELECT * FROM przepisy ORDER BY nazwa DESC"), rvRecipes));

            if( R.id.sort_all==item.getItemId())
                rvRecipes.setAdapter(new RecipesCustomAdapter(rdh.getAllRecipesData("SELECT * FROM przepisy"), rvRecipes));
        }
        return true;
    }




    }









