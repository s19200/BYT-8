import java.io.IOException;
import java.io.Writer;

public class Client2 {	////moved method from Client3 here cause it's inefficient to have a separate class for each method

	public static String formatPerson(Person person) {
		String result = person.getLast() + ", " + person.getFirst();
		if (person.getMiddle() != null)
			result += " " + person.getMiddle();
		return result;
	}
	
	public static void display(Writer out, Person person) throws IOException {
		out.write(person.getLast());
		out.write(", ");
		out.write(person.getFirst());
		if (person.getMiddle() != null) {
			out.write(" ");
			out.write(person.getMiddle());
		}
	}

}
