package org.twinnation.factorymethod;

public class DatabaseServer implements Server {
	
	@Override
	public String getType() {
		return "DatabaseServer";
	}

}
