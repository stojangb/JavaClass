package clasesmuseo;


public class Personal {
    
    private int id;
    private String nombre;
    private int rut;
    private String direccion;
    private int telefono;
    private String username;
    private String password;
    private String Cargo;
    private String Especialidades;
    // Pueden abrir mas galerias, gestionar obras, etc.
    //LOGIN usuario?
    // 2 implementaciones de busqueda?? rut e id  deriba a clase restaurador hereda metodos...  1 autos varias obras

    public Personal() {
    }

    public Personal(int id, String nombre, int rut, String direccion, int telefono, String username, String password, String Cargo, String Especialidades) {
        this.id = id;
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.telefono = telefono;
        this.username = username;
        this.password = password;
        this.Cargo = Cargo;
        this.Especialidades = Especialidades;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getEspecialidades() {
        return Especialidades;
    }

    public void setEspecialidades(String Especialidades) {
        this.Especialidades = Especialidades;
    }
    
    
    
    
    
}
