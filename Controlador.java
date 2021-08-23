

/*
Angel Gabriel Perez Figueroa
Carné 21298
POO - 2021
*/

public class Controlador {

    public static void main(String[] args) {
        Vista view = new Vista(); 
        Perrera casa = new Perrera(); 
        int opcion = 0;
        
        //En las intrucciones se solictan 3 familias iniciales ya Preestablecidas, se ingresan valores aleatorios
        String[] Preest1 = {"Perez","1","0","4","0"}; 
        String[] Preest2 = {"Figueroa","0","3","1","0"}; 
        String[] Preest3 = {"Gutierrez","3","4","2","1"}; 
        
        casa.AddFamiliaPreestablecida(Preest1);
        casa.AddFamiliaPreestablecida(Preest2);
        casa.AddFamiliaPreestablecida(Preest3);
        
        
        while (opcion != 4){
        opcion = view.Menu();
        
        //El menu se puede encontrar en la clase vista
        
        
        switch (opcion){
            //opcion para agregar un nueva familia
            
            case 1 -> {
            casa.AddFamilia(view.datosFamilia());
            }
            
            
            case 2 -> {
            casa.AgregarPerro(view.datosPerro());//añadir nuevo perro
            }
            
            case 3 -> {//buscar una familia para los perros
                casa.BuscarNuevaFamilia();
            }
            
                
           case 4 -> {// Si el usuario ingresa un numero diferente a los solicitados
               view.Show("ERROR: valor indefinido");
           }
    }
 }
}
}