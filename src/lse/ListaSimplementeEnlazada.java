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
        if (datos <= 15){
            System.out.print("El numero ya existe en la lista ...");
            datos = teclado.nextInt();
        }else {

        }
        mostrar();

    }
    


}
