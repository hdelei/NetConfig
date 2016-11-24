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
    private final String T_ADDRESS = "address";
    private final String T_DNS = "dnsservers";
    
    
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
            ipAddress = cmdAdress(T_ADDRESS, ips_0 + " " 
                    + ips[1] + " " + ips[2]);
            
            dnsAddress = cmdAdress(T_DNS, ips_3);            
        }        
    }   
    
    public void setDHCP(){        
        ipAddress = cmdAdress(T_ADDRESS, "dhcp");
        dnsAddress = cmdAdress(T_DNS, "dhcp");        
    }

    /**
     *
     * @param type Recebe "address" ou "dnsservers"
     * @param adresses Recebe os endereços IP ou "dhcp"
     */
    private String cmdAdress(String type, String adresses){  
        String strReturn;
        strReturn = "netsh interface ip set ";
        strReturn += type;        
        strReturn += " name = \"" + adapterName + "\" ";      
        strReturn += adresses + " ";          
        
        return strReturn;
    }    
    
    public String getNetshIP(){    
        return ipAddress;
    }
    
    public String getNetshDNS(){
        return dnsAddress;
    }

    
}
