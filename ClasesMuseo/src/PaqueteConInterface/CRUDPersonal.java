package PaqueteConInterface;

import clasesmuseo.Galeria;
import java.util.ArrayList;
import java.util.List;
import clasesmuseo.Personal;


public class CRUDPersonal implements viewGestionPersonal{
    
    
    List<Personal> mostrarPersonal = new ArrayList<Personal>();

    @Override
    public boolean crearPersonal(Personal Personal) {
        try{
        mostrarPersonal.add(Personal);
        }catch(Exception e){
        return false;
        }
        return true;
    }

    @Override
    public boolean eliminarPersonal(int id) {
        for (Personal per:mostrarPersonal){
        if(per.getId()==id){
        mostrarPersonal.remove(per);
        }
        }
        return false;
    }

    @Override
    public List<Personal> mostrarPersonal() {
        
        return mostrarPersonal;
    }

    @Override
    public boolean actualizarPersonal(Personal Personal) {
        for (Personal GalG:mostrarPersonal){
        if(GalG.getId()==Personal.getId()){
        mostrarPersonal.remove(GalG);
        mostrarPersonal.add(Personal);
        
        
        }}
        return false;
    }
    
    
    
}
