package com.iesamd.domain.models;

public class CuadrodeMando implements Piezas {

    private Integer codCuadro;
    private String modelo;
    private Integer UnidadCuadro;

    public Integer getCodCuadro() {
        return codCuadro;
    }

    public void setCodCuadro(Integer codCuadro) {
        this.codCuadro = codCuadro;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String getMarca() {
        return null;
    }


    @Override
    public Integer getCode() {
        return codCuadro;
    }

    @Override
    public Integer getUnidades() {
        return UnidadCuadro;
    }

    public void setUnidadCuadro(Integer unidadCuadro) {
        UnidadCuadro = unidadCuadro;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
