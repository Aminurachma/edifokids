package com.amiyulvayulvi.edifokids.model;

public class Doa {

    private String namaDoa;
    private int photo, suara;

    public Doa(String namaDoa, int photo, int suara) {
        this.namaDoa = namaDoa;
        this.photo = photo;
        this.suara = suara;
    }

    public int getSuara() {
        return suara;
    }

    public void setSuara(int suara) {
        this.suara = suara;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getNamaDoa() {
        return namaDoa;
    }


    public void setNamaDoa(String namaDoa) {
        this.namaDoa = namaDoa;
    }
}
