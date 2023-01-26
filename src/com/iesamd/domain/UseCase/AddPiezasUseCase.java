package com.iesamd.domain.UseCase;

import com.iesamd.data.PiezasDataStore;
import com.iesamd.domain.models.Piezas;

public class AddPiezasUseCase {
    private PiezasDataStore dataStore = PiezasDataStore.getInstance();

    public void execute(Piezas piezas) {
        dataStore.guardar(piezas);
    }
}
