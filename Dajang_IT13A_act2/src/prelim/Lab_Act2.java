/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prelim;

import java.util.Scanner;
public class Lab_Act2 {
    
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        
        //taking three numbers as input
        System.out.println("Input the 1st number ");
        int n1 = in.nextInt();
        
        System.out.println("Input the 2nd number ");
        int n2 = in.nextInt();
        
        System.out.println("Input the 3rd number ");
        int n3 = in.nextInt();
        
        //finding the greatest number
        int greatest = n1;
        if (n2> greatest ) {
            greatest = n2;
        }
        
        if (n3 > greatest){
            greatest = n3;
           
        }
        
        //printing the greatest number
        System.out.println("The greatest number is; " + greatest);
        
        
        
    }
    
}
