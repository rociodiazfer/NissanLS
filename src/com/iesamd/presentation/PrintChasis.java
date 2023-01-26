package com.iesamd.presentation;

import com.iesamd.domain.models.Chasis;


public class PrintChasis {

    public void imprimir(Chasis chasis){
        for(int i = 0; i<chasis.getPiezas().size(); i++){
        System.out.println("Codigo de chasis "+chasis.getPiezas().get(i).getUnidades());
        System.out.println("Tiene las piezas con código "+chasis.getPiezas().get(i).getCode());
        }
    }
}
