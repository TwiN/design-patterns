package org.twinnation.factory;

public class ServerFactory {
	
	public Server createServer(String type) {
		switch (type) {
			case "database":
				return new DatabaseServer();
			case "mail":
				return new MailServer();
			case "web":
				return new WebServer();
		}
		throw new IllegalArgumentException("There is no such server type");
	}

}
