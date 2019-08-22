package salestaxproblem.product;

import java.util.List;

public interface ProductCartDef {
	public void addToProductCart(Product product);

	public double getTotalPrice();

	public double getSalesTax();

	public List<Product> getAllProductTaxDetails();

}
