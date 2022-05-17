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
public class ListasDoblementeEnlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        int opcion = 0, d;
        Scanner en = new Scanner(System.in);

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un Nodo al Inicio\n"
                        + "2. Agregar un Nodo al Final\n"
                        + "3. Mostrar la Lista de Inicio a Fin\n"
                        + "4. Mostrar la Lista de Fin a Inicio\n"
                        + "5. Buscar Nodo\n"
                        + "6. Salir\n"
                        + "Qué deseas hacer?", "Menú de Opciones",
                        JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        d = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el d del Nodo", "Agregando Nodos al Inicio",
                                JOptionPane.INFORMATION_MESSAGE));
                        lista.agregarAlInicio(d);
                        break;

                    case 2:
                        d = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el d del Nodo", "Agregando Nodos al Final",
                                JOptionPane.INFORMATION_MESSAGE));
                        lista.agregarAlFinal(d);
                        break;

                    case 3:
                        if (!lista.estaVacia()) {
                            lista.mostrarListaInicioFin();
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay Nodos aun",
                                    "Lista vacía", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case 4:
                        if (!lista.estaVacia()) {
                            lista.mostrarListaFinInicio();
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay Nodos aun",
                                    "Lista vacía", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case 5:
                        if (!lista.estaVacia()) {
                            d = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el Nodo a buscar", "Buscar Nodo",
                                    JOptionPane.INFORMATION_MESSAGE));
                            lista.bascarNodo(d);
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay Nodos aun",
                                    "Lista vacía", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Aplicación Finalizada",
                                "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "La Opcion no esta en el Menú",
                                "Fin", JOptionPane.INFORMATION_MESSAGE);

                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "error" + n.getMessage());
            }
        } while (opcion != 6);
    }
}
