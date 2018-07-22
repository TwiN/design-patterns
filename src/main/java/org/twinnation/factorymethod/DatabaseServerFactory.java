package org.twinnation.factorymethod;

public class DatabaseServerFactory implements ServerFactory {
	
	@Override
	public Server createServer() {
		return new DatabaseServer();
	}

}
