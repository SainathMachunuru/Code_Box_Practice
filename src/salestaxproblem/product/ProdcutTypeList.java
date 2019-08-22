package salestaxproblem.product;

public enum ProdcutTypeList {
	BOOK("Book"), 
	MUSIC_CD("Music CD"), 
	CHOCOLATE("Chocolate"),
	PERFUME("Perfume"),
	PILLS("Headache Pills");
	private String productName;

	private ProdcutTypeList(String name) {
		productName = name;

	}

	public String getProductType() {
		return productName;

	}

}
