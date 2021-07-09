package lse;

public class Main {
    public static void main(String[] args) {
        ListaSimplementeEnlazada listaSimplementeEnlazada = new ListaSimplementeEnlazada();

        System.out.println(listaSimplementeEnlazada.estarVacia());

        //insertar elementos a nuestra lista
        listaSimplementeEnlazada.insertar(15);
        listaSimplementeEnlazada.insertar(14);
        listaSimplementeEnlazada.insertar(13);
        listaSimplementeEnlazada.insertar(12);
        listaSimplementeEnlazada.insertar(11);
        listaSimplementeEnlazada.insertar(10);
        listaSimplementeEnlazada.insertar(9);
        listaSimplementeEnlazada.insertar(8);
        listaSimplementeEnlazada.insertar(7);
        listaSimplementeEnlazada.insertar(6);
        listaSimplementeEnlazada.insertar(5);
        listaSimplementeEnlazada.insertar(4);
        listaSimplementeEnlazada.insertar(3);
        listaSimplementeEnlazada.insertar(2);
        listaSimplementeEnlazada.insertar(1);


        //mostramos nuestra lista
        listaSimplementeEnlazada.mostrar();


        //eliminar elementos
        listaSimplementeEnlazada.eliminar();
        listaSimplementeEnlazada.eliminar();

        //mostrar nuestra lista2
        listaSimplementeEnlazada.mostrar();

        //mostrar cantidad de veces a repetir la lista
        listaSimplementeEnlazada.mostrarCirculo();

        //Insertar nodo nuevo
        listaSimplementeEnlazada.insertarFinal();


    }
}
