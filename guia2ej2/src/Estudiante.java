/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Qualqum experience
 */
public class Estudiante extends Persona{
    
    private int CodigoEstudiante;
    private int NotaEstudiante; // solo de 1 a 7 entero.

    public Estudiante(String nombre, String sexo, int edad, double peso, double altura,int CodigoEstudiante, int NotaEstudiante) {
        super(nombre, sexo, edad, peso, altura);
        this.CodigoEstudiante = CodigoEstudiante;
        this.NotaEstudiante = NotaEstudiante;
    }
    
    
    public void mostrarDatos(){
        System.out.println("Nombre del estudiante: "+getNombre()+"\n Nota del estudiante: "+ NotaEstudiante+"\nSexo del estudiante: "+getSexo()+"\npeso del estudiante: "+getPeso()+"\nEdad del estudiante: "+getEdad()+"\nAltura del estudiante: "+getAltura()+"\nCodigo del estudiante: "+CodigoEstudiante);
    
    }
    
    public void MayorDeEdad(){
        if(getEdad()>17){
        System.out.println("El estudiante es mayor de edad");
        }
        else{
            System.out.println("El estudiante es menor de edad");
        }
    }
}
