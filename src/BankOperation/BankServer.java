/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankOperation;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class BankServer {
    public static void main(String args[]) {
        try {
            Registry r = LocateRegistry.createRegistry(1098);
            BankImpl bankimpl = new BankImpl();
            r.rebind("BankServer", bankimpl);
            System.out.println("Serevr is ready");
        } catch (Exception e) {
            System.out.println("Exception :" + e);
        }
    }
}
