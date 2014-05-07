package src.com.exclusoft.common.core.util;

import java.util.Properties;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class GenericLookupUtils {
	
	/**
	 * Returns EJB3 transparent service delegate
	 * 
	 * @param targetModuleName
	 * @param serviceName
	 * @param config
	 * @param currentModuleName
	 * @param errorCode
	 * @return
	 */
	public static Object lookupEJB3Service(String targetModuleName, String locality) {
		String fullBDKey;
		Object bean = null;
		
		 try {
	            Properties props = new Properties();
	            props.setProperty("java.naming.factory.initial","org.jnp.interfaces.NamingContextFactory");
	            props.setProperty("java.naming.factory.url.pkgs", "org.jboss.naming");
	            props.setProperty("java.naming.provider.url", "localhost:1099");        
	           
	            InitialContext ctx = new InitialContext(props);           
	          //  MyBeanRemote bean = (MyBeanRemote) ctx.lookup("MyBean/remote");    
	             bean =  ctx.lookup(targetModuleName + "/" + locality);  
	            
	        } catch (NamingException e) {
	            e.printStackTrace();
	        }

	  return bean ;

}
	
}
