
package clasesmuseo;

import java.util.Objects;


// Personal seria un tipo de usuario


public class Usuario {
    
    private String nombreUsuario;
    private String passwordUsuario;
    private String emailUsuario;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, String passwordUsuario, String emailUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.passwordUsuario = passwordUsuario;
        this.emailUsuario = emailUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }
    
    
    
    
    public boolean login(String nombreUsuario,String PosibleNombreUsuario, String passwordUsuario,String PosiblePasswordUsuario){
        
        
        
        if ((nombreUsuario.equals(PosibleNombreUsuario)== true)  && (passwordUsuario.equals(PosiblePasswordUsuario))){
        System.out.println("Bienvenido usted ha ingresado correctamente");
        return true;
            
        }
        else{
            System.out.println("Usuario o contraseña incorrecta");
        return false;
        }
}

    
    
    
    
}
