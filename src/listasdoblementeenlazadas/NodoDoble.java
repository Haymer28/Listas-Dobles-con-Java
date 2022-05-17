/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasdoblementeenlazadas;

/**
 *
 * @author Migue Rafa
 */
public class NodoDoble {

    public int dato;
    NodoDoble siguiente, anterior;

    //Constructor para cuando aun no hay nodos
    public NodoDoble(int d) {
        this(d, null, null);
    }

    //Constructor para cuando ya hay nodos
    public NodoDoble(int d, NodoDoble s, NodoDoble a) {
        dato = d;
        siguiente = s;
        anterior = a;
    }

}
