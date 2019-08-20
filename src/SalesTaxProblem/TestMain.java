package SalesTaxProblem;

public class TestMain {

	public static void main(String[] args) {

		Product p1 = new Product("1 imported bottle of perfume: 27.99", 27.99, ProductType.IMPORTED_OTHERS);
		Product p2 = new Product("1 bottle of perfume at 18.99", 18.99, ProductType.OTHERS);
		Product p3 = new Product("1 packet of headache pills at 9.75", 9.75, ProductType.MEDICAL);
		Product p4 = new Product("1 box of imported chocolates at 11.25", 11.25, ProductType.IMPORTED_FOOD);

		ProductCart productCart = new ProductCart();
		productCart.addToProductCart(p1);
		productCart.addToProductCart(p2);
		productCart.addToProductCart(p3);
		productCart.addToProductCart(p4);

		for (Product product : productCart.getAllProductTaxDetails()) {
			System.out.println(
					"name/desc: " + product.getProductName() + " " + ":: Tax: " + product.getProductPriceWithTax());

		}
		System.out.println("salesTax: " + productCart.getSalesTax());
		System.out.println("totalPriceWithTax: " + productCart.getTotalPrice());

	}

}
