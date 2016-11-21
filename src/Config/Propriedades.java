/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 *
 * @author user
 */
public class Propriedades {
    private final File configFile = new File("config.properties");
    private Properties configProps;
    
    private String ip_1;
    private String ip_2;
    private String mask_1;
    private String mask_2;
    private String gateway_1;
    private String gateway_2;
    private String dns_1;
    private String dns_2;
          
    public Propriedades(){
        try {
            loadProperties();
        } catch (IOException ex) {
            System.out.println("Não existe arquivo de configuração."+
                    "\r\nCarregadas as configurações padrão.");
        }        
        
        ip_1 = configProps.getProperty("ip_1");
        ip_2 = configProps.getProperty("ip_2");
        mask_1 = configProps.getProperty("mask_1");
        mask_2 = configProps.getProperty("mask_2");
        gateway_1 = configProps.getProperty("gateway_1");
        gateway_2 = configProps.getProperty("gateway_2");
        dns_1 = configProps.getProperty("dns_1");
        dns_2 = configProps.getProperty("dns_2");
    }

    private void loadProperties() throws IOException{
        Properties defaultProps = new Properties();
        defaultProps.setProperty("stringConexao", "CamDB.db");
        defaultProps.setProperty("ip_1", "192.168.1.200");
        defaultProps.setProperty("ip_2", "192.168.1.200");
        defaultProps.setProperty("mask_1", "255.255.255.0");
        defaultProps.setProperty("mask_2", "255.255.255.0");
        defaultProps.setProperty("gateway_1", "192.168.1.1");
        defaultProps.setProperty("gateway_2", "192.168.1.2");
        defaultProps.setProperty("dns_1", "192.168.1.1");
        defaultProps.setProperty("dns_2", "192.168.1.2");
        
        configProps = new Properties(defaultProps);
	
        // loads properties from file
	InputStream inputStream = new FileInputStream(configFile);
	configProps.load(inputStream);
	inputStream.close();
    }
    
    public void SaveProperties(String varName, String varValue) throws IOException {
	configProps.setProperty(varName, varValue);
		
	OutputStream outputStream = new FileOutputStream(configFile);
	configProps.store(outputStream, "Arquivo de configuracao");
	outputStream.close();
	}

    /**
     * @return the ip_1
     */
    public String getIp_1() {
        return ip_1;
    }

    /**
     * @return the ip_2
     */
    public String getIp_2() {
        return ip_2;
    }

    /**
     * @return the mask_1
     */
    public String getMask_1() {
        return mask_1;
    }

    /**
     * @return the mask_2
     */
    public String getMask_2() {
        return mask_2;
    }

    /**
     * @return the gateway_1
     */
    public String getGateway_1() {
        return gateway_1;
    }

    /**
     * @return the gateway_2
     */
    public String getGateway_2() {
        return gateway_2;
    }

    /**
     * @return the dns_1
     */
    public String getDns_1() {
        return dns_1;
    }

    /**
     * @return the dns_2
     */
    public String getDns_2() {
        return dns_2;
    }
}
