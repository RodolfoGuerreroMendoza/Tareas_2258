package AplicacionSwing.Formula1.Modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class ModelFormula {
    private int id;
    private int edad;
    private String piloto;
    private String equipo;
    private String monoplaza;
    private int podios;
    private String uRL;

    public ModelFormula() {
    }

    public ModelFormula(int id, int edad, String piloto, String equipo, String monoplaza, int podios, String uRL) {
        this.id = id;
        this.edad = edad;
        this.piloto = piloto;
        this.equipo = equipo;
        this.monoplaza = monoplaza;
        this.podios = podios;
        this.uRL = uRL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getMonoplaza() {
        return monoplaza;
    }

    public void setMonoplaza(String monoplaza) {
        this.monoplaza = monoplaza;
    }

    public int getPodios() {
        return podios;
    }

    public void setPodios(int podios) {
        this.podios = podios;
    }

    public String getuRL() {
        return uRL;
    }

    public void setuRL(String uRL) {
        this.uRL = uRL;
    }

    @Override
    public String toString() {
        return "ModelFormula{" +
                "id=" + id +
                ", edad=" + edad +
                ", piloto='" + piloto + '\'' +
                ", equipo='" + equipo + '\'' +
                ", monoplaza='" + monoplaza + '\'' +
                ", podios=" + podios +
                ", uRL='" + uRL + '\'' +
                '}';
    }
    public ImageIcon getImagen() throws MalformedURLException {
            URL icono = new URL(this.uRL);
            return new ImageIcon(icono);
    }
}