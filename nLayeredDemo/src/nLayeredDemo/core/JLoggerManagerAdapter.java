package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {
 //Adaptasyon class �
	@Override
	public void logToSys(String message) {
		JLoggerManager jLoggerManager = new JLoggerManager();
		jLoggerManager.log(" => "+message);
		
	}

}
