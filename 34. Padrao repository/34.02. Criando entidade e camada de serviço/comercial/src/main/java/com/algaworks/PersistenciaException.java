package com.algaworks;

public class PersistenciaException extends RuntimeException{

    public PersistenciaException(String message) {
        super(message);
    }

    public PersistenciaException(Throwable cause) {
        super(cause);
    }

    public PersistenciaException(String message, Throwable cause) {
        super(message, cause);
    }
}
