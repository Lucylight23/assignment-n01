/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       // System.out.println("Hello World---");
        Scanner sc = new Scanner(System.in);
        DIT di = new DIT ();
        ComputerStudies co = new ComputerStudies();
       /* co.DisplayInfo();
        co.Location();
        co.Colors();
        co.Leadership();
     */
       
       int choice;
       choice=1;
       System.out.println("Menu : \n"
       + "1: About Us   \n"
       + "2: Location   \n"
       + "3: Colors     \n"
       + "4: Leadership \n"
       + "5: Module     \n");
       
       while(choice<6){
           System.out.println("Enter Choice");
           choice=sc.nextInt();
           
               switch(choice){
                   case 1:
                       co.DisplayInfo();
                       break;
                       
                   case 2:
                       co.Location();
                       break;
                       
                   case 3:
                       co.Colors();
                       break;
                       
                   case 4:
                       co.Leadership();
                       break;
                      
                    case 5:
                       co.module();
                       break;
               
               }
            choice++;
       }        
    }
    
    
}
