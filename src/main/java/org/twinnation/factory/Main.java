package org.twinnation.factory;

public class Main {
	
	public static void main(String[] args) {
		ServerFactory factory = new ServerFactory();
		Server server = factory.createServer("web");
		System.out.println(server.getType());
	}
	
}
