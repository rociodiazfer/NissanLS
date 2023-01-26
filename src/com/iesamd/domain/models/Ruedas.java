package com.iesamd.domain.models;

public class Ruedas implements Piezas {

    private Integer codRueda;
    private String marca;
    private String modelo;
    private Integer diametro;
    private Integer UnidadRuedas;

    public Integer getCodRueda() {
        return codRueda;
    }

    public void setCodRueda(Integer codRueda) {
        this.codRueda = codRueda;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public Integer getCode() {
        return codRueda;
    }

    @Override
    public Integer getUnidades() {
        return UnidadRuedas;
    }

    public void setUnidadRuedas(Integer unidadRuedas) {
        UnidadRuedas = unidadRuedas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getDiametro() {
        return diametro;
    }

    public void setDiametro(Integer diametro) {
        this.diametro = diametro;
    }
}
