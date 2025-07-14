/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankOperation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.Naming;
import java.util.Scanner;

public class BankClient {
    public static void main(String args[]) {
        int ch;
        try {
            String bankserverURL = "//localhost:1098/BankServer";
            BankIntf bankintf = (BankIntf) Naming.lookup(bankserverURL);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nEnter the UserName:");
            String s = br.readLine();
            System.out.println("\nEnter the Account Number:");
            long ac = Long.parseLong(br.readLine());
            System.out.println("\nEnter the Initial Amount:");
            int amt = Integer.parseInt(br.readLine());
            do {
                System.out.println("\n\t1.Withdraw\n\t2.Deposit\n\t3.Balance\n\t4.Calculate Interest\n\t5.Exit");
                System.out.println("\nEnter your choice:");
                ch = Integer.parseInt(br.readLine());
                switch (ch) {
                    case 1:
                        System.out.println("\nEnter amount of Withdraw:");
                        int wd = Integer.parseInt(br.readLine());
                        System.out.println("\nUserName:" + s);
                        System.out.println("Account Number:" + ac);
                        if (wd > amt)
                            System.out.println("Balance less unable to proceed withdraw");
                        else {
                            amt = bankintf.withdraw(wd, amt);
                            System.out.println("Balance:" + amt);
                        }
                        break;
                    case 2:
                        System.out.println("\nEnter amount of deposit:");
                        int dp = Integer.parseInt(br.readLine());
                        System.out.println("\nUserName:" + s);
                        System.out.println("Account Number:" + ac);
                        amt = bankintf.deposit(dp, amt);
                        System.out.println("Balance:" + amt);
                        break;
                    case 3:
                        System.out.println("\nUserName:" + s);
                        System.out.println("Account Number:" + ac);
                        amt = bankintf.balance(amt);
                        System.out.println("Balance:" + amt);
                        break;
                    case 4:
                        Scanner sc = new Scanner(System.in);
                        float principal, rate;
                        int year;
                        System.out.println("Enter The current Investment/Principal");
                        principal = sc.nextFloat();
                        System.out.println("Enter the Rate of Interest");
                        rate = sc.nextFloat();
                        System.out.println("Enter the number of years");
                        year = sc.nextInt();
                        float interestAmount = bankintf.getInterest(principal, year, rate);
                        System.out.println("Pay interest Birr." + interestAmount);
                        String str1 = bankintf.getTotal();
                        System.out.println(str1);
                        break;
                }
            } while (ch < 5);
        } catch (Exception e) {
            System.out.println("Exception :" + e);
        }
    }
}
