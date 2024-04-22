/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ConditionalStatement1;
import java.util.*;

public class ConditionalStatement1 {

  
    public static void main(String[] args) {
          public static void main(String[] args) {
              
          }
         Scanner sc = new Scanner(System.in);
        Operation op= new Operation();
        Condition con= new Condition();
        int num;
        System.out.print("Please enter number a");
        op.a=sc.nextInt();
        System.out.print("Please enter number b");
        op.b=sc.nextInt();
        System.out.print("choose between 1,2,3,4"
               + "1: add"
               + "2: sub"
               + "3: div"
               + "4: multy" );
        num=sc.nextInt();
        switch(num){
            case 1:
               op.add();
               break;
               case 2:
               op.sub();
               break;
               case 3:
               op.multy();
               break;
               case 4:
               op.div();
               break;
               default:
    }
    

