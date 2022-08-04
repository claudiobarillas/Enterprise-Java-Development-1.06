package model;

import java.util.Date;

public class Empleado {

    private String name;
    private int edad;
    private boolean pasante;
    private int salario;
    private Date antiguedad;


    public Empleado(String name, int edad, boolean pasante, int salario, Date antiguedad){
        setName(name);
        setEdad(edad);
        setPasante(pasante);
        setSalario(salario);
        this.antiguedad = antiguedad;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEdad(int edad) {
        if (edad >= 18)
        this.edad = edad;
    }

    public void setPasante(boolean pasante) {
        this.pasante = pasante;
    }

    public void setSalario(int salario) {
        if (pasante = true && salario <= 2000) {
            this.salario = salario;
        }else if (pasante = false && salario > 1000){
            this.salario = salario;
        }
    }

    public String getName() {
        return name;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isPasante() {
        return pasante;
    }

    public int getSalario() {
        return salario;
    }

    public Date getAntiguedad() {
        return antiguedad;
    }
}
