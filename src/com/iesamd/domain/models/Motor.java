package com.iesamd.domain.models;

public class Motor implements Piezas {

    private Integer codMotor;
    private String modelo;
    private double cilindrada;
    private Integer horsepower;
    private Integer UnidadMotor;

    public Integer getCodMoto() {
        return codMotor;
    }

    public void setCodMotor(Integer codMotor) {
        this.codMotor = codMotor;
    }

    @Override
    public Integer getCode() {
        return codMotor;
    }

    @Override
    public Integer getUnidades() {
        return UnidadMotor;
    }

    public void setUnidadMotor(Integer unidadMotor) {
        UnidadMotor = unidadMotor;
    }

    public Integer getCodMotor() {
        return codMotor;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Integer getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(Integer horsepower) {
        this.horsepower = horsepower;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String getMarca() {
        return null;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getDiametro() {
        return horsepower;
    }

}
