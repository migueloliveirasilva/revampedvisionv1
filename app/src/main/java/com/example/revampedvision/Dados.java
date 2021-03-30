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

    public String getHumidadePlanta() {
        return HumidadePlanta;
    }

    public void setHumidadePlanta(String humidadePlanta) {
        this.HumidadePlanta = humidadePlanta;
    }

    String HumidadePlanta;

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {this.Cor = Cor;}



    String Cor;

    public Dados ()
    {

    }
}
