package org.example;

import java.util.Random;

public class Paciente {
    Random aleatorio = new Random();
    private static final char DEF_GENERO='X';
    private static final int DEF_INFRAPESO =-1;
    private static final int DEF_IDEAL = 0;
    private static final int DEF_SOBREPESO =+1;
    private String nombre;
    private String DNI;
    private int edad;
    private char genero;
    private double peso;
    private int altura;

    public Paciente(String nombre, int edad, char genero, double peso, int altura){
        this.nombre = nombre;
        this.edad = edad;
        DNI = generateDNI();
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }
    public Paciente(){
        this(null,0,DEF_GENERO,0,0);
    }
    public int calcularIMC(){
        double IMC = peso / Math.pow(altura,2);
        if (IMC < 20){
            return DEF_INFRAPESO;
        } else if (IMC > 25) {
            return DEF_SOBREPESO;
        }else {
            return DEF_IDEAL;
        }
    }

    private String generateDNI(){
        String dni = "";

        for (int i = 0; i < 8; i++) {
            int num = aleatorio.nextInt(10);
            dni = dni + num;
        }

        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int dni_num = Integer.parseInt(dni);

        int dividir = dni_num % 23;

        dni += letras[dividir];

        return dni;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


}
