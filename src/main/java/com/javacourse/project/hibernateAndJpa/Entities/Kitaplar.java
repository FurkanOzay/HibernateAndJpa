package com.javacourse.project.hibernateAndJpa.Entities;

import javax.persistence.*;




@Entity
@Table(name="kitaplar")
public class Kitaplar {
	@Id
	@Column(name="id",columnDefinition = "serial")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	@Column(name="kitap_adi")
	private String kitap_adi;
	@Column(name="kitap_kategori")
	private String kitap_kategori;
	@Column(name="kitap_resim_url")
	private String kitap_resim_url;
	@Column(name="kitap_sayfa")
	private int kitap_sayfa;
	@Column(name="yazar")
	private String yazar;
	
	
	public Kitaplar(int id, String kitap_adi, String kitap_kategori, String kitap_resim_url, int kitap_sayfa, String yazar ) {
		super();
		this.id = id;
		this.kitap_adi = kitap_adi;
		this.kitap_kategori = kitap_kategori;
		this.kitap_resim_url = kitap_resim_url;
		this.kitap_sayfa = kitap_sayfa;
		this.yazar = yazar;
	}

	public Kitaplar() {
		
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getKitap_adi() {
		return kitap_adi;
	}


	public void setKitap_adi(String kitap_adi) {
		this.kitap_adi = kitap_adi;
	}

	public String getKitap_kategori() {
		return kitap_kategori;
	}


	public void setKitap_kategori(String kitap_kategori) {
		this.kitap_kategori = kitap_kategori;
	}


	public String getKitap_resim_url() {
		return kitap_resim_url;
	}


	public void setKitap_resim_url(String kitap_resim_url) {
		this.kitap_resim_url = kitap_resim_url;
	}


	public int getKitap_sayfa() {
		return kitap_sayfa;
	}


	public void setKitap_sayfa(int kitap_sayfa) {
		this.kitap_sayfa = kitap_sayfa;
	}

	public String getYazar() {
		return yazar;
	}


	public void setYazar(String yazar) {
		this.yazar = yazar;
	}
	
}
