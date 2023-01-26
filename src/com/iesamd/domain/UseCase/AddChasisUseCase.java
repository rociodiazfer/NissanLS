package com.iesamd.domain.UseCase;

import com.iesamd.data.ChasisDataStore;
import com.iesamd.domain.models.Chasis;

public class AddChasisUseCase {
    private ChasisDataStore dataStore = ChasisDataStore.getInstance();

    public void execute(Chasis chasis) {
        dataStore.guardar(chasis);
    }
}
