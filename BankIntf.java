
package BankOperation;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BankIntf extends Remote 
{ 
int withdraw(int a,int amt)throws RemoteException; 
int deposit(int b,int amt)throws RemoteException; 
int balance(int amt)throws RemoteException; 
} 
