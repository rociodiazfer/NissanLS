package com.iesamd.data;

import com.iesamd.domain.models.Piezas;

import java.util.TreeMap;

public class PiezasDataStore {
        private static PiezasDataStore instance = null;

        private TreeMap<Integer, Piezas> dataStore = new TreeMap<Integer, Piezas>();

        public void guardar(Piezas modelo) {
            dataStore.put(modelo.getCode(), modelo);
        }

        public void eliminar(String codigo) {
            dataStore.remove(codigo);
        }

        public Piezas buscar(String codigo) {
            return dataStore.get(codigo);
        }

        public void modificar(Piezas modelo) {
            dataStore.put(modelo.getCode(), modelo    );
        }

        public static PiezasDataStore getInstance() {
            if (instance == null) {
                instance = new PiezasDataStore();
            }
            return instance;
        }
    }

