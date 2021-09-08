package kodlamaio.northwind.core.utilities.results;

public class DataResult<T> extends Result {

	private T data;

	public DataResult(T data, boolean succes, String message) {
		super(succes, message);
		this.data = data;
	}

	public DataResult(T data, boolean succes) {
		super(succes);
		this.data = data;
	}

	public T getData() {
		return data;
	}

	/*
	 * super(succes, message); Result r = new Result(succes , message); => gibi
	 * çalışır bu super() fonksiyonuda inherit aldığı classın constructor imzalarına
	 * göre constructorlarını çağırır yani kısacası base sınıfın cstorunu çağırır
	 * 
	 * public class DataResult<T> extends Result => DataResultu generic olarak
	 * tanımladık. DataResult'a döndürülecek veri tipinin ne oldugunu sorar.
	 */
	
}
