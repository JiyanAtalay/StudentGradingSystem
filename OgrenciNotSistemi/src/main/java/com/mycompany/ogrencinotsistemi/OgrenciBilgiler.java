
package com.mycompany.ogrencinotsistemi;

public class OgrenciBilgiler {
    private int numara;
    private String ad;
    private String soyad;
    private int vize;
    private int finals;
    private double ortalama;
    private boolean durum;

    public OgrenciBilgiler(int numara, String ad, String soyad, int vize, int finals, double ortalama, boolean durum) {
        this.numara = numara;
        this.ad = ad;
        this.soyad = soyad;
        this.vize = vize;
        this.finals = finals;
        this.ortalama = ortalama;
        this.durum = durum;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getVize() {
        return vize;
    }

    public void setVize(int vize) {
        this.vize = vize;
    }

    public int getFinals() {
        return finals;
    }

    public void setFinals(int finals) {
        this.finals = finals;
    }

    public double getOrtalama() {
        return ortalama;
    }

    public void setOrtalama(double ortalama) {
        this.ortalama = ortalama;
    }

    public boolean isDurum() {
        return durum;
    }

    public void setDurum(boolean durum) {
        this.durum = durum;
    }
    
}
