/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list_enlazada_circular;

import javax.swing.JOptionPane;

/**
 *
 * @author cesaralan
 */
public class ListaCircular {
    int n;
    Nodo n1=new Nodo(n);
   Nodo ultimo;
public ListaCircular (){
ultimo=null;

}
//metodo para saber cuando la lista esta bacia
public boolean estaVacia(){
return ultimo==null;
}



//metodo para insertar nodos

public ListaCircular  insertar(int elemento){
    n=n1.dato;
Nodo nuevo=new Nodo (elemento);
if(ultimo!=null){
nuevo.siguiente=ultimo.siguiente;
ultimo.siguiente=nuevo;
}
ultimo=nuevo;
return this;
}




//metodo para rrecorer o mostrar la lista

public void mostrarLista(){
  

Nodo auxiliar=ultimo.siguiente;
String cadena="";
do
{
cadena=cadena + "["+auxiliar.dato+"]->";
auxiliar=auxiliar.siguiente;
}
while(auxiliar!=ultimo.siguiente);
JOptionPane.showMessageDialog(null,cadena, "Modtrando la lista circular",JOptionPane.INFORMATION_MESSAGE);
}

}