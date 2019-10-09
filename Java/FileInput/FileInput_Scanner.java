// File Input in Java
// File input using the Scanner class

import java.io.File;
import java.util.Scanner;

class FileInput_Scanner {

	public static void main(String[] args) {

		try {
			File file = new File("hope.txt");
			Scanner input = new Scanner(file);

			while (input.hasNext()) {
				String line = input.nextLine();
				System.out.println(line);
			}

			input.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}


}