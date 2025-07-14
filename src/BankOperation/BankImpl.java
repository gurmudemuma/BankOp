/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankOperation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BankImpl extends UnicastRemoteObject implements BankIntf {
    private float interest, principle;

    public BankImpl() throws RemoteException {
    }

    public int withdraw(int a, int amt) throws RemoteException {
        amt = amt - a;
        return (amt);
    }

    public int deposit(int b, int amt) throws RemoteException {
        amt = amt + b;
        return (amt);
    }

    public int balance(int amt) throws RemoteException {
        return (amt);
    }

    public float getInterest(float principle, int time, float rate) throws RemoteException {
        this.principle = principle;
        interest = (principle * time * rate) / 100;
        return interest;
    }

    public String getTotal() throws RemoteException {
        String str = "Pay Birr." + (principle + interest) + " to clear the debt completely";
        return str;
    }
}
