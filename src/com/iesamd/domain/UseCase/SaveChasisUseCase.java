package com.iesamd.domain.UseCase;

import com.iesamd.data.ChasisDataStore;
import com.iesamd.domain.models.Chasis;

public class SaveChasisUseCase {
    private ChasisDataStore dataStore = ChasisDataStore.getInstance();

    public void execute(Chasis modelo) {
        dataStore.guardar(modelo);
    }
}
