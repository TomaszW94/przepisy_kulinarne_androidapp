package com.przepisyKulinarne;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class RecipesCustomAdapter extends RecyclerView.Adapter {

    private List<Przepisy> mRecipesList;
    public Context context;
    private RecyclerView mRecyclerView;
    RecipesActivity recipesActivity;
    RecipesDatabaseHelper rdh;

    // implementacja wzorca ViewHolder
    // każdy obiekt tej klasy przechowuje odniesienie do layoutu elementu listy
    // dzięki temu wywołujemy findViewById() tylko raz dla każdego elementu
    private class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView mNazwa;

        public ImageView mZdjecie;

        public MyViewHolder(View pItem) {
            super(pItem);

            mNazwa = (TextView) pItem.findViewById(R.id.nazwap);
            mZdjecie = (ImageView) pItem.findViewById(R.id.zdjeciep);
        }
    }

    // konstruktor adaptera
    public RecipesCustomAdapter(List<Przepisy> mRecipesList, RecyclerView rvRecipes) {
        this.mRecipesList = mRecipesList;
        this.mRecyclerView = rvRecipes;


    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, final int i) {
        // tworzymy layout artykułu oraz obiekt ViewHoldera
        final View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.single_row, viewGroup, false);
        // dla elementu listy ustawiamy obiekt OnClickListener,
        // który usunie element z listy po kliknięciu na niego


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //indeks elementu kliknietego
                int position = mRecyclerView.getChildAdapterPosition(v);
                // odnajdujemy indeks klikniętego elementu
                mRecipesList.get(position);
                Intent intent = new Intent(view.getContext(), RecipesActivity.class);
                intent.putExtra("mykey", mRecipesList.get(position));
                // intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                view.getContext().startActivity(intent);
            }
        });
        // tworzymy i zwracamy obiekt ViewHolder
        return new MyViewHolder(view);


    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        // uzupełniamy layout artykułu
        Przepisy przepisy = mRecipesList.get(i);
        ((MyViewHolder) viewHolder).mNazwa.setText(przepisy.getNazwa());
        ((MyViewHolder) viewHolder).mZdjecie.setImageResource(przepisy.getResourceID());
    }


    @Override
    public int getItemCount() {
        return mRecipesList.size();
    }}
































       /*@Override
        public void onClick(View view) {
           int position = mRecyclerView.getChildAdapterPosition(view);
           recipesList.get(position);
            Intent intent = new Intent(view.getContext(),RecipesActivity.class);
            intent.putExtra("mykey",recipesList.get(getAdapterPosition()));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
           view.getContext().startActivity(intent);
        }*/





























