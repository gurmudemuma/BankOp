/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankOperation.Interest;

/**
 *
 * @author Made For You
 */
import java.rmi.*;
public interface Interest extends Remote
{
  public  float getInterest(float principle, int time, float rate) throws RemoteException;
  public  String getTotal() throws RemoteException;
}
