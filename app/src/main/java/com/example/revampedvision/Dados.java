package com.example.revampedvision;

public class Dados {
    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getTemperatura() {
        return temperatura;
    }

    String temperatura;

    public String getLED_STATUS() {
        return LED_STATUS;
    }

    public void setLED_STATUS(String LED_STATUS) {
        this.LED_STATUS = LED_STATUS;
    }

    String LED_STATUS;

    public String getHumidade() {
        return humidade;
    }

    public void setHumidade(String humidade) {
        this.humidade = humidade;
    }

    String humidade;

    public Dados ()
    {

    }
}
