package salestaxproblem.util;

import java.text.DecimalFormat;

public class Util {
	public static double roudingByTwoDecimals(double input) {
		DecimalFormat f = new DecimalFormat("##.00");
		String result = f.format(input);
		return Double.parseDouble(result);

	}

}
