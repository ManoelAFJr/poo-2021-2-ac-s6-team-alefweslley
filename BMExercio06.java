
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Weslley
 */
public class BMExercio06 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int dia = 1;
        while (dia>0) {            
        System.out.println("Digite um dia da semana utilizando números ex: Domingo 1 ou 0 para fechar o programa:");
        dia = ler.nextInt();
        System.out.println(RetornaDia(dia));
        }
  
    }
     public static String RetornaDia(int dia){
        String porExtenso = null;
          switch(dia){
         case 1:
                porExtenso="Domingo";
                break;
            case 2:
                porExtenso="Segunda-Feira";
                break;
                 case 3:
                porExtenso="Terça-Feira";
                break;
                case 4:
                porExtenso="Quarta-Feira";
                break;
                case 5:
                porExtenso="Quinta-Feira";
                break;
                case 6:
                porExtenso="Sexta-Feira";
                break;
                 case 7:
                porExtenso="Sábado";
                break;
        }
          if (dia>7) {
             porExtenso="Dia da semana não válido";
         }
          if(dia==0){porExtenso="";}
        return porExtenso;
     }
}
