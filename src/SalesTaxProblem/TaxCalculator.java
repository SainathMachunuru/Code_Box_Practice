package SalesTaxProblem;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class TaxCalculator {
	public double getImportedTax(double price) {
		double tax = (5 * price) / 100;
		return Math.round(tax * 20) / 20.0; // rounding to nearest 0.05

	}

	public double getBasicTax(double price) {
		double tax = (10 * price) / 100;
		return Math.round(tax * 20) / 20.0;

	}

}
