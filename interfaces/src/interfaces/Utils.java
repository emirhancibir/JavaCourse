package interfaces;

public class Utils {
	public static void runLoggers(Logger[] loggers , String message) {
		for (Logger logger : loggers) {
			logger.log(message);
		}
	}
}//javada classý static yapamýyoruz ama inner classý yani alt classý static yapabiliriz
