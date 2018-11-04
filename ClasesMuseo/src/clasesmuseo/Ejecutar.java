package clasesmuseo;

import PaqueteConInterface.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejecutar {

    static CRUDGaleria gal = new CRUDGaleria();
    static CRUDPersonal per = new CRUDPersonal();

    public static void main(String[] args) {
        //Aquí al parecer se hace todo...
        Scanner leer = new Scanner(System.in);
        Usuario usuario1 = new Usuario();

        System.out.println("Usted desea ingresar como: Recuerde que el usuario y la contraseña son: user  \n 1: Administrador \n 2: Usuario");
        int opcion;
        opcion = leer.nextInt();

        switch (opcion) {
            case 1: {
                System.out.println("Ingresando como administrador");
                Administrador adm = new Administrador();
                System.out.println("Ingrese usuario");
                String nombreUsuario = leer.next();
                System.out.println("Ingrese contraseña");
                String passwordUsuario = leer.next();
                // Usuario: user Contraseña: user
                if (adm.login(nombreUsuario, "user", passwordUsuario, "user") == true) {

                    int volver = 0;
                    while (volver == 0) {
                        System.out.println("******¿Que desea hacer?******\n 1: Ver todos los usuarios\n 2: Crear Usuario\n 3: Eliminar usuario\n 4: Actualizar Usuario\n 5: Ingresar como usuario\n 6: Salir");

                        int menu = leer.nextInt();

                        switch (menu) {
                            case 1: {
                                mostrarPersonal();
                                break;
                            }
                            case 2: {
                                
                                Personal G4 = new Personal();
                                G4.setNombre("alberto");
                                per.crearPersonal(G4);
                                break;
                            }
                            case 3: {
                                mostrarPersonal();
                                break;
                            }
                            case 4: {
                                mostrarPersonal();
                                break;
                            }
                            case 5: {
                                mostrarPersonal();
                                break;
                            }
                            case 6: {
                                volver = 1;
                                break;
                            }
                        }

                        System.out.println("¿Desea volver al menu? \n 1: Sí\n 2: No");
                        int tecla = leer.nextInt();
                        if (tecla == 2) {
                            volver = 1;
                        }
                    }
                }
                break;
            }

            case 2: {
                System.out.println("Ingresando como Usuario... Necesita crear un usuario primero, ingrese como administrador");

                break;

            }

        }
    }

    public static void agregarGaleria() {
        Galeria G2 = new Galeria();
        G2.setId(2);
        G2.setNombreGaleria("Olivia");
        G2.setUbicacionGaleria("Washington");
        gal.crearGaleria(G2);
        
    }

    public static void agregarPersonal() {
//        Personal G3 = new Personal();
//        G3.setId(2);
//        
//        G3.setNombre("herusalen");
//        
//      
//      
//        per.crearPersonal(G3);
    }

    //finaliza per personal
    public static void mostrarGaleria() {

        List<Galeria> lista = new ArrayList<Galeria>();
        lista = gal.mostrarGaleria();
        for (Galeria ga : lista) {
            System.out.println("Datos de la Galeria: \n ID: " + ga.getId() + "\n Nombre: " + ga.getNombreGaleria() + "\nUbicacion: " + ga.getUbicacionGaleria());
        }

    }

    public static void mostrarPersonal() {

        List<Personal> lista = new ArrayList<Personal>();
        lista = per.mostrarPersonal();
        for (Personal per : lista) {
            System.out.println("Datos del Personal: "
                    + "\nID: " + per.getId()
                    + "\nNombre: " + per.getNombre() 
                    + "\nRut: " + per.getRut()
                    + "\nTelefono: " + per.getTelefono()
                    + "\nDireccion: " + per.getDireccion()
                    + "\nCargo: " + per.getCargo()
                    + "\nEspecialidad: " + per.getEspecialidades()
                    + "\nUsuario: " + per.getUsername()
                    + "\nContraseña: " + per.getPassword());
        }

    }

    public static void actualizarGaleria() {
        Galeria G2 = new Galeria();
        G2.setId(5);
        G2.setNombreGaleria("Change");
        G2.setUbicacionGaleria("Palo Alto");
        gal.crearGaleria(G2);

    }

    public static void actualizarPersonal() {
        Personal G22 = new Personal();
        G22.setId(5);

        G22.setNombre("Paulo");

        G22.setDireccion("Pacheco Altamirano 2930");

        per.crearPersonal(G22);

    }

}
