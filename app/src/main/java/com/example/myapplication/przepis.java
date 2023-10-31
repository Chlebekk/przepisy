package com.example.myapplication;

import java.util.ArrayList;

public class przepis {
    private String nazwa;
    private  String kategoria;
    private  int nrKategori;
    private int idObrazka;
    private String skladniki;
    private String tresc;
    private int id;
    private  static int ile;

    public przepis(String nazwa, String kategoria, int nrKategori, int idObrazka, String skladniki, String tresc) {
        this.nazwa = nazwa;
        this.kategoria = kategoria;
        this.nrKategori = nrKategori;
        this.idObrazka = idObrazka;
        this.skladniki = skladniki;
        this.tresc = tresc;
        this.id=ile;
        ile++;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getKategoria() {
        return kategoria;
    }

    public int getNrKategori() {
        return nrKategori;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public String getSkladniki() {
        return skladniki;
    }

    public String getTresc() {
        return tresc;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return nazwa;
    }
}
