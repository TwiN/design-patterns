package org.twinnation.factorymethod;

public class WebServerFactory implements ServerFactory {
	
	@Override
	public Server createServer() {
		return new WebServer();
	}

}
