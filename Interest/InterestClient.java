/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankOperation.Interest;

import java.rmi.*;
import java.util.Scanner;
public class InterestClient 
{
  public static void main(String args[]) throws Exception
  {
    Interest i2 = (Interest) Naming.lookup("Interest");
    Scanner s=new Scanner(System.in);
    float principal,rate;
    int year;
    System.out.println("Enter The current Investment/Principal");
    principal=s.nextFloat();
    System.out.println("Enter the Rate of Interest");
    rate=s.nextFloat();
    System.out.println("Enter the number of years");
    year =s.nextInt();
    float interestAmount = i2.getInterest(principal, year, rate);  
    System.out.println("Pay interest Birr." + interestAmount);

    String str1 = i2.getTotal();
    System.out.println(str1);
 }
}
