/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

public class ClientOperation {

	private static RMIInterface look_up;

	public static void main(String[] args)
		throws MalformedURLException, RemoteException, NotBoundException {

		look_up = (RMIInterface) Naming.lookup("//localhost/MyServer");
		Double txt = Double.parseDouble(JOptionPane.showInputDialog("What is your name?"));

		Double response = look_up.convertKilomet(txt);
		JOptionPane.showMessageDialog(null, response);

	}

}
