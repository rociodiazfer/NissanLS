package com.iesamd.domain.UseCase;

import com.iesamd.data.ChasisDataStore;
import com.iesamd.domain.models.Chasis;

public class GetChasisUseCase {
    private ChasisDataStore dataStore = ChasisDataStore.getInstance();

    public Chasis execute(Chasis code) {
        return dataStore.buscar(code);
    }
}
