
package PaqueteConInterface;

import clasesmuseo.Galeria;
import java.util.List;

public interface viewGestionGaleria {
    
    public boolean crearGaleria(Galeria Galeria);
    public boolean eliminarGaleria(int id);
    public List<Galeria> mostrarGaleria();
    public boolean actualizarGaleria (Galeria Galeria);
    
    
    
    
    
    
}
