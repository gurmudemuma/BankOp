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
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class InterestServer
{
  public static void main(String args[]) throws Exception
  {
    Interest i1= new InterestImpl();
    Registry reg=LocateRegistry.createRegistry(1099);
    reg.rebind("Interest", i1); // interest is the aliase name of li used by later in client
    System.out.println("Server is ready for remote invocations by client");
  }
}
