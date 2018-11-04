
package PaqueteConInterface;

import clasesmuseo.Galeria;
import java.util.List;
import clasesmuseo.Personal;

public interface viewGestionPersonal {
    
    public boolean crearPersonal(Personal Personal);
    public boolean eliminarPersonal(int id);
    public List<Personal> mostrarPersonal();
    public boolean actualizarPersonal (Personal Personal);
    
    
    
    
    
    
}
