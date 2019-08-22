package salestaxproblem.taxcalculator;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class TaxCalculator {
	public double getImportedTax(double price) {
		double tax = (5 * price) / 100;
		return tax;

	}

	public double getBasicTax(double price) {
		double tax = (10 * price) / 100;
		return tax;

	}

}
