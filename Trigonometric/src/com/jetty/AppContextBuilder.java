package com.jetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class AppContextBuilder {
	public static void main(String[] args) throws Exception {
		
		Server server = new Server(8080);
		WebAppContext webAppContext = new WebAppContext();  
		System.setProperty("org.apache.jasper.compiler.disablejsr199", "true");
		webAppContext = new WebAppContext();
		webAppContext.setDescriptor(webAppContext + "WEB-INF/web.xml");
		webAppContext.setResourceBase(".");
		webAppContext.setContextPath("/");
		server.setHandler(webAppContext);
		server.start();  
		server.join();  
	}

}
