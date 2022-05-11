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
public class Ogrenciler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ogrId;

    private int ogrNo;

    private String ogrAdSoyad;

    private String ogrBolum;

    private int ogrSinif;

    private int kitapSayisi;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToMany(mappedBy = "ogrencilers",fetch = FetchType.EAGER)
    private Set<Kitaplar> kitaplars=new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Ogrenciler that = (Ogrenciler) o;
        return ogrId != null && Objects.equals(ogrId, that.ogrId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

