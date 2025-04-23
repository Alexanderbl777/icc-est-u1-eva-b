package views;

import models.Boook;

public class ViewsConsole {
    

    public void mostrarLista(Boook[] list){
        System.out.println("Lista");
        for (Boook l : list) {
            System.out.println(l);
        }

    }

    public void imprimirMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
