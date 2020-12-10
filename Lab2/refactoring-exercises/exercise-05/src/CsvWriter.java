public class CsvWriter extends WriteLine {		//divergent change so I extracted each method that modifies differently into a separate class
	public CsvWriter() {
	}

	public void write(String[][] lines) {
		for (int i = 0; i < lines.length; i++)
			writeLine(lines[i]);
	}

	

	

	
}