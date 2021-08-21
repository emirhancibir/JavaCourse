package interfaces;

public class CustomerManager {
	//loosly coupled - gev�ek ba�l�l�k 
	//tightly coupled - kat� ba�l�l�k
	// Bizim kodumuz Customer'a "tightly coupled"
	private Logger[] loggers;
	

	
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Customer is added : " + customer.getFirstName());
//		DatabaseLogger logger = new DatabaseLogger();
//		logger.log(customer.getFirstName() + " Logged to Database");
//		this.loggers.log(customer.getFirstName());
//		for (Logger logger : loggers) {
//			logger.log(customer.getFirstName()+ " " + customer.getLastName());
//		}
//		Utils utils = new Utils();
		Utils.runLoggers(loggers, customer.getFirstName());
		//newlememek i�in "static" yapar�z 
	}

	public void delete(Customer customer) {
		System.out.println("Customer is deleted : " + customer.getFirstName());
//		DatabaseLogger logger = new DatabaseLogger();
//		logger.log(customer.getFirstName() + " Logged to Database");
//		this.loggers.log(customer.getFirstName());
//		for (Logger logger : loggers) {
//			logger.log(customer.getFirstName());
//		}
		Utils.runLoggers(loggers, customer.getFirstName());
		//static de newlemeye gerek yok
	}

}
