package fr.univ_orleans.iut45.mud;
import java.util.*;
import com.google.gson.*;




public class Box {
    private List<Thing> boite;
    private boolean ouvert = true;
    private int capacity;

    public Box() {
        this.boite = new ArrayList<>();
        this.capacity = 5;
    }

    public void add(Thing objet){
        if (ouvert && capacity > boite.size())
        this.boite.add(objet);
    }

    public void ouvrirBoite(){
        this.ouvert = true;
    }
    public void fermerBoite(){
        this.ouvert = false;
    }

    public void actionLook(){
        System.out.println(boite + "");
    }

    public boolean isOpen() {
        return this.ouvert;
    }


/* GETTER AND SETTER */

    public int capacity(){return this.capacity;
    }
    public List<Thing> getBoite() {return this.boite;
    }
    public void setBoite(List<Thing> boite) {this.boite = boite;
    }
    public boolean isOuvert() {return this.ouvert;
    }
    public boolean getOuvert() {return this.ouvert;
    }
    public void setOuvert(boolean ouvert) {this.ouvert = ouvert;
    }
    public int getCapacity() {return this.capacity;
    }
    public void setCapacity(int capacity) {this.capacity = capacity;
    }

/* ------------------------------------------------------------------ */



    public static Box fromJSON(String path){
        Gson gson = new Gson();
        Box laBoite = new Box();
        laBoite = gson.fromJson(path, Box.class);
        return laBoite;
    }




    @Override
    public String toString() {
        return "{" +
            " boite='" + getBoite() + "'" +
            ", ouvert='" + isOpen() + "'" +
            ", capacity='" + capacity() + "'" +
            "}";
    }
    
    

    
}