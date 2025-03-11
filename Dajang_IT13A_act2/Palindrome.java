/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midterm;

import java.util.Scanner

public class Palindrome {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = in.nextLine();
        
        String reversed = "";
        
        for (int y = word.length() - 1; y >= 0; y--) {
            reversed += word.charAt(y);
            
        }
        if (word.equalsIgnoreCase(reversed)){
            System.out.println(word.toLowerCase()+ " is a palindrome");
            
        } else {
            System.out.println(word.toLowerCase() + " is NOT a palindrome");
        
       
        }
    }
 
    
}
