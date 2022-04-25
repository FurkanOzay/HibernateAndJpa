package com.javacourse.project.hibernateAndJpa.Entities;

import javax.persistence.*;




@Entity
@Table(name="ogrenciler")
public class Ogrenciler {
    @Id
    @Column(name="ogr_id",columnDefinition = "serial")
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int ogr_id;
    @Column(name="ogr_no")
    private int ogr_no;
    @Column(name="ogr_ad_soyad")
    private String ogr_ad_soyad;
    @Column(name = "ogr_bolum")
    private String ogr_bolum;
    @Column(name="ogr_sinif")
    private int ogr_sinif;




    public Ogrenciler(int ogr_id, int ogr_no, String ogr_ad_soyad, String ogr_bolum, int ogr_sinif) {
        super();
        this.ogr_id = ogr_id;
        this.ogr_no = ogr_no;
        this.ogr_ad_soyad = ogr_ad_soyad;
        this.ogr_bolum = ogr_bolum;
        this.ogr_sinif = ogr_sinif;
    }

    public Ogrenciler() {

    }

    public int getOgr_id() {
        return ogr_id;
    }

    public void setOgr_id(int ogr_id) {
        this.ogr_id = ogr_id;
    }

    public int getOgr_no() {
        return ogr_no;
    }

    public void setOgr_no(int ogr_no) {
        this.ogr_no = ogr_no;
    }

    public String getOgr_ad_soyad() {
        return ogr_ad_soyad;
    }

    public void setOgr_ad_soyad(String ogr_ad_soyad) {
        this.ogr_ad_soyad = ogr_ad_soyad;
    }

    public String getOgr_bolum() {
        return ogr_bolum;
    }

    public void setOgr_bolum(String ogr_bolum) {
        this.ogr_bolum = ogr_bolum;
    }

    public int getOgr_sinif() {
        return ogr_sinif;
    }

    public void setOgr_sinif(int ogr_sinif) {
        this.ogr_sinif = ogr_sinif;
    }
}
