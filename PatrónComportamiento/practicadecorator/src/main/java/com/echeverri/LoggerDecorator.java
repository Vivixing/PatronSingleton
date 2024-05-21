package com.echeverri;

import java.util.List;

public class LoggerDecorator implements BaseDatos {

    private final Logger logger;
    private final BaseDatos baseDatos;

    public LoggerDecorator(Logger logger, BaseDatos baseDatos){
        this.logger=logger;
        this.baseDatos=baseDatos;
    }

    @Override
    public void inserta(String registro) {
        logger.add("inserta"+registro);
        baseDatos.inserta(registro);
    }

    @Override
    public List<String> registros() {
       logger.add("lectura");
       return baseDatos.registros();
    }

}
