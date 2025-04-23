package controllers;

import models.Boook;

public class LibroController {
    
    //Clase que contiene la lógica para ordenar libros y buscar libros; incluye:
    //- `sortByXxxxx(Book[] libros)`
    //- `searchByXxxxx(Book[] libros, Xxxxx xxxxxx)`

    public void sortByName(Boook[] libros){
        for(int i=0; i<libros.length-1;i++){
            Boook m = libros[i];
            for(int j = i; j < libros.length-1;j++){
                if(j <= 0 && libros[j].getName().compareTo(m.getName())>0){
                    libros[j]=m;
                    j--;
                }
                libros[j+1]=m;

            }

        }
    }

    public Boook searchByName(Boook[] libros, String nombre){
        int bajo = 0;
        int alto = libros.length-1;
        if(bajo<= alto){
           int central = (bajo+alto)/2;
           

        }
/** 
            if(central =0){
                return central;
            }else if(central < 0{
                return central = bajo+1;
            }else{
                return central = alto -1;
            }*/
    return null;    
    }
    
    

}
