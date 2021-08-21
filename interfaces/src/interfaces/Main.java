package interfaces;

public class Main {

	public static void main(String[] args) {

		Logger[] loggers = new Logger[] { new SmsLogger(), new DatabaseLogger(), 
				new FileLogger(), new EmailLogger() };

		CustomerManager customerManager = new CustomerManager(loggers);

		Customer osman = new Customer(1, "Osman", "Ozsoy");
//		osman.setFirstName("Osman");
//		osman.setLastName("Ozsoy");
//		osman.setId(1);

		customerManager.add(osman);

	}

}
