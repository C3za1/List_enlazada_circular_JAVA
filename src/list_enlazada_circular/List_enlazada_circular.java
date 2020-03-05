/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list_enlazada_circular;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author cesaralan
 */
public class List_enlazada_circular {

    public static void main(String[] args) {
 List_Enlazada lis = new List_Enlazada();
 ListaCircular lc=new ListaCircular();
        int opc;
        int num;
        Scanner sc=new Scanner (System.in);
  String ope;
       
    do
    {
        ope=JOptionPane.showInputDialog(null,"1.Ingresar" +" "+ "2.Visualizar"+""+"3.NumPar"+"4.numparle");
                                             
        
        switch(ope){
            case"1":
              num = sc.nextInt();
              lis.Ingresar(num);
                System.out.println("--------------------------------------------");
                break;
                
            case"2":
               // d1.imprimir();
                    lis.Visualizar();
              break;  
                
            case "3":    
                lc.mostrarLista();
          
            default:
                JOptionPane.showMessageDialog(null, "opcion invalida");
                break;
            case "4":
                lis.NumParle();
        }
        }
    while(!ope.equals("4"));
        
    }
}
    
    

