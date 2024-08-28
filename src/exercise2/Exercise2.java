/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int n = rand.nextInt(100) + 1; 
        String check;
        
        do {
            System.out.print("Nhap vao 'yes' de tiep tuc hoac bat ky de kiem tra va thoat: ");
            check = scanner.nextLine();
            
            if (check.equals("yes")) {
                if (n % 2 == 0) {
                    System.out.println(n + " la so chan");
                } else {
                    System.out.println(n + " la so le");
                }
            } else {
                if (n % 2 == 0) {
                    System.out.println(n + " la so chan");
                } else {
                    System.out.println(n + " la so le");
                }
                break; 
            }
        } while (true);
        
        scanner.close();
        // TODO code application logic here
    }
    
}
