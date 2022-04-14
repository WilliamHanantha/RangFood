package com.example.ptspakaji;

public class ModelRestoran {

    String jarak, nama, rate;
    int image;

    public ModelRestoran(String jarak, String nama, String rate, int image) {
        this.jarak = jarak;
        this.nama = nama;
        this.rate = rate;
        this.image = image;
    }

    public String getJarak() {
        return jarak;
    }

    public void setJarak(String jarak) {
        this.jarak = jarak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}