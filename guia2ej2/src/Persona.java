/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Qualqum experience
 */
import java.util.Scanner;
public class Persona {
    Scanner ss = new Scanner(System.in);
    
  private String nombre, sexo;
  private int edad;
  private double peso,altura;
 
 
  
  public Persona(String sexo){
  this.sexo = "hombre";
  }//esto es posible?

    public Persona(String nombre, String sexo, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
  
    
  
  
    
}
