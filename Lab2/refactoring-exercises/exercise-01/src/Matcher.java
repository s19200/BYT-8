
public class Matcher {			//duplicated code => extract method
							//combined two completely similar for loops and two if statements that both returned false
	public Matcher() {
	}

	public boolean match(int[] expected, int[] actual, int clipLimit, int delta) {

		for (int i = 0; i < actual.length; i++) {
			if (actual[i] > clipLimit) {						// Clip "too-large" values
				actual[i] = clipLimit;
			}
			
			if ((Math.abs(expected[i] - actual[i]) > delta)||(actual.length != expected.length)) {	// Check that each entry within expected +/- delta
																									// Check for length differences
					return false;
			}

		}
		return true;
	}
		
/*		// Check for length differences
		if (actual.length != expected.length)
			return false;

		// Check that each entry within expected +/- delta
		for (int i = 0; i < actual.length; i++)
			if (Math.abs(expected[i] - actual[i]) > delta)
				return false;

		return true;
	}
	*/
}