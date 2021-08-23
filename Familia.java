/*
Angel Gabriel Perez Figueroa
Carné 21298
POO - 2021
*/

public class Familia {
    /****************+PROPIEDADES DE LA FAMILIA***************/
   
    private String Apellido; 
    private int patojos; 
    private int wiros;
    private int miembros;
    private int CantidadMascotas;
    private Perro[] perros = new Perro[4];
    private int index = 0; 

    
    //para crear familias
    Familia(String[] datos){
        Apellido = datos[0]; 
        patojos = Integer.parseInt(datos[1]);
        wiros  = Integer.parseInt(datos[2]);
        miembros = Integer.parseInt(datos[3]);
        CantidadMascotas = Integer.parseInt(datos[4]);        
    }
    
  public boolean getPerros(){ // Se muestra la cantidad de espacio disponible en perrera
    boolean espacioDisponible = false; 
    if(index < 3){
        espacioDisponible = true;
    } 
        return espacioDisponible; 
  
        public int getninosgrandes(){ // Mustra la cantidad total de los hijos grandes
      return wiros; 
    }
  
    public int getninospequenos() {//obtener cantidad de hijos pequeños
    return patojos;
    }
  
  }
  public void Adoptado(Perro perrito){
      /*METODOLOGIA CREADA PARA IR AGREGANDO UN PERRO NUEVO CADA VEZ QUE SE REINICIE EL SISTEMA*/
    
      if (index == 0){
          perros[0] = perrito;
          index++;
          
      
        }
      else if (index <3 ){
          perros[index+1] = perrito;
          index++; 
      
        }
       else if(index == 3){
        perros[index] = perrito;
        }
  
    }

  public String getUltimoNombre(){
      return Apellido; 
  }


}



