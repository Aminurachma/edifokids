package com.amiyulvayulvi.edifokids.model;

public class AsmaulHusna {

    private String namaAS, artiAS;
    private int photo;

    public AsmaulHusna(String namaAS, String artiAS, int photo) {
        this.namaAS = namaAS;
        this.artiAS = artiAS;
        this.photo = photo;
    }

    public String getNamaAS() {
        return namaAS;
    }

    public void setNamaAS(String namaAS) {
        this.namaAS = namaAS;
    }

    public String getArtiAS() {
        return artiAS;
    }

    public void setArtiAS(String artiAS) {
        this.artiAS = artiAS;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
