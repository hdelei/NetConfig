/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mudarede;




/**
 *
 * @author user
 */
public class Netsh {
    private String ipAddress;
    private String dnsAddress;    
    private String adapterName;
    
    /**
     *
     * @param adapterName Recebe string com o nome da placa de rede
     */
    public Netsh(String adapterName){
        this.adapterName = adapterName;
    }
    
    /**
     *
     * @param ips Recebe um Array de string com:
     * IP, Mascara, Gateway, DNS
     */
    public void setStaticAddress(String[] ips){    
        String ips_0 = " static " + ips[0];
        String ips_3 = " static " + ips[3] + " primary no";
        
        if (ips.length == 4 ) {
            cmdIPAdress("address", ips_0 + " " 
                    + ips[1] + " " + ips[2]);
            
            cmdDNSAdress("dnsservers", ips_3);            
        }        
    }   
    
    public void setDHCP(){        
        cmdIPAdress("address", "dhcp");
        cmdDNSAdress("dnsservers", "dhcp");        
    }

    /**
     *
     * @param type Recebe "address" ou "dnsservers"
     * @param adresses Recebe os endereços IP ou "dhcp"
     */
    private void cmdIPAdress(String type, String adresses){          
        ipAddress = "netsh interface ip set ";
        ipAddress += type;        
        ipAddress += " name = \"" + adapterName + "\" ";      
        ipAddress += adresses + " ";          
    }
    private void cmdDNSAdress(String type, String adresses){          
        dnsAddress = "netsh interface ip set ";
        dnsAddress += type;        
        dnsAddress += " name = \"" + adapterName + "\" ";      
        dnsAddress += adresses + " "; 
    }
    
    public String getNetshIP(){    
        return ipAddress;
    }
    
    public String getNetshDNS(){
        return dnsAddress;
    }

    
}
