package PaqueteConInterface;

import clasesmuseo.Galeria;
import java.util.ArrayList;
import java.util.List;


public class CRUDGaleria implements viewGestionGaleria{
    
    
    List<Galeria> mostrarGaleria = new ArrayList<Galeria>();

    @Override
    public boolean crearGaleria(Galeria Galeria) {
        try{
        mostrarGaleria.add(Galeria);
        }catch(Exception e){
        return false;
        }
        return true;
    }

    @Override
    public boolean eliminarGaleria(int id) {
        for (Galeria per:mostrarGaleria){
        if(per.getId()==id){
        mostrarGaleria.remove(per);
        }
        }
        return false;
    }

    @Override
    public List<Galeria> mostrarGaleria() {
        
        return mostrarGaleria;
    }

    @Override
    public boolean actualizarGaleria(Galeria Galeria) {
        for (Galeria GalG:mostrarGaleria){
        if(GalG.getId()==Galeria.getId()){
        mostrarGaleria.remove(GalG);
        mostrarGaleria.add(Galeria);
        
        
        }}
        return false;
    }
    
    
    
}
