package com.example.AIS.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Sales {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_operacii;
    private Date data;

    private  String Prodavec;
    private String Torgov_objekt;

    private String Tovar;
    private Long Kolichestvo;
    private Long Stoimost_edinicy;

    public Sales() {
    }

    public Sales(Long ID_operacii, Date data, String prodavec, String torgov_objekt, String tovar, Long kolichestvo, Long stoimost_edinicy) {
        this.ID_operacii = ID_operacii;
        this.data = data;
        Prodavec = prodavec;
        Torgov_objekt = torgov_objekt;
        Tovar = tovar;
        Kolichestvo = kolichestvo;
        Stoimost_edinicy = stoimost_edinicy;
    }

    public Long getID_operacii() {
        return ID_operacii;
    }

    public void setID_operacii(Long ID_operacii) {
        this.ID_operacii = ID_operacii;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getProdavec() {
        return Prodavec;
    }

    public void setProdavec(String prodavec) {
        Prodavec = prodavec;
    }

    public String getTorgov_objekt() {
        return Torgov_objekt;
    }

    public void setTorgov_objekt(String torgov_objekt) {
        Torgov_objekt = torgov_objekt;
    }

    public String getTovar() {
        return Tovar;
    }

    public void setTovar(String tovar) {
        Tovar = tovar;
    }

    public Long getKolichestvo() {
        return Kolichestvo;
    }

    public void setKolichestvo(Long kolichestvo) {
        Kolichestvo = kolichestvo;
    }

    public Long getStoimost_edinicy() {
        return Stoimost_edinicy;
    }

    public void setStoimost_edinicy(Long stoimost_edinicy) {
        Stoimost_edinicy = stoimost_edinicy;
    }
}
