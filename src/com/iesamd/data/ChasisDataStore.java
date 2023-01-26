package com.iesamd.data;

import com.iesamd.domain.models.Chasis;

import java.util.TreeMap;

public class ChasisDataStore {

        private static ChasisDataStore instance = null;

        private TreeMap<String, Chasis> dataStore = new TreeMap<String, Chasis>();

        public void guardar(Chasis modelo) {
            dataStore.put(modelo.getCodeChasis(), modelo);
        }

        public void eliminar(String codigo) {
            dataStore.remove(codigo);
        }

        public Chasis buscar(Chasis codigo) {
            return dataStore.get(codigo);
        }

        public void modificar(Chasis modelo) {
            dataStore.put(modelo.getCodeChasis(), modelo);
        }

        public static ChasisDataStore getInstance() {
            if (instance == null) {
                instance = new ChasisDataStore();
            }
            return instance;
        }
    }

