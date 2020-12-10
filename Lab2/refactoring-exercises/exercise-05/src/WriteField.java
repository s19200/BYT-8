
public class WriteField extends WriteQuoted {
	public void writeField(String field) {
		if (field.indexOf(',') != -1 || field.indexOf('\"') != -1)
			writeQuoted(field);
		else
			System.out.print(field);
	}
}
