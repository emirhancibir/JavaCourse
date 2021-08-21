package interfaces;

public class CustomerManager {
	//loosly coupled - gevþek baðlýlýk 
	//tightly coupled - katý baðlýlýk
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
		//newlememek için "static" yaparýz 
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
