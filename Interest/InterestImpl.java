/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankOperation.Interest;

import java.rmi.*;                  
import java.rmi.server.*;          
public class InterestImpl extends UnicastRemoteObject implements Interest
{
  float interest, principle;
  public InterestImpl() throws RemoteException
  {
    super();
  }
  public float getInterest(float principle, int time, float rate) throws RemoteException
  {
    this.principle=principle;
    interest = (principle*time*rate)/100;
    return interest;
  }
  public String getTotal() throws RemoteException
  {
    String str = "Pay Birr." +(principle+interest)+ " to clear the debt completely"; 
    return str;
  }
}
