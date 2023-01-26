package com.iesamd.presentation;

import com.iesamd.domain.UseCase.AddChasisUseCase;
import com.iesamd.domain.UseCase.GetChasisUseCase;
import com.iesamd.domain.UseCase.SaveChasisUseCase;
import com.iesamd.domain.models.*;

public class Main {
    public static void main(String[] args) {

        //RUEDA A
        Ruedas ruedasA = new Ruedas();
        ruedasA.setCodRueda(1);
        ruedasA.setMarca("Michelin");
        ruedasA.setModelo("Alpin 6");
        ruedasA.setDiametro(185);
        ruedasA.setUnidadRuedas(5);
        //RUEDA B
        Ruedas ruedasB = new Ruedas();
        ruedasB.setCodRueda(2);
        ruedasB.setMarca("Firestone");
        ruedasB.setModelo("WinterHawk");
        ruedasB.setDiametro(205);
        ruedasB.setUnidadRuedas(3);

        //MOTOR A
        Motor motorA = new Motor();
        motorA.setCodMotor(1);
        motorA.setModelo("X6000");
        motorA.setCilindrada(2.0);
        motorA.setHorsepower(120);
        motorA.setUnidadMotor(2);

        //MOTOR B
        Motor motorB = new Motor();
        motorB.setCodMotor(2);
        motorB.setModelo("X9000");
        motorB.setCilindrada(2.4);
        motorB.setHorsepower(160);
        motorB.setUnidadMotor(2);

        CuadrodeMando cuadrodeMandoA = new CuadrodeMando();
        cuadrodeMandoA.setCodCuadro(1);
        cuadrodeMandoA.setModelo("LM2000");
        cuadrodeMandoA.setUnidadCuadro(4);

        CuadrodeMando cuadrodeMandoB = new CuadrodeMando();
        cuadrodeMandoB.setCodCuadro(2);
        cuadrodeMandoB.setModelo("LM6000");
        cuadrodeMandoB.setUnidadCuadro(2);

        Chasis chasisAAAA = new Chasis();
        chasisAAAA.setCodeChasis("AAAA");
        ruedasA.setCodRueda(1);
        motorB.setCodMotor(2);
        cuadrodeMandoA.setCodCuadro(1);

        Chasis chasisBBBB = new Chasis();
        chasisBBBB.setCodeChasis("BBBB");
        ruedasB.setCodRueda(2);
        motorB.setCodMotor(2);
        cuadrodeMandoB.setCodCuadro(2);

        SaveChasisUseCase saveChasisUseCase = new SaveChasisUseCase();
        saveChasisUseCase.execute(chasisAAAA);

        Chasis chasisCCCC = new Chasis();
        chasisCCCC.setCodeChasis("CCCC");
        ruedasA.setUnidadRuedas(4);
        motorA.setUnidadMotor(1);
        cuadrodeMandoA.setUnidadCuadro(5);

        Chasis chasisDDDD = new Chasis();
        chasisDDDD.setCodeChasis("DDDD");
        ruedasA.setUnidadRuedas(4);
        motorA.setUnidadMotor(1);
        cuadrodeMandoB.setUnidadCuadro(3);


        AddChasisUseCase addChasisUseCase = new AddChasisUseCase();
        addChasisUseCase.execute(chasisCCCC);

        GetChasisUseCase getChasisUseCase = new GetChasisUseCase();
        getChasisUseCase.execute(chasisBBBB);


    }
}