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
public class principal {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        
        Estudiante student = new Estudiante("Stojan", "Hombre", 21, 65, 1.70, 197593091, 7);
        student.mostrarDatos();
        
  
        
        String uno = "stojan";
        String dos = "Hombre";
        int tres = 12;
        int cuatro = 0;
       
        
        Estudiante student2 = new Estudiante(uno, dos, tres, 65, 1.70, 197593091, 7);
        student2.mostrarDatos();
      
    }
    
    
    
}
