package lse;

import java.util.Scanner;

public class ListaSimplementeEnlazada {
    Nodo primero;
    Nodo ultimo;


    public ListaSimplementeEnlazada(){
        primero = null;
    }

    public boolean estarVacia(){
        return primero == null;
    }


    public void insertar (Object dato){
        if (estarVacia()){
            Nodo nuevo = new Nodo(dato, null);
            primero = nuevo;
        }else {
            Nodo nuevo = new Nodo(dato, primero);
            primero = nuevo;

        }
    }

    public void insertarV2(Object dato){

        if (estarVacia()){
            Nodo nuevo = new Nodo(dato);
            primero = nuevo;
            ultimo = nuevo;
        }else {
            Nodo nuevo  = new Nodo(dato);
            Nodo aux;
            aux = primero;
            while(aux.siguiente != null){
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
            ultimo = nuevo;
        }
    }

    public void eliminar(){
        if (!estarVacia()){
            primero = primero.getSiguiente();
        }
    }

    public void mostrar(){
        Nodo tmp = primero;
        while (tmp != null){
            System.out.println(tmp.getDato() + "   ");

            tmp = tmp.getSiguiente();
        }
        System.out.println();
    }

    public void mostrarCirculo(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introducir las repeticiones de la lista entree 1 a 15 : ");
        int dato = teclado.nextInt();
        while (dato>=16){
            System.out.print("Solo puede repetir 15 veces");
            dato = teclado.nextInt();
        }
        for (int i = 0; i < dato; i++) {
            System.out.print(" ");
            mostrar();
        }
        if (dato == 1){
            System.out.print("!! Introduciste 1 la lista solo se muestra una vez ...");
            System.out.println();
        }
    }
    public void insertarFinal(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introducir el nuevo numero para agregar a la lista que no sea de 1 a 15 : ");
        int datos = teclado.nextInt();
        boolean prueba=false;
        while(prueba ==false){
            if(datos<=15){
                System.out.print("Introducir el nuevo numero para agregar a la lista que no sea de 1 a 15 : ");
                datos = teclado.nextInt();
                prueba=false;
            }else{
                insertarV2(datos);
                prueba = true;
                mostrar();
            }
        }

    }



}


