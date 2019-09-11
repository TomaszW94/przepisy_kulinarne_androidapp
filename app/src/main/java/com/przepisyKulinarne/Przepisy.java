package com.przepisyKulinarne;

import android.support.v7.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Tomek on 27.11.2017.
 */

public class Przepisy implements Serializable {
private Long nr;
private String Nazwa;
private String Opis;
private String Porcje;
private String Kalorie;
private String Skladniki;
private String Kategoria;
private String Przygotowanie;
private int ResourceID;

public Przepisy(){}
    public Przepisy(String nazwa, String opis, String porcje, String kalorie, String skladniki, String przygotowanie, String kategoria, int resourceID) {
    this.Nazwa = nazwa;
    this.Opis = opis;
    this.Porcje=porcje;
    this.Kalorie=kalorie;
    this.Skladniki=skladniki;
    this.Przygotowanie=przygotowanie;
    this.Kategoria=kategoria;
    this.ResourceID=resourceID;
    }



    public Long getNr() {
        return nr;
    }

    public void setNr(Long nr) {
        this.nr = nr;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }

    public String getOpis() {
        return Opis;
    }

    public void setOpis(String opis) {
        Opis = opis;
    }

    public String getPorcje() {
        return Porcje;
    }

    public void setPorcje(String porcje) {
        Porcje = porcje;
    }

    public String getSkladniki() {
        return Skladniki;
    }

    public void setSkladniki(String skladniki) {
        Skladniki = skladniki;
    }

    public String getPrzygotowanie() {
        return Przygotowanie;
    }

    public void setPrzygotowanie(String przygotowanie) {
        Przygotowanie = przygotowanie;
    }

    public int getResourceID() {
        return ResourceID;
    }

    public void setResourceID(int resourceID) {
        this.ResourceID = resourceID;
    }

    public String getKalorie() {
        return Kalorie;
    }

    public void setKalorie(String kalorie) {
        Kalorie = kalorie;
    }

    public String getKategoria() {
        return Kategoria;
    }

    public void setKategoria(String kategoria) {
        Kategoria = kategoria;
    }
}
