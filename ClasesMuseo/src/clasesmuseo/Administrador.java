
package clasesmuseo;


public class Administrador extends Usuario{
    
    private int claveSeguridad;

    public Administrador() {
    }

    public Administrador(int claveSeguridad) {
        this.claveSeguridad = claveSeguridad;
    }

    public Administrador( String nombreUsuario, String passwordUsuario, String emailUsuario,int claveSeguridad) {
        super(nombreUsuario, passwordUsuario, emailUsuario);
        this.claveSeguridad = claveSeguridad;
    }

    public int getClaveSeguridad() {
        return claveSeguridad;
    }

    public void setClaveSeguridad(int claveSeguridad) {
        this.claveSeguridad = claveSeguridad;
    }
    
    
    
    
    
    
}
