/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author PC
 */
class DIT {
     String name = "DAR ES SALAAM INSTITUTE OF TECHNOLOGY";
     String ID="DIT/20678";
    
    void DisplayInfo(){
         System.out.println("DIT - ABOUT US \n ");
         System.out.println("Name > " +name);
         System.out.println("ID > "+ID);
        
    }

     void Location(){
         System.out.println("Location > Bibi Titi and Morogoro Road \n ");
         
    }
      void Colors(){
        System.out.println("Colors > Blue and White \n ");
    }
       String Leadership(){
           System.out.println("Mwinuka \n");
         return name;          
        
    }
    
}
