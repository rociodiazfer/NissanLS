package com.iesamd.domain.UseCase;

import com.iesamd.data.PiezasDataStore;
import com.iesamd.domain.models.Piezas;

public class SavePiezasUseCase {
    private PiezasDataStore dataStore = PiezasDataStore.getInstance();

    public void execute(Piezas modelo) {
        dataStore.guardar(modelo);
    }
}
