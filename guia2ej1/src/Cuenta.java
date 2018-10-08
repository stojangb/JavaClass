public class Cuenta {
    //Atributos
    private String titular;
    private double cantidad;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public void ingresar(double cantidadaingresar){
        
        if (cantidadaingresar>0){
            cantidad = cantidad + cantidadaingresar;
        }
        
        
    
    }
    public void retirar(double cantidadaretirar){
        
        if(cantidadaretirar > cantidad){
        cantidad=0;
        }
    
    }

  
    
    
    
    
    
    
    
    
            
           
    
    
    
}
