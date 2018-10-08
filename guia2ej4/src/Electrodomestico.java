/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Qualqum experience
 */
public class Electrodomestico {
    
   private String Color;
   private double PresioBase, Peso;
   private char ConsumoEnergetico;

    public Electrodomestico(String Color, char ConsumoEnergetico, double PresioBase, double Peso) {
        this.Color = "Blanco";
        this.ConsumoEnergetico = 'F';
        this.PresioBase = 100;
        this.Peso = 5;
    }
   public Electrodomestico(){}

    public Electrodomestico(double PresioBase, double Peso) {
        this.PresioBase = PresioBase;
        this.Peso = Peso;
    }

    public String getColor() {
        return Color;
    }

    public char getConsumoEnergetico() {
        return ConsumoEnergetico;
    }

    public double getPresioBase() {
        return PresioBase;
    }

    public double getPeso() {
        return Peso;
    }
  public void comprobarConsumoEnergetico(){
   if(ConsumoEnergetico =='A' || ConsumoEnergetico =='B'||ConsumoEnergetico =='C'||ConsumoEnergetico =='D'||ConsumoEnergetico =='E'||ConsumoEnergetico =='F'){System.out.println("Color correcto");}
   else{System.out.println("Letra Incorrecta, asignando F");
   ConsumoEnergetico = 'F';
   }
   }
  public void comprobarColor(){
  if(Color=="blanco"||Color=="rojo"||Color=="azul"||Color=="negro"||Color=="gris"){
      System.out.println("Color elegido correctamente");
  }
  else{System.out.println("Color elegido incorrecto, asignando Blanco");
  
  Color = "blanco";
  }
  }
  public void precioFinal(){
  
  }
  
    
}
