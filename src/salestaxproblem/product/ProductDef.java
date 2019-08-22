package salestaxproblem.product;

public interface ProductDef {

	public String getProductName();

	public void setProductName(String productName);

	public double getPrice();

	public void setPrice(double price);

	public ProductType getProductType();

	public void setProductType(ProductType productType);

	public double getProductSalesTax();

	public double getProductPriceWithTax();

}
