package clasesmuseo;


public class Visitantes {
    
    
    private Fecha FechaDeIngreso;
    private int Edad;
    private String NombreCompleto;
    private int Rut;

    public Visitantes() {
    }

    public Visitantes(Fecha FechaDeIngreso, int Edad, String NombreCompleto, int Rut) {
        this.FechaDeIngreso = FechaDeIngreso;
        this.Edad = Edad;
        this.NombreCompleto = NombreCompleto;
        this.Rut = Rut;
    }

    public Fecha getFechaDeIngreso() {
        return FechaDeIngreso;
    }

    public void setFechaDeIngreso(Fecha FechaDeIngreso) {
        this.FechaDeIngreso = FechaDeIngreso;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public int getRut() {
        return Rut;
    }

    public void setRut(int Rut) {
        this.Rut = Rut;
    }
    
    
    
    private void valorEntrada(){
        //niño,estudiante,adultomayor,entradageneral,diadepatrimonio
    
    }
        // Se puede implementar:
        // contador visitantes por dia, mes, año 
       
                                                                                            
                                                                                            
    
}
