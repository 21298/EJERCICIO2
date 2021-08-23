/*
Angel Gabriel Perez Figueroa
Carné 21298
POO - 2021
*/


public class Perro {
    /****************PROPIEDADES********************/

    private String nombre;
    private String raza; 
    private int edad;
    private String tamano; 
    private int salud;
    private String color; 
    
    private boolean Adoptado = false; //Como dato preestablecido se muestra que el acto de perro adoptado es inicialmente falso a menos que se adopte
    
    Perro(String[] datos){// Estos son los datos que se solicitan conocer del perro.
        
        //PROPIEDADES Y CARACTERISTICAS RECIBIDAS
        nombre = datos[0];
        raza = datos[1].toUpperCase(); 
        edad =  Integer.parseInt(datos[2]); // pasar a valores numericos
        tamano = datos[3].toUpperCase();
        salud = Integer.parseInt(datos[5]); // pasar a valores numericos
        color = datos[4];
        
    }
    
    /******************** Se toman los valores(Propiedades del perro) ****************/

    public String getRaza(){// Muestra la raza del perro
        return raza;
    }
    
    public String gettamano(){// Muestra el tamaño del perro
        return tamano;
    }
    
    public boolean getforma(){ // Indica la forma en que se encuentra el perro, es decir (ADOPTADO O TODAVÍA NO)
        return Adoptado;
    }
    
    public void setforma(boolean forma){ // Muestra que el perro ya ha sido adoptado
        Adoptado = forma;
    }
    
    public String nombre(){// Muestra el nombre ingresado con anterioridad
        return nombre; 
    }
    
    
}
