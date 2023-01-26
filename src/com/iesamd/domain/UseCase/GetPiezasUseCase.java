package com.iesamd.domain.UseCase;

import com.iesamd.data.PiezasDataStore;
import com.iesamd.domain.models.Piezas;

public class GetPiezasUseCase {
    private PiezasDataStore dataStore = PiezasDataStore.getInstance();

    public Piezas execute(String codigo) {
        return dataStore.buscar(codigo);
    }
}
