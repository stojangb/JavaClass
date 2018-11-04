
package clasesmuseo;


public class Galeria {
    
    
   private String nombreGaleria;
   private String ubicacionGaleria;
   private int id;

    public Galeria() {
    }



    public Galeria(String nombreGaleria, String ubicacionGaleria, int id) {
        this.nombreGaleria = nombreGaleria;
        this.ubicacionGaleria = ubicacionGaleria;
        this.id = id;
    }

    public String getNombreGaleria() {
        return nombreGaleria;
    }

    public void setNombreGaleria(String nombreGaleria) {
        this.nombreGaleria = nombreGaleria;
    }

    public String getUbicacionGaleria() {
        return ubicacionGaleria;
    }

    public void setUbicacionGaleria(String ubicacionGaleria) {
        this.ubicacionGaleria = ubicacionGaleria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
