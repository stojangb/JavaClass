package clasesmuseo;

public class Autores {
    
    private String nombre;
    private String id;
    private Fecha FechaNacimiento;
    private Fecha FechaDefuncion;
    private String Nacionalidad;
    private String Pais;
    private String IdPais;
    private String Descripcion;
    
    private boolean anonimo;

    
    public Autores() {
    }

    public Autores(String nombre, String id, Fecha FechaNacimiento, Fecha FechaDefuncion, String Nacionalidad, String Pais, String IdPais, String Descripcion, boolean anonimo) {
        this.nombre = nombre;
        this.id = id;
        this.FechaNacimiento = FechaNacimiento;
        this.FechaDefuncion = FechaDefuncion;
        this.Nacionalidad = Nacionalidad;
        this.Pais = Pais;
        this.IdPais = IdPais;
        this.Descripcion = Descripcion;
        this.anonimo = anonimo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Fecha getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Fecha FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public Fecha getFechaDefuncion() {
        return FechaDefuncion;
    }

    public void setFechaDefuncion(Fecha FechaDefuncion) {
        this.FechaDefuncion = FechaDefuncion;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getIdPais() {
        return IdPais;
    }

    public void setIdPais(String IdPais) {
        this.IdPais = IdPais;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public boolean isAnonimo() {
        return anonimo;
    }

    public void setAnonimo(boolean anonimo) {
        this.anonimo = anonimo;
    }

    
    
    
    
}
