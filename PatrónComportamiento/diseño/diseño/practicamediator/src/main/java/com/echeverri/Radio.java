package com.echeverri;

public class Radio {
    private boolean encendida = false;
    private Mediator mediator;

    public void setMediator( Mediator mediator){
        this.mediator = mediator;
    }

    public void enciende(){
        encendida = true;
        mediator.apagaMusicaTelefono();
    }

    public void apaga(){
        encendida = false;
    }

    public boolean encendida(){
        return encendida;
    }

}
