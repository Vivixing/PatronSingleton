package com.echeverri;

public class ConcreteMediator implements Mediator{
    private Radio radio;
    private Telefono telefono;


    public void setRadio(Radio radio){
        this.radio=radio;
    }

    public void setTelefono(Telefono telefono){
        this.telefono=telefono;
    }

    @Override
    public void recibeLlamadaTelefono() {
        radio.apaga();
    }

    @Override
    public void enciendeMusicaTelefono() {
        telefono.enciendeMusica();
    }

    @Override
    public void apagaMusicaTelefono() {
        telefono.apagaMusica();
    }

    @Override
    public void enciendeRadio() {
        radio.enciende();
        telefono.apagaMusica();
    }

    @Override
    public void apagaRadio() {
        radio.apaga();
    }
    
}
