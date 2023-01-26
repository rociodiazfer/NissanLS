package com.iesamd.domain.models;

import java.util.ArrayList;
import java.util.List;

public class Chasis  {

    private String codeChasis;
    private String modelo;
    private String marca;
    private Piezas Unidades;

    private List<Piezas> piezas = new ArrayList<>();

    public String getCodeChasis() {
        return codeChasis;
    }

    public void setCodeChasis(String codeChasis) {
        this.codeChasis = codeChasis;
    }

    public String getModel() {
        return modelo;
    }

    public void setModel(String model) {
        this.modelo = model;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<Piezas> getPiezas() {
        return piezas;
    }

    public void setPiezas(List<Piezas> piezas) {
        this.piezas = piezas;
    }


    public void setPiezas(Piezas piezas) {
        this.Unidades= piezas;
    }

}
