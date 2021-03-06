package gun_2; // CLASSLARIN İSMİ PASCAL CASE yani ilk harfler buyuk olacak sekilde

public class Product {
	// ozellik tutan class

	private int id; // constructtor daki name id ... ler misal product1. dedigimizde olmaz
	// cstor bloktakileri asagidakilere blogun icinde esitlemeliyiz
	private String name;
	private String details;
	private double unitPrice;
	private double discount;
	//private double unitPriceAfterDiscount;

	public Product() {// calistirmak istdeigimiz kodu buraya yaziyoruz
		System.out.println("calisti");
	}

	public Product(String name, int id, String details, double unitPrice, double discount/*,
			double unitPriceAfterDiscount*/) {// constructtor blok
		this();// ici bos yani parametresiz olan ykarıdaki Product() blogu calisacak
		this.id = id;
		this.name = name; // product class indaki name = constructor blogundaki name dir
		this.details = details; // noktadan sonraki yukarıdakileri = den sonraki kısmı metodun icindekini
		this.discount = discount; // gosterir
		this.unitPrice = unitPrice;
		//this.unitPriceAfterDiscount = unitPriceAfterDiscount;

	}

	// bu gettersların settersların hepsi metoddur
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice - (this.unitPrice * this.discount / 100);
	}

}
