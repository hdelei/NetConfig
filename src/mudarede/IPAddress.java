/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mudarede;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.scene.shape.DrawMode;

/**
 *
 * @author Vanderlei
 */
public class IPAddress {
    
    private String addressIP = "";
    private String gateway = "";    
    private String dns = "";
    private String mask = "";
    
    public String getAdressIP(String line){
        if (line.contains("IPv4")) {
            filter(line, "IPv4");
        }        
        return addressIP;        
    }
    
    public String getGateway(String line){        
        if (line.contains("Gateway")) {
            filter(line, "Gateway");            
        }
        return gateway;
    }
    
    public String getDNS(String line){        
        if (line.contains("Servidores DNS")) {
            filter(line, "Servidores DNS");            
        }
        return dns;
    }
    
    public String getMask(String line){
        if (line.contains("Máscara de Sub-rede")) {
            filter(line, "Máscara");
        }
        return mask;
    }
    
    private void filter(String line, String field){
        String IPADDRESS_PATTERN = "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

        Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            switch(field){
                case "IPv4":
                    addressIP = matcher.group();                      
                    break;
                case "Gateway":
                    gateway = matcher.group();                      
                    break;
                case "Servidores DNS":
                    dns = matcher.group();
                    break;
                case "Máscara":
                    mask = matcher.group();
                    break;
            }
           
        } else{
            addressIP = "IP não obtido!";
            gateway = "Gateway não obtido!";
            dns = "DNS não obtido";
        }
    }
}
