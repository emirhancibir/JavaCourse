package interfaces;

public class Utils {
	public static void runLoggers(Logger[] loggers , String message) {
		for (Logger logger : loggers) {
			logger.log(message);
		}
	}
}//javada class� static yapam�yoruz ama inner class� yani alt class� static yapabiliriz
