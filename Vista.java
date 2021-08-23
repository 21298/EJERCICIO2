
import java.util.Scanner;
import java.util.ArrayList; 

/*
Angel Gabriel Perez Figueroa
Carné 21298
POO - 2021
*/

public class Vista {
    Scanner sc = new Scanner(System.in); 
    Scanner string = new Scanner(System.in); 
    
    public int Menu(){ // Inicialmente en el análsiss se tenia una cantidad de 5 opciones, pero al analizar más a fondo se optó por realizar solo 4 opciones
        
//************************************************************************************************************************************************************************* */
        System.out.println(" Bienvenido 'ADOPTA UN PERRO'\n¿Que acción deseas ejecutar?");
        System.out.println("1. Nueva Familia");
        System.out.println("2. Nuevo perro");
        System.out.println("3. Registro Familia");
        System.out.println("4. Salir");
        
        int opcion = sc.nextInt();
        return opcion;   
    }
    
    public String[] datosPerro(){
        //crear el array
       String[] datosperrito = new String[6];
                
       //solicitar los datos y agregarlos al array
       System.out.println("ingrese nombre");
        String nombre = string.nextLine();   
        datosperrito[0] = nombre; 
        
        System.out.println("ingrese la raza del perro");
        String raza = string.nextLine();
        datosperrito[1] = raza.toUpperCase(); 
        
        System.out.println("Ingrese el tamaño del perro (pequeno (pequeño),mediano,grande)");
        String tamano = string.nextLine();
        datosperrito[3] = tamano;  
        
        System.out.println("Ingrese el color del perro");
        String color = string.nextLine();
        datosperrito[4] = color;
        
        System.out.println("Ingrese la edad del perro");
        int edad = sc.nextInt();
        String edades = String.valueOf(edad);
        datosperrito[2] = edades ; 
       
        System.out.println("Ingrese la salud del perro");
        int EstadoSalud = sc.nextInt();
        String Salud = String.valueOf(EstadoSalud); 
        datosperrito[5] = Salud;
        
        return datosperrito;
        
    }
    
    /**************************************************************************************************************************/
    //metodologia == ["nombre", "pequeno", "grande", "tamaño", "Masoctas"]

    public String[] datosFamilia(){//ingreso de datos para crear una familia
        String[] datosFamilia = new String[5];
        
        System.out.println("¿Cuál es el apellido de la familia que desea agregar?");
        String nombre = string.nextLine();   
        datosFamilia[0] = nombre; 
        
        System.out.println("¿Cuantos niños menores a 10 años tiene su familia?, nótese que si no tiene ninguno, ingrese 0");
        
        int pequeno = sc.nextInt();
        String Tpequeno = String.valueOf(pequeno);
        datosFamilia[1] = Tpequeno; 
        
        System.out.println("¿Cuantos niños mayores a 10 años tiene su familia?, nótese que si no tiene ninguno, ingrese 0");
        
        int grande= sc.nextInt();
        String Tgrande = String.valueOf(grande);
        datosFamilia[2] = Tgrande ; 
        
        System.out.println("¿Cuantos miembros tiene su familia?");
        
        int tamano = sc.nextInt();
        String Ttamano = String.valueOf(tamano);
        datosFamilia[3] = Ttamano;  
        
        System.out.println("¿Cuantas mascotas tiene su familia?");
        
        int CantidadMascotas = sc.nextInt();
        String Mascotas = String.valueOf(CantidadMascotas);
        datosFamilia[4] = Mascotas;
        
        
        
        
        return datosFamilia;
    }
    

    /********************************************************************************/
    // Muestra los mensajes de los datos recolectados


    public void Show(String show){
        System.out.println(show);
    }
}
