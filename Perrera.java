import java.util.ArrayList;

/*
Angel Gabriel Perez Figueroa
Carné 21298
POO - 2021
*/

public class Perrera {
   
   /*****************PROPIEDADES DE LA PERRERA*************************/

    private ArrayList<Perro> perros = new ArrayList<>();  
   private Familia[] familias = new Familia[15];
   private int contador = 0;
   private String[] PerrosPeligrosos = {"PIT BULL TERRIER", 
                                        "AMERICAN STAFFORDSHIRE TERRIER",
                                        "TOSA INU",
                                        "firulaisO ARGENTINO",
                                        "firulaisO GUATEMALTECO",
                                        "FILA BRASILEÑO",
                                        "PRESA CANARIO",
                                        "DÓBERMAN",
                                        "GRAN PERRO JAPONÉS",
                                        "MASTÍN NAPOLITANO",
                                        "PRESA MALLORQUI",
                                        "firulaisO DE BURDEOS",
                                        "BULLMASTIFF",
                                        "BULL TERRIER INGLÉS",
                                        "BULLfirulais AMERICANO",
                                        "RHODESIANO",
                                        "ROTTWEILER"}; 
   
   Vista view = new Vista(); 
   
   
   
   
 //**********Agrega los datos de los perros cada vez que se inicia con un nuevo perro**************//

   public void AgregarPerro(String[] datos){ 
       Perro perrito = new Perro ( datos );
       perros.add(perrito);  
   }
   public void AddFamiliaPreestablecida (String[] datos){ 
     
    /*****************CADA VEZ QUE SE INICIA PARA UNA NUEVA FAMILIA*************/
    
    if (contador == 0){ 
         familias[0] = new Familia(datos);
         contador++;
    } else {
         familias[contador + 1 ] = new Familia(datos);
         contador++; 
         
    }
}
   
   public void AddFamilia(String[] datos){
    if (contador <= 15){
    familias[contador ] = new Familia(datos);
    contador++;  
     } 
   }
   

   /*MUESTRA LAS RAZAS PELIGROSAS, DEJANDO COMO DATO POR DEFAULT EL ESTADO COMO VERDADERO*/

   public boolean peligro(Perro a) {
    boolean forma = false;
    for(String raza: PerrosPeligrosos){
    if(a.getRaza().equals(raza)){
    forma = true;
    break; 
    }
    }
return forma;    
}

/********************************************************************************************************************************************************************/
/*TUVE QUE TOMAR TUTORIAS PARA PODER ENTENDER Y PODER EXPRESAR TODO DE UNA MANERA MÁS SENCILLA Y FACIL DE COMPRENDER*/
//SE UTILIZARON LOS ARRAYLIST PARA EVITAR ESTAR DECLARANDO EL TAMAÑO DE LAS PROPIEDADES UNA POR UNA COMO SERÍA AL HACERLO SOLAMENTE CON ARRAYS.
/********************************************************************************************************************************************************************/
//ESTA ERA UNA IDEA INICIAL, PERO DEBIDO A MUCHA COMPLEJIDAD POR REALIZAR CONTEOS Y PROGRAMACIÓN DEFENSIVA, SE OPTÓ POR TOMAR COMO USO, LOS ARRAYLIST.
/********************************************************************************************************************************************************************/

/*
public void Agregar(Perro a){
       int index = 0;
       for(Perro p: shushos){//recorrer lista para hallar ulytimo indice
        if(p != null){
            index++;
        }
    }
       if(index == 0){
           shushos[0] = a;
       }
       else if(index > 0 && index < shushos.length - 1){
           shushos[index + 1] = a;
       }
       else if(index == shushos.length - 1){
           Ampliarlista(); //aumentar tamaño de lista
            index = 0;
           for(Perro p: shushos){//recorrer lista para hallar ulytimo indice
            if(p != null){
            index++;
            }    
            }
            shushos[index + 1] = a;
       }
   }
   public void Ampliarlista(){
       int index = 0;
       for(Perro p: shushos){//recorrer lista para hallar ulytimo indice
        if(p != null){
            index++;
        }
       datosAntiguos = new Perro[index]; // contener
       int indexold = 0;
       for(Perro CHUCHITO: shushos){
           if(CHUCHITO != null){
           datosAntiguos[indexold] = CHUCHITO; 
           index++;
       }
       }
      shushos = new Perro[datosAntiguos.length+20]; 
      int indexnew = 0;
      for(Perro CHUCHITO: datosAntiguos){
          shushos[indexnew] = CHUCHITO;
          indexnew++; 
      } 
   }
   }
*/

/**********************************************************************************************************************************/



   public void BuscarNuevaFamilia() {


       if(perros.isEmpty() != true){//verificar que la lista de perros si contenga elementos en su interior
       
        for(Perro firulais: perros){ //recorrer  aperros
           
            if(firulais.getforma() == false){ //ver que no esté Adoptadoado el perro
                boolean pelirgoso = peligro(firulais); // ver si presenta algún peligro el perro
            for(Familia fam : familias){ //recorrer las familias
               
                if(fam != null){
                    
                    if(fam.getPerros()){ // ver que la familia tenga espacio
                        
                        if(pelirgoso == true){ 
                            
                            /*********************** PERRO PELIGROSO, PERO NO HAY NIÑOS PEQUEÑOS || O SON NIÑOS GRANDES *******************/
                            if(fam.getninospequenos() == 0 && fam.getninosgrandes() == 0){
                                

                                /************************Muestra que el perro si es fue adoptado****************/
                                fam.Adoptado(firulais);
                                firulais.setforma(true);
                      
                                    view.Show("El perro: " + firulais.nombre() ); 
                                    view.Show("con raza: " + firulais.getRaza() + "y con un tamaño" + firulais.gettamano() );
                                    view.Show("Ha sido adoptado por la Familia: " + fam.getUltimoNombre());
                                    break;
                            }
                       
                       
                        } 
                        
                    else {
                       
                        /**********************SI ES PEQUEÑO y hay niños pequeños****************************/
                        if(fam.getninospequenos() > 0 && firulais.gettamano() == "Pequeño" ){ 
                            fam.Adoptado(firulais);
                            firulais.setforma(true);
                      
                            view.Show("El perro: " + firulais.nombre() ); 
                            view.Show("con raza: " + firulais.getRaza() + "y con un tamaño" + firulais.gettamano() );
                            view.Show("Ha sido adoptad@ por la familia: " + fam.getUltimoNombre());
                            break;

                        } 
                       
                        /*********************PERRO PEQUEÑO Y HAY NIÑOS GRANDES******************/
                        else if(fam.getninosgrandes() > 0) { 
                           if (firulais.gettamano() == "Pequeño" || firulais.gettamano() == "Grande"){
                            
                                fam.Adoptado(firulais);
                                firulais.setforma(true);
                            
                                view.Show("El perro: " + firulais.nombre() ); 
                                view.Show("con raza: " + firulais.getRaza() + "y con un tamaño" + firulais.gettamano() );
                                view.Show("Ha sido adoptad@ por la familia: " + fam.getUltimoNombre());
                                break;
                           
                            } 
                        
                        /******************NO HAY NIÑOS EN LA FAMILIA***************************/
                        else{ 
                            fam.Adoptado(firulais);
                            firulais.setforma(true);
                      
                            view.Show("El perro: " + firulais.nombre() ); 
                            view.Show("con raza: " + firulais.getRaza() + "y con un tamaño" + firulais.gettamano() );
                            view.Show("Ha sido adoptad@ por la familia: " + fam.getUltimoNombre());
                             break;
                            }
                        }
                   
                    }
               
                    }
           
                }    
       
 
       
            }  
            }
         }
        }
     }
}
