package com.echeverri;

public class User {
    State currentState;
    private boolean isBuying;
    private boolean isEnabled;

    public User(){
        currentState = new ActiveState(this);
    }

    public void changeState(State newState){
        currentState = newState;
    }

    public String Activate() {
        return currentState.onActive();
    }

    public String Disable() {
        return currentState.onDisable();
    }

    public String lock() {
        return currentState.onLock();
    }

    public String Buy() {
        return currentState.onBuy();
    }

    public boolean isBuying(){
        return isBuying;
    }

    public String starBuy() {
        return "Buying Started";
    }

    public void setBuying(boolean isBuying) {
        this.isBuying = isBuying;
    }

    public void setEnable(boolean isEnabled) {
        this.isEnabled= isEnabled;
    }

    public boolean getEnable() {
        return isEnabled;
    }

}
