package salestaxproblem;

import salestaxproblem.product.Product;
import salestaxproblem.product.ProductCart;
import salestaxproblem.product.ProductType;

public class SalesTaxMain {

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
		
		/*ProductCart productCart = new ProductCart();
		Product product = null;
		Scanner sc = new Scanner(System.in);
		
		StringBuilder builder  = new StringBuilder();
		ProductType productTypeArr[] = ProductType.values();
		for(int i=0;i<productTypeArr.length;i++) {
			builder.append(productTypeArr[i].ordinal()).append(" : ").append(productTypeArr[i].toString()).append("\n");
			
		}
		
		String prodTypeList = "select product type \n"+builder.toString();
		builder.delete(0, builder.length());
		ProdcutTypeList productListArr[] = ProdcutTypeList.values();
		for(int i=0;i<productListArr.length;i++) {
			builder.append(productListArr[i].ordinal()).append(" : ").append(productListArr[i].toString()).append("\n");
			
		}
		String prodList = "select product\n "+builder.toString();
		
		
		
		while(true) {
			System.out.println(prodList);
			int prodIndex = sc.nextInt();
			if(prodIndex == -1) {
				break;
				
			}
			product = new Product();
			product.setProductName(productListArr[prodIndex].toString());
			System.out.println("enter product price: ");
			double price = sc.nextDouble();
			product.setPrice(price);
			System.out.println(prodTypeList);
			int prodTypeIndex = sc.nextInt();
			product.setProductType(productTypeArr[prodTypeIndex]);
			productCart.addToProductCart(product);
			
		}*/
		
		

		for (Product prod : productCart.getAllProductTaxDetails()) {
			System.out.println(
					"name/desc: " + prod.getProductName() + " " + ":: Tax: " + prod.getProductPriceWithTax());

		}
		System.out.println("salesTax: " + productCart.getSalesTax());
		System.out.println("totalPriceWithTax: " + productCart.getTotalPrice());

	}

}
