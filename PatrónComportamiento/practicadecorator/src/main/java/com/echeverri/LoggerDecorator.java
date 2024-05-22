package com.echeverri;

import java.util.List;

public class LoggerDecorator implements BaseDatos {

    private Logger log;
    private BaseDatos baseDatos;

    public LoggerDecorator(Logger log, BaseDatos baseDatos){
        this.log = log;
        this.baseDatos = baseDatos;
    }
    @Override
    public void inserta(String registro) {
        log.add("Inserta".concat(registro));
        baseDatos.inserta(registro);
    }

    @Override
    public List<String> registros() {
        log.add("lectura");
        return baseDatos.registros();
    }

}
