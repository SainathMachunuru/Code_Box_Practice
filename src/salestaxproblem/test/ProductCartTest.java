package salestaxproblem.test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import salestaxproblem.product.Product;
import salestaxproblem.product.ProductCart;
import salestaxproblem.product.ProductType;

public class ProductCartTest {
	@Mock
	Product product;
	@InjectMocks
	ProductCart productCart;
	
	@Before
    public void setUp() throws Exception {
         MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void testGetTotalPrice(){
		Product p1 = new Product("1 imported bottle of perfume: 27.99", 27.99, ProductType.IMPORTED_OTHERS);
		Product p2 = new Product("1 bottle of perfume at 18.99", 18.99, ProductType.OTHERS);
		productCart.addToProductCart(p1);
		productCart.addToProductCart(p2);
		
		double temp = 12.88;
		when(product.getProductSalesTax()).thenReturn(temp);
		double totalPrice  = productCart.getSalesTax();
		
		assertNotNull(totalPrice);
		
		
	}

}
