package com.amiyulvayulvi.edifokids.model;

public class Nabi {
    private String noNabi, namaNabi, kisahNabi;

    public Nabi(String noNabi, String namaNabi, String kisahNabi) {
        this.noNabi = noNabi;
        this.namaNabi = namaNabi;
        this.kisahNabi = kisahNabi;
    }

    public String getNoNabi() {
        return noNabi;
    }

    public void setNoNabi(String noNabi) {
        this.noNabi = noNabi;
    }

    public String getNamaNabi() {
        return namaNabi;
    }

    public void setNamaNabi(String namaNabi) {
        this.namaNabi = namaNabi;
    }

    public String getKisahNabi() {
        return kisahNabi;
    }

    public void setKisahNabi(String kisahNabi) {
        this.kisahNabi = kisahNabi;
    }
}
