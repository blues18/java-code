package com.example.newprojecutui;

public class Songscode {

    private String id;
    private String titles;
    private String artiste;
    private String filelink;
    private double Songlength;
    private int drawable;

    public Songscode(String id, String titles,String artiste,String filelink,double Songlength, int drawable) {
        this.id = id;
        this.titles = titles;
        this.artiste = artiste;
        this.filelink = filelink;
        this.Songlength = Songlength;
        this.drawable = drawable;
    }

    public void setId(String id){this.id=id;}
    public void setTitles(String titles){this.titles=titles;}
    public void setArtiste (String artiste){this.artiste=artiste;}
    public void setFilelink(String filelink){this.filelink=filelink;}
    public void setSonglength(double Songlength){this.Songlength=Songlength;}
    public void setDrawable(int drawable){this.drawable=drawable;}

    public String getId(){ return id;}
    public String getTitles() {return titles;}
    public String getArtiste() {return artiste;}
    public String getFilelink() {return filelink;}
    public double getSonglength() {return Songlength;}
    public int getDrawable() {return drawable;}

}
