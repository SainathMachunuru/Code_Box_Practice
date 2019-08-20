package SalesTaxProblem;

import java.util.ArrayList;
import java.util.List;

public class ProductCart {
	private List<Product> products = null;

	public ProductCart() {
		products = new ArrayList<Product>();

	}

	public void addToProductCart(Product product) {
		this.products.add(product);
	}

	public double getTotalPrice() {
		double totaPriceWithTax = 0;

		for (Product product : products) {
			totaPriceWithTax += product.getProductPriceWithTax();

		}
		return totaPriceWithTax;

	}

	public double getSalesTax() {
		double salesTax = 0;

		for (Product product : products) {
			salesTax += product.getProductSalesTax();

		}
		return salesTax;

	}

	public List<Product> getAllProductTaxDetails() {
		return this.products;

	}

}
