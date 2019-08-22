package salestaxproblem.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import salestaxproblem.product.Product;
import salestaxproblem.product.ProductType;

public class ProductTest {
	@InjectMocks
	Product product;
	
	@Before
    public void setUp() throws Exception {
         MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void testGetProductSalesTax() {
		product = new Product("book", 12.50, ProductType.BOOK);
		double tax = product.getProductSalesTax();
		assertNotNull(tax);
		
	}
	@Test
	public void testGetProductSalesTaxImported() {
		product = new Product("book", 12.50, ProductType.IMPORTED_BOOK);
		double tax = product.getProductSalesTax();
		assertNotNull(tax);
		
	}
	@Test
	public void testGetProductSalesTaxNotExempted() {
		product = new Product("book", 12.50, ProductType.OTHERS);
		double tax = product.getProductSalesTax();
		assertNotNull(tax);
		
	}
	@Test
	public void testGetProductSalesTaxNotExemptedAndImported() {
		product = new Product("book", 12.50, ProductType.IMPORTED_OTHERS);
		double tax = product.getProductSalesTax();
		assertNotNull(tax);
		
	}
	@Test
	public void testGetProductPriceWithTax() {
		product = new Product("book", 12.50, ProductType.IMPORTED_OTHERS);
		double tax = product.getProductPriceWithTax();
		assertNotNull(tax);
		
	}

}
