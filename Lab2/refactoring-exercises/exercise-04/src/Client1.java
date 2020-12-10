
import java.io.*;

public class Client1 {	//moved method from Client4 here cause it's inefficient to have a separate class for each method
	
	public static String toString(Person person) {
		return person.getLast() + ", " + person.getFirst()
				+ ((person.getMiddle() == null) ? "" : " " + person.getMiddle());
	}

	public static void printPerson(Writer out, Person person) throws IOException {
		out.write(person.getFirst());
		out.write(" ");
		if (person.getMiddle() != null) {
			out.write(person.getMiddle());
			out.write(" ");
		}
		out.write(person.getLast());
	}

}
