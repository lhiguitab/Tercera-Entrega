import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void asignarCasillerosAleatorios(String[] bloques, int[] casilleros) {
        Random random = new Random();

        for (int i = 0; i < bloques.length; i++) {
            casilleros[i] = random.nextInt(33); 
        }
    }

    public static void mostrarDisponibilidadCasilleros(String[] bloques, int[] casilleros) {
        System.out.println("Disponibilidad de casilleros:");
        for (int i = 0; i < bloques.length; i++) {
            System.out.println("En el " + bloques[i] + " hay " + casilleros[i] + " casilleros disponibles.");
        }
    }

      public static void inicioSesion() {
          Scanner kb = new Scanner(System.in);
          System.out.println("Ingresa Tu Nombre de Usuario: ");
          String usuario = kb.nextLine();
          System.out.println("Ingresa Tu Contraseña: ");
          String contrasena = kb.nextLine();
          System.out.println(" ");
          System.out.println("Inicio de sesión realizado con exito. Bienvenido " + usuario);
  }
  
    public static void registroUsuario() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Ingresa Tu Nombre Completo: ");
        String nombre = kb.nextLine();
        System.out.println("Ingresa Tu Correo Electrónico de la Universidad: ");
        String correo = kb.nextLine();
        System.out.println("Ingresa Tu Nombre de Usuario: ");
        String usuario = kb.nextLine();
        System.out.println("Ingresa Tu Contraseña: ");
        String contrasena = kb.nextLine();
        System.out.println(" ");
        System.out.println("Cuenta creada de forma exitosa. Bienvenido " + nombre);
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("Desea sincronizar su correo electronico para recibir todo tipo de informacion relacionada con sus reservas: ");
        String sincronizar = kb.nextLine();
      
        if (sincronizar.equals("si")) {
          System.out.println("Se ha sincronizado de forma exitosa su cuenta con el correo registrado.");
        } else if (sincronizar.equals("no")) {
          System.out.println("Entendido, recuerde que pueda sincronizar su cuenta con el correo desde los ajustes de su perfil.");
        } else {
          System.out.println("Respuesta inválida. Ingrese SI o NO.");
    }
}     

    public static void reservarCasillero() {
    int bloque; 
    int seccion;
    Scanner kb = new Scanner(System.in);
    String opcion;
      
    System.out.print("Desea realizar una reserva o cancelar una reserva (realizar / cancelar): ");
    opcion = kb.nextLine();
      if (opcion.equals("realizar")) {
   
        System.out.print("Seleccione el bloque en el que desea reservar su casillero (1 - 38): ");
        bloque = kb.nextInt();

  if (bloque < 1 || bloque > 38) {
      System.out.println("Bloque inválido. Por favor seleccione un bloque entre 1 y 38");
    }

      if (bloque == 1 || bloque == 2 || bloque == 3 || bloque == 4 || bloque == 5 || bloque == 6 || bloque == 8 || bloque == 9 || bloque == 10 || bloque == 11 || bloque == 12 || bloque == 18 || bloque == 20 || bloque == 21 || bloque == 22 || bloque == 24 || bloque == 25 || bloque == 26 || bloque == 27 || bloque == 28 || bloque == 29 || bloque == 30 || bloque == 31 || bloque == 32 || bloque == 36 || bloque == 37){
      System.out.println("No hay casilleros existentes en el bloque seleccionado.");
      }

  if (bloque == 7) {
      System.out.println("Seleccione en que seccion desea reservar su casillero (# 1, 2)");
      seccion = kb.nextInt();
    if (seccion == 1 || seccion == 2) {
      System.out.println("Su reserva se hizo correctamente. ¡Recuerde que tiene 15 minutos para activarla en la sección que haya elegido!");
    } else {
      System.out.println("Seccion inválida.");
    }
  }

  if (bloque == 13) {
      System.out.println("Seleccione en que seccion desea reservar su casillero (# 24)");
    seccion = kb.nextInt();
    if (seccion == 24) {
      System.out.println("Su reserva se hizo correctamente. ¡Recuerde que tiene 15 minutos para activarla en la sección que haya elegido!");
    } else {
      System.out.println("Seccion inválida.");
    }
  }

  if (bloque == 14) {
      System.out.println("Seleccione en que seccion desea reservar su casillero (# 12, 23)");
    seccion = kb.nextInt();
    if (seccion == 12 || seccion == 23) {
      System.out.println("Su reserva se hizo correctamente. ¡Recuerde que tiene 15 minutos para activarla en la sección que haya elegido!");
    } else {
      System.out.println("Seccion inválida.");
    }
  }

  if (bloque == 15) {
      System.out.println("Seleccione en que seccion desea reservar su casillero (# 8)");
    seccion = kb.nextInt();
    if (seccion == 8) {
      System.out.println("Su reserva se hizo correctamente. ¡Recuerde que tiene 15 minutos para activarla en la sección que haya elegido!");
    } else {
      System.out.println("Seccion inválida.");
    }
  }

  if (bloque == 16) {
      System.out.println("Seleccione en que seccion desea reservar su casillero (# 3, 25)");
    seccion = kb.nextInt();
    if (seccion == 3 || seccion == 25) {
      System.out.println("Su reserva se hizo correctamente. ¡Recuerde que tiene 15 minutos para activarla en la sección que haya elegido!");
    } else {
      System.out.println("Seccion inválida.");
    }
  }

  if (bloque == 17) {
      System.out.println("Seleccione en que seccion desea reservar su casillero (# 7, 26)");
    seccion = kb.nextInt();
    if (seccion == 7 || seccion == 26) {
      System.out.println("Su reserva se hizo correctamente. ¡Recuerde que tiene 15 minutos para activarla en la sección que haya elegido!");
    } else {
      System.out.println("Seccion inválida.");
    }
  }

  if (bloque == 19) {
      System.out.println("Seleccione en que seccion desea reservar su casillero (# 4)");
    seccion = kb.nextInt();
    if (seccion == 4) {
      System.out.println("Su reserva se hizo correctamente. ¡Recuerde que tiene 15 minutos para activarla en la sección que haya elegido!");
    } else {
      System.out.println("Seccion inválida.");
    }
  }

  if (bloque == 23){
    System.out.println("Seleccione en que seccion desea reservar su casillero (# 9, 13)");
    seccion = kb.nextInt();
    if (seccion == 9 || seccion == 13) {
      System.out.println("Su reserva se hizo correctamente. ¡Recuerde que tiene 15 minutos para activarla en la sección que haya elegido!");
    } else {
      System.out.println("Seccion inválida. Por favor seleccion");
    }
  }

  if (bloque == 33) {
    System.out.println("Seleccione en que seccion desea reservar su casillero (# 14, 15, 97)");
    seccion = kb.nextInt();
    if (seccion == 14 || seccion == 15 || seccion == 97) {
      System.out.println("Su reserva se hizo correctamente. ¡Recuerde que tiene 15 minutos para activarla en la sección que haya elegido!");
    } else {
      System.out.println("Seccion inválida. Por favor seleccion");
    } 
  }

  if (bloque == 34) {
    System.out.println("Seleccione en que seccion desea reservar su casillero (# 16, 17)");
    seccion = kb.nextInt();
    if (seccion == 16 || seccion == 17) {
      System.out.println("Su reserva se hizo correctamente. ¡Recuerde que tiene 15 minutos para activarla en la sección que haya elegido!");
    } else {
      System.out.println("Seccion inválida. Por favor seleccion");
    } 
  }

  if (bloque == 35) {
    System.out.println("Seleccione en que seccion desea reservar su casillero (# 18, 19)");
    seccion = kb.nextInt();
    if (seccion == 18 || seccion == 19) {
      System.out.println("Su reserva se hizo correctamente. ¡Recuerde que tiene 15 minutos para activarla en la sección que haya elegido!");
    } else {
      System.out.println("Seccion inválida. Por favor seleccion");
    } 
  }

  if (bloque == 38) {
    System.out.println("Seleccione en que seccion desea reservar su casillero (# 20, 21, 22 , 28)");
    seccion = kb.nextInt();
    if (seccion == 20 || seccion == 21 || seccion == 22 || seccion == 28) {
      System.out.println("Su reserva se hizo correctamente. ¡Recuerde que tiene 15 minutos para activarla en la sección que haya elegido!");
    } else {
      System.out.println("Seccion inválida. Por favor seleccion");
    }
  }
} 
      else if(opcion.equals("cancelar")) {
     System.out.println("Su reserva a sido cancelada de manera exitosa.");   
  }
      else {
        System.out.println("Respuesta inválida. Ingrese SI o NO.");
      }
}
  

    public static int Mi_casillero(Scanner kb, String[] ingreso_objetos, int contador) {
        System.out.println("Bienvenido a la opción MI CASILLERO !!!");
        System.out.println("Ingrese los objetos que dejará en el casillero (o escriba 'fin' para terminar):");
        kb.nextLine();

        while (contador < ingreso_objetos.length) {
            System.out.print((contador + 1) + ": ");

            String objeto = kb.nextLine();
            if (objeto.equals("fin")) {
                break;
            }

            ingreso_objetos[contador] = objeto;
            contador++;
        }

        return contador;
    }

    public static void imprimirCasillero(String[] arreglo, int contador) {
        System.out.println("Objetos que tienes en el casillero:");
        for (int i = 0; i < contador; i++) {
            System.out.println((i + 1) + ": " + arreglo[i]);
        }
    }

    public static void MostrarCasilleros() {
        Scanner kb = new Scanner(System.in);
        int bloque;
      
        System.out.println("Los casilleros están organizados en secciones de 32 casilleros cada una. ");
        System.out.println();
        System.out.println("En esta forma:");
        System.out.println("* * * * || * * * *");
        System.out.println("* * * * || * * * *");
        System.out.println("* * * * || * * * *");
        System.out.println("* * * * || * * * *");
        System.out.println();

      System.out.print("¿En qué bloque está buscando su casillero?: ");
        bloque = kb.nextInt();

      if (bloque < 1 || bloque > 38) {
         System.out.print("Bloque inválido. Por favor seleccione un bloque entre 1 y 38: ");
         bloque = kb.nextInt();
       }
      
      switch (bloque) {
            
        case 7:           
          System.out.println("En el bloque 7 hay 2 secciones de casilleros en el primer piso (# 1 y 2). ");               
          break;             
        case 13:                
          System.out.println("En el bloque 13 hay 1 seccion de casilleros en el segundo piso (# 24). ");               
          break;         
        case 14:                    
          System.out.println("En el bloque 14 hay 1 seccion de casilleros en el primer y segundo piso (# 12 y 23). ");                       
          break;         
        case 15:                   
          System.out.println("En el bloque 15 hay 1 seccion de casilleros en el segundo piso (# 8). ");                   
          break;
        case 16:                          
          System.out.println("En el bloque 16 hay 2 secciones de casilleros en el segundo piso (# 3 y 25). ");                          
          break;                      
        case 17:                            
          System.out.println("En el bloque 17 hay 2 secciones de casilleros en el segundo piso (# 7 y 26). ");                        
          break;  
        case 19:               
          System.out.println("En el bloque 19 hay 1 seccion de casilleros en el primer piso (# 4). ");               
          break;    
        case 23:                   
          System.out.println("En el bloque 23 hay 2 secciones de casilleros en el primer piso (# 13 y 09). ");                
          break;                
        case 33:                         
          System.out.println("En el bloque 33 hay 3 secciones de casilleros en el primer piso (# 97, 14 y 15 ). ");         
          break;                   
        case 34:                         
          System.out.println("En el bloque 34 hay 2 secciones de casilleros en el primer piso (# 16 y 17 ). ");                          
          break;                     
        case 35:                        
          System.out.println("En el bloque 35 hay 2 secciones de casilleros en el primer piso (# 18 y 19). ");                       
          break;        
        case 38:                         
          System.out.println("En el bloque 38 hay 1 seccion de casilleros en el primer piso (# 20) y 3 secciones de casilleros en el segundo piso (# 21, 22 y 28. ");                        
          break;
          
        default:              
          System.out.println("En este bloque NO hay casilleros existentes.");
      }
    }

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int tamanoArreglo = 15;
    String[] ingreso_objetos = new String[tamanoArreglo];
    int contador = 0;
    boolean salir = false;

    while (!salir) {
    System.out.println("Ingrese la opción que necesita:");
    System.out.println("1. Registro de Usuario");
    System.out.println("2. Iniciar Sesión");
    System.out.println("3. Hacer o cancelar reserva de casillero");
    System.out.println("4. Ingresar objetos a Mi Casillero");
    System.out.println("5. Mostrar los objetos que tiene en el casillero");
    System.out.println("6. Mostrar Casilleros");
    System.out.println("7. Mostrar Disponibilidad de Casilleros");
    System.out.println("8. Salir de la aplicación");

      int opcion = kb.nextInt();
      System.out.println();
      switch (opcion) {
        case 1:
        registroUsuario();
        break;
        case 2:
        inicioSesion();
        break;
        case 3:
        reservarCasillero();
        break;
        case 4:
        contador = Mi_casillero(kb, ingreso_objetos, contador);
        break;
        case 5:
        imprimirCasillero(ingreso_objetos, contador);
        break;
        case 6:
        MostrarCasilleros();
        break;
        case 7:
        String[] bloquesUniversidad = {
        "Bloque 7", "Bloque 13", "Bloque 14", "Bloque 15", "Bloque 16", "Bloque 17", "Bloque 19", "Bloque 23", "Bloque 33", "Bloque 34", "Bloque 35", "Bloque 38"
        };

        int[] casillerosDisponibles = new int[bloquesUniversidad.length];

        asignarCasillerosAleatorios(bloquesUniversidad, casillerosDisponibles);
        mostrarDisponibilidadCasilleros(bloquesUniversidad, casillerosDisponibles);
        break;
        case 8:
        salir = true;
          System.out.println("Saliendo de la aplicacion...");
        break;
        default:
        System.out.println("Opción no válida");
            }
            System.out.println();
    }
  }
}