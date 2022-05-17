/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasdoblementeenlazadas;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Migue Rafa
 */
public class ListaDoble {

    private NodoDoble inicio, fin;
    Scanner en = new Scanner(System.in);

    public ListaDoble() {
        inicio = null;
        fin = null;
    }

    //metodo para saber cuando la lista esta vacia
    public boolean estaVacia() {
        return inicio == null;
    }

    //metodo para agregar nodos al final
    public void agregarAlFinal(int d) {
        if (!estaVacia()) {
            fin = new NodoDoble(d, null, fin);
            fin.anterior.siguiente = fin;
        } else {
            inicio = fin = new NodoDoble(d);
        }
    }

    //metodo para agregar al Inicio
    public void agregarAlInicio(int d) {
        if (!estaVacia()) {
            inicio = new NodoDoble(d, inicio, null);
            inicio.siguiente.anterior = inicio;
        } else {
            inicio = fin = new NodoDoble(d);
        }
    }

    //metodo para mostrar la lista de Inicio a Fin
    public void mostrarListaInicioFin() {
        if (!estaVacia()) {
            String datos = "<=>";
            NodoDoble auxiliar = inicio;
            while (auxiliar != null) {
                datos = datos + "[" + auxiliar.dato + "]<=>";
                auxiliar = auxiliar.siguiente;
            }
            JOptionPane.showMessageDialog(null, datos, "Mostrando lista de inicio a fin",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //metodo para mostrar la lista de Fin a Inicio
    public void mostrarListaFinInicio() {
        if (!estaVacia()) {
            String datos = "<=>";
            NodoDoble auxiliar = fin;
            while (auxiliar != null) {
                datos = datos + "[" + auxiliar.dato + "]<=>";
                auxiliar = auxiliar.anterior;
            }
            JOptionPane.showMessageDialog(null, datos, "Mostrando lista de fin a inicio",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //metodo para buscar un Nodo
    public void bascarNodo(int d) {
        NodoDoble auxiliar = inicio;
        boolean encontrado = false;
        String datos = "";
        if (inicio != null) {
            while (auxiliar != null && encontrado != true) {
                if (auxiliar.dato == d) {
                    datos = datos + "Nodo con el dato [" + auxiliar.dato + "] Encontrado";
                    encontrado = true;
                    
                    JOptionPane.showMessageDialog(null, datos, "Mostrando el Nodo encontrado",
                    JOptionPane.INFORMATION_MESSAGE);
                }
                auxiliar = auxiliar.siguiente;
            }
            if (auxiliar == null && encontrado == false) {
                JOptionPane.showMessageDialog(null, datos, "Nodo no encontrado",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            //
        }
    }
}
