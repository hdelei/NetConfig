/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mudarede;

import static java.lang.System.out;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;

/**
 *
 * @author Vanderlei
 */
public class Network {
    String interfaceName = "";
    String interfaceIP = "";

    public Network() throws SocketException{
    Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
        for (NetworkInterface netint : Collections.list(nets))            
            displayInterfaceInformation(netint);    
    }   
    
    private void displayInterfaceInformation(NetworkInterface netint) throws SocketException {        
        //out.printf("Display name: %s\n", netint.getDisplayName());
        //out.printf("Name: %s\n", netint.getName());
        Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
        for (InetAddress inetAddress : Collections.list(inetAddresses)) {
            String inet = inetAddress.toString();
            if (netint.isUp() && inet.contains("/192.168.1")) {
                interfaceIP = inet.replace("/", "").trim();
                interfaceName = netint.getName();
                System.out.println(interfaceIP + " \r\n" + interfaceName);                  
            }
            
        }
        
     }
    
    
}
