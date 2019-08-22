package salestaxproblem.exception;

public class SalesTaxException extends Exception {
	public  SalesTaxException(String message) {
		super(message);
		System.out.println(message);
		
	}
	public  SalesTaxException(Throwable cause) {
		super(cause);
		
	}

}
