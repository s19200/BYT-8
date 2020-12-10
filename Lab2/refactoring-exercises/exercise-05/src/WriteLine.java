
public class WriteLine extends WriteField{
	public void writeLine(String[] fields) {
		if (fields.length == 0)
			System.out.println();
		else {
			writeField(fields[0]);

			for (int i = 1; i < fields.length; i++) {
				System.out.print(",");
				writeField(fields[i]);
			}
			System.out.println();
		}
	}
}
