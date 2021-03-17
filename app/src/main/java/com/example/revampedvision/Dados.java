package com.example.revampedvision;

public class Dados {


    public void setTemperatura(String Temperatura) {
        this.Temperatura = Temperatura;
    }

    public String getTemperatura() {
        return Temperatura;
    }

    String Temperatura;

    public String getLED_STATUS() {
        return LED_STATUS;
    }

    public void setLED_STATUS(String LED_STATUS) {
        this.LED_STATUS = LED_STATUS;
    }

    String LED_STATUS;

    public String getHumidade() {
        return Humidade;
    }

    public void setHumidade(String Humidade) {
        this.Humidade = Humidade;
    }

    String Humidade;

    public String getHumidadeplanta() {
        return humidadeplanta;
    }

    public void setHumidadeplanta(String humidadeplanta) {
        this.humidadeplanta = humidadeplanta;
    }

    String humidadeplanta;

    public Dados ()
    {

    }
}
