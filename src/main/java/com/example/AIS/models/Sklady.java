package com.example.AIS.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Sklady {

    @Id
    private String nameSklada;

    private String adressSklada;
    private String phoneSklada;

    public Sklady() {
    }

    public Sklady(String nameSklada, String adressSklada, String phoneSklada) {
        this.nameSklada = nameSklada;
        this.adressSklada = adressSklada;
        this.phoneSklada = phoneSklada;
    }

    public String getNameSklada() {
        return nameSklada;
    }

    public void setNameSklada(String nameSklada) {
        this.nameSklada = nameSklada;
    }

    public String getAdressSklada() {
        return adressSklada;
    }

    public void setAdressSklada(String adressSklada) {
        this.adressSklada = adressSklada;
    }

    public String getPhoneSklada() {
        return phoneSklada;
    }

    public void setPhoneSklada(String phoneSklada) {
        this.phoneSklada = phoneSklada;
    }
}
