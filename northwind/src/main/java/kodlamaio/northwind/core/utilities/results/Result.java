package kodlamaio.northwind.core.utilities.results;

public class Result {//super type yani aslında soyut gibi
	
	private boolean succes;
	private String message;
	
	public Result(boolean succes) {
		this.succes = succes;
	}
	
	public Result(boolean succes, String message) {
		this(succes); /*this metodu buradaki gibi bu clastaki cstor u da çağırabilir.*/
		/* Result r = new Result(succes); => gibi çalışır*/
		this.message = message;
	}
	
	public boolean isSucces() {
		return this.succes;
	}
	
	public String getMessage() {
		return this.message;
	}
	
}
