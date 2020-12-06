/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mandhan_pranjal.fractionreducer;

import java.util.Scanner;

/** Assignment: U3A2P3 - Fraction Reducer 
 * Date: Friday October 16th 2020
 * @author Pranjal Mandhan
 * Description: This program allows users to reduce fractions 
 */ 
public class Mandhan_PranjalFractionReducer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //asking the user for the variables
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your Numerator");
        int num = Integer.parseInt(scan.nextLine());
        System.out.println("What is you Denominator");
        int den = Integer.parseInt(scan.nextLine());
        
        //displaying the answer
        System.out.println("The reduced version of " + num + "/" + den + " is " + Fraction(num, den));
       
    }
    //finds the greatest common denominator 
    static public int GCD (int N, int D) {
        if (D == 0) {
            return N;
        } else {
            return GCD(D, N%D);
        }    
    }
    //reduces the orginal fraction into the simplest one
    static public String Fraction (int n, int d) {
        int gcd = GCD(n, d);
        return (n / gcd) + "/" + (d / gcd);
    }
            
    
}
