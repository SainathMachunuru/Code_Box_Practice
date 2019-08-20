package SalesTaxProblem;

public class Product {
	private String productName;
	private double price;
	private ProductType productType;
	private TaxCalculator taxCalculator = new TaxCalculator();

	public Product(String productName, double price, ProductType productType) {
		super();
		this.productName = productName;
		this.price = price;
		this.productType = productType;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public double getProductSalesTax() {
		return this.getBasicTax() + this.getImportedTax();

	}
	public double getProductPriceWithTax() {
		return this.price+this.getBasicTax() + this.getImportedTax();

	}

	private double getImportedTax() {
		if (this.productType.isImported()) {
			return this.taxCalculator.getImportedTax(this.price);
		} else {
			return 0;
		}

	}

	private double getBasicTax() {
		if (this.productType.isExempted()) {
			return 0;

		} else {
			return this.taxCalculator.getBasicTax(this.price);

		}

	}

}
