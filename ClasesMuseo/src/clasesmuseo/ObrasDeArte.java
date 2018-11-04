
package clasesmuseo;


public class ObrasDeArte {
    
    private String Titulo;
    private String Id;
    private String Tipo; //pinturas, esculturas.
    private Fecha FechaCreacion;
    private Fecha FechaIngreso;
    private Fecha FechaColocacion;
    private Fecha FechaDadaDeBaja;
    private String Descripcion;
    //cada obra 1 autor

    public ObrasDeArte() {
    }

    public ObrasDeArte(String Titulo, String Id, String Tipo, Fecha FechaCreacion, Fecha FechaIngreso, Fecha FechaColocacion, Fecha FechaDadaDeBaja, String Descripcion) {
        this.Titulo = Titulo;
        this.Id = Id;
        this.Tipo = Tipo;
        this.FechaCreacion = FechaCreacion;
        this.FechaIngreso = FechaIngreso;
        this.FechaColocacion = FechaColocacion;
        this.FechaDadaDeBaja = FechaDadaDeBaja;
        this.Descripcion = Descripcion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Fecha getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(Fecha FechaCreacion) {
        this.FechaCreacion = FechaCreacion;
    }

    public Fecha getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(Fecha FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public Fecha getFechaColocacion() {
        return FechaColocacion;
    }

    public void setFechaColocacion(Fecha FechaColocacion) {
        this.FechaColocacion = FechaColocacion;
    }

    public Fecha getFechaDadaDeBaja() {
        return FechaDadaDeBaja;
    }

    public void setFechaDadaDeBaja(Fecha FechaDadaDeBaja) {
        this.FechaDadaDeBaja = FechaDadaDeBaja;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

  
    
    
    
    
    
    
    
}
