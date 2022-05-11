package com.javacourse.project.hibernateAndJpa.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Kitaplar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String kitapAdi;

    private String kitapKategori;

    private String kitapAciklama;

    private String kitapResimUrl;

    private int kitapSayfa;

    private String yazar;

    private int kitapAdeti;

    private int mevcutKitap;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "kitap_ogrenci", joinColumns = @JoinColumn(name = "kitap_id"), inverseJoinColumns = @JoinColumn(name = "ogrenci_id"))
    private Set<Ogrenciler> ogrencilers = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Kitaplar kitaplar = (Kitaplar) o;
        return id != null && Objects.equals(id, kitaplar.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
