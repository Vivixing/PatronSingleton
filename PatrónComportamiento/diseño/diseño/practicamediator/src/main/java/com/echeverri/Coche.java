package com.echeverri;

public class Coche {

    private Mediator mediator;

    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    public void enciende(){
       mediator.enciendeRadio();
    }

    public void apaga(){
        mediator.apagaRadio();
    }
    
}
