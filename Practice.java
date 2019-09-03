/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author Michael Paluda
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scandog = new Scanner(System.in);
        
        
        
        
 
        while (true) {            
         double decimal = 0;
         
         System.out.println("b (binary), o (octal), h (hexadecimal):");
         String choice = scandog.nextLine();
         while (!choice.equals("o") && !choice.equals("b") && !choice.equals("h"))
         {
         System.out.println("b (binary), o (octal), h (hexadecimal):");
         choice = scandog.nextLine();
         } 
         switch (choice) {
             case "h":
                 System.out.println("Enter a hexadecimal (or stop): ");
                 break;
             case "o":
                System.out.println("Enter an octal (or stop): ");
                 break; 
             case "b":
                 System.out.println("Enter a binary (or stop): ");
                 break; 
        }
         
         
         
        
        String inputString = scandog.nextLine();
        inputString = inputString.trim();
        
        
        if (inputString.equals("stop")) {
            break;
        
        }
        
        
        
        switch (choice) {
             case "h":
                 decimal = hextodecimal(inputString);
                 break;
             case "o":
                 decimal = octaltodecimal(inputString);
                 break; 
             case "b":
                 decimal = binarytodecimal(inputString);
                 break; 
        }
        
        
        
        
        
         System.out.printf("The decimal is : %.4f\n", decimal);
         
        }
        
    }
    public static double hextodecimal(String hex) {
        String hexadecimal = hex;
        double decimal = 0;
        if (!hexadecimal.contains(".")) {
        
        for (int counter = 0 ; counter < hexadecimal.length(); counter++) {
            
            
            switch (hexadecimal.charAt(counter)) {
                case '1':
                    decimal += 1 * Math.pow(16, hexadecimal.length() - counter - 1);    
                    break;
                case '2':
                    decimal += 2 * Math.pow(16, hexadecimal.length() - counter - 1);    
                    break;
                case '3':
                    decimal += 3 * Math.pow(16, hexadecimal.length() - counter - 1);    
                    break;
                case '4':
                    decimal += 4 * Math.pow(16, hexadecimal.length() - counter - 1);    
                    break;
                    
                case '5':
                    decimal += 5 * Math.pow(16, hexadecimal.length() - counter - 1);    
                    break;
                case '6':
                    decimal += 6 * Math.pow(16, hexadecimal.length() - counter - 1);    
                    break;
                case '7':
                    decimal += 7 * Math.pow(16, hexadecimal.length() - counter - 1);    
                    break;
                case '8':
                    decimal += 8 * Math.pow(16, hexadecimal.length() - counter - 1);    
                    break;
                    
                case '9':
                    decimal += 9 * Math.pow(16, hexadecimal.length() - counter - 1);    
                    break;
                case 'A':
                    decimal += 10 * Math.pow(16, hexadecimal.length() - counter - 1);    
                    break;
                case 'B':
                    decimal += 11 * Math.pow(16, hexadecimal.length() - counter - 1);    
                    break;
                case 'C':
                    decimal += 12 * Math.pow(16, hexadecimal.length() - counter - 1);    
                    break;
                    
                case 'D':
                    decimal += 13 * Math.pow(16, hexadecimal.length() - counter - 1);    
                    break;
                case 'E':
                    decimal += 14 * Math.pow(16, hexadecimal.length() - counter - 1);    
                    break;
                case 'F':
                    decimal += 15 * Math.pow(16, hexadecimal.length() - counter - 1);    
                    break;
                case 'a':
                    decimal += 10 * Math.pow(16, hexadecimal.length() - counter - 1);    
                    break;
                case 'b':
                    decimal += 11 * Math.pow(16, hexadecimal.length() - counter - 1);    
                    break;
                case 'c':
                    decimal += 12 * Math.pow(16, hexadecimal.length() - counter - 1);    
                    break;
                    
                case 'd':
                    decimal += 13 * Math.pow(16, hexadecimal.length() - counter - 1);    
                    break;
                case 'e':
                    decimal += 14 * Math.pow(16, hexadecimal.length() - counter - 1);    
                    break;
                case 'f':
                    decimal += 15 * Math.pow(16, hexadecimal.length() - counter - 1);    
                    break;
                    
                default:
                    decimal += 0;
            }
            }
        
        } else { 
            
            for (int counter = 0 ; counter < hexadecimal.indexOf("."); counter++) {
            
            
            switch (hexadecimal.charAt(counter)) {
                case '1':
                    decimal += 1 * Math.pow(16, hexadecimal.indexOf(".") - counter - 1);    
                    break;
                case '2':
                    decimal += 2 * Math.pow(16, hexadecimal.indexOf(".") - counter - 1);    
                    break;
                case '3':
                    decimal += 3 * Math.pow(16, hexadecimal.indexOf(".") - counter - 1);    
                    break;
                case '4':
                    decimal += 4 * Math.pow(16, hexadecimal.indexOf(".") - counter - 1);    
                    break;
                    
                case '5':
                    decimal += 5 * Math.pow(16, hexadecimal.indexOf(".") - counter - 1);    
                    break;
                case '6':
                    decimal += 6 * Math.pow(16, hexadecimal.indexOf(".") - counter - 1);    
                    break;
                case '7':
                    decimal += 7 * Math.pow(16, hexadecimal.indexOf(".") - counter - 1);    
                    break;
                case '8':
                    decimal += 8 * Math.pow(16, hexadecimal.indexOf(".") - counter - 1);    
                    break;
                    
                case '9':
                    decimal += 9 * Math.pow(16, hexadecimal.indexOf(".") - counter - 1);    
                    break;
                case 'A':
                    decimal += 10 * Math.pow(16, hexadecimal.indexOf(".") - counter - 1);    
                    break;
                case 'B':
                    decimal += 11 * Math.pow(16, hexadecimal.indexOf(".") - counter - 1);    
                    break;
                case 'C':
                    decimal += 12 * Math.pow(16, hexadecimal.indexOf(".") - counter - 1);    
                    break;
                    
                case 'D':
                    decimal += 13 * Math.pow(16, hexadecimal.indexOf(".") - counter - 1);    
                    break;
                case 'E':
                    decimal += 14 * Math.pow(16, hexadecimal.indexOf(".") - counter - 1);    
                    break;
                case 'F':
                    decimal += 15 * Math.pow(16, hexadecimal.indexOf(".") - counter - 1);    
                    break;
                case 'a':
                    decimal += 10 * Math.pow(16, hexadecimal.indexOf(".") - counter - 1);    
                    break;
                case 'b':
                    decimal += 11 * Math.pow(16, hexadecimal.indexOf(".") - counter - 1);    
                    break;
                case 'c':
                    decimal += 12 * Math.pow(16, hexadecimal.indexOf(".") - counter - 1);    
                    break;
                    
                case 'd':
                    decimal += 13 * Math.pow(16, hexadecimal.indexOf(".") - counter - 1);    
                    break;
                case 'e':
                    decimal += 14 * Math.pow(16, hexadecimal.indexOf(".") - counter - 1);    
                    break;
                case 'f':
                    decimal += 15 * Math.pow(16, hexadecimal.indexOf(".") - counter - 1);    
                    break;
                    
                default:
                    decimal += 0;
            }
            }
            
            for (int counter = hexadecimal.indexOf(".") + 1 ; counter < hexadecimal.length(); counter++) {
            
            
            switch (hexadecimal.charAt(counter)) {
                case '1':
                    decimal += 1 * Math.pow(16, hexadecimal.indexOf(".") - counter);    
                    break;
                case '2':
                    decimal += 2 * Math.pow(16, hexadecimal.indexOf(".") - counter);    
                    break;
                case '3':
                    decimal += 3 * Math.pow(16, hexadecimal.indexOf(".") - counter);    
                    break;
                case '4':
                    decimal += 4 * Math.pow(16, hexadecimal.indexOf(".") - counter);    
                    break;
                    
                case '5':
                    decimal += 5 * Math.pow(16, hexadecimal.indexOf(".") - counter);    
                    break;
                case '6':
                    decimal += 6 * Math.pow(16, hexadecimal.indexOf(".") - counter);    
                    break;
                case '7':
                    decimal += 7 * Math.pow(16, hexadecimal.indexOf(".") - counter);    
                    break;
                case '8':
                    decimal += 8 * Math.pow(16, hexadecimal.indexOf(".") - counter);    
                    break;
                    
                case '9':
                    decimal += 9 * Math.pow(16, hexadecimal.indexOf(".") - counter);    
                    break;
                case 'A':
                    decimal += 10 * Math.pow(16, hexadecimal.indexOf(".") - counter);    
                    break;
                case 'B':
                    decimal += 11 * Math.pow(16, hexadecimal.indexOf(".") - counter);    
                    break;
                case 'C':
                    decimal += 12 * Math.pow(16, hexadecimal.indexOf(".") - counter);    
                    break;
                    
                case 'D':
                    decimal += 13 * Math.pow(16, hexadecimal.indexOf(".") - counter);    
                    break;
                case 'E':
                    decimal += 14 * Math.pow(16, hexadecimal.indexOf(".") - counter);    
                    break;
                case 'F':
                    decimal += 15 * Math.pow(16, hexadecimal.indexOf(".") - counter);    
                    break;
                case 'a':
                    decimal += 10 * Math.pow(16, hexadecimal.indexOf(".") - counter);    
                    break;
                case 'b':
                    decimal += 11 * Math.pow(16, hexadecimal.indexOf(".") - counter);    
                    break;
                case 'c':
                    decimal += 12 * Math.pow(16, hexadecimal.indexOf(".") - counter);    
                    break;
                    
                case 'd':
                    decimal += 13 * Math.pow(16, hexadecimal.indexOf(".") - counter);    
                    break;
                case 'e':
                    decimal += 14 * Math.pow(16, hexadecimal.indexOf(".") - counter);    
                    break;
                case 'f':
                    decimal += 15 * Math.pow(16, hexadecimal.indexOf(".") - counter);    
                    break;
                    
                default:
                    decimal += 0;
            }
            }
            
           
        }
        
        
        
        return decimal;
    
    }
    
    public static double octaltodecimal(String octal) {
        String octal1 = octal;
        double decimal = 0;
        
        if (!octal1.contains(".")) {
            
        
        
        
        for (int counter = 0 ; counter < octal1.length(); counter++) {
            
            
            switch (octal1.charAt(counter)) {
                case '1':
                    decimal += 1 * Math.pow(8, octal1.length() - counter - 1);    
                    break;
                case '2':
                    decimal += 2 * Math.pow(8, octal1.length() - counter - 1);    
                    break;
                case '3':
                    decimal += 3 * Math.pow(8, octal1.length() - counter - 1);    
                    break;
                case '4':
                    decimal += 4 * Math.pow(8, octal1.length() - counter - 1);    
                    break;
                    
                case '5':
                    decimal += 5 * Math.pow(8, octal1.length() - counter - 1);    
                    break;
                case '6':
                    decimal += 6 * Math.pow(8, octal1.length() - counter - 1);    
                    break;
                case '7':
                    decimal += 7 * Math.pow(8, octal1.length() - counter - 1);    
                    break;
                
                    
                default:
                    decimal += 0;
            }
            }
        
        } else {
            
            for (int counter = 0 ; counter < octal1.indexOf("."); counter++) {
            
            
            switch (octal1.charAt(counter)) {
                case '1':
                    decimal += 1 * Math.pow(8, octal1.indexOf(".") - counter - 1);    
                    break;
                case '2':
                    decimal += 2 * Math.pow(8, octal1.indexOf(".") - counter - 1);    
                    break;
                case '3':
                    decimal += 3 * Math.pow(8, octal1.indexOf(".") - counter - 1);    
                    break;
                case '4':
                    decimal += 4 * Math.pow(8, octal1.indexOf(".") - counter - 1);    
                    break;
                    
                case '5':
                    decimal += 5 * Math.pow(8, octal1.indexOf(".") - counter - 1);    
                    break;
                case '6':
                    decimal += 6 * Math.pow(8, octal1.indexOf(".") - counter - 1);    
                    break;
                case '7':
                    decimal += 7 * Math.pow(8, octal1.indexOf(".") - counter - 1);    
                    break;
                
                    
                default:
                    decimal += 0;
            
            
        }
        
            }
            
            for (int counter = octal1.indexOf(".") + 1 ; counter < octal1.length(); counter++) {
            
            
            switch (octal1.charAt(counter)) {
                case '1':
                    decimal += 1 * Math.pow(8, octal1.indexOf(".") - counter);    
                    break;
                case '2':
                    decimal += 2 * Math.pow(8, octal1.indexOf(".") - counter );    
                    break;
                case '3':
                    decimal += 3 * Math.pow(8, octal1.indexOf(".") - counter );    
                    break;
                case '4':
                    decimal += 4 * Math.pow(8, octal1.indexOf(".") - counter );    
                    break;
                    
                case '5':
                    decimal += 5 * Math.pow(8, octal1.indexOf(".") - counter );    
                    break;
                case '6':
                    decimal += 6 * Math.pow(8, octal1.indexOf(".") - counter );    
                    break;
                case '7':
                    decimal += 7 * Math.pow(8, octal1.indexOf(".") - counter );    
                    break;
                
                    
                default:
                    decimal += 0;
            
            
        }
        
            }
            
            
            
            
        }
        
        return decimal;
    
    }
    
    public static double binarytodecimal(String bininput) {
        String bin = bininput;
        double decimal = 0;
        
        if (!bin.contains("."))  {
        
        for (int counter = 0 ; counter < bin.length(); counter++) {
            
            
            switch (bin.charAt(counter)) {
                case '1':
                    decimal += 1 * Math.pow(2, bin.length() - counter - 1);    
                    break;
                
                
                    
                default:
                    decimal += 0;      }
            }
        
        } else {
          for (int counter = 0 ; counter < bin.indexOf("."); counter++) {
            
            
            switch (bin.charAt(counter)) {
                case '1':
                    decimal += 1 * Math.pow(2, bin.indexOf(".") - counter - 1);    
                    break;
                
                
                    
                default:
                    decimal += 0;      }
            }
          
          for (int counter = bin.indexOf(".") + 1 ; counter < bin.length(); counter++) {
            
            
            switch (bin.charAt(counter)) {
                case '1':
                    decimal += 1 * Math.pow(2, bin.indexOf(".") - counter);    
                    break;
                
                
                    
                default:
                    decimal += 0;      }
            }
            
        }
        
        return decimal;
    
    }
       
    }
    

    
