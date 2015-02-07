package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example01 {

	public static void main(String[] args) {

		try {
			FileWriter writer = new FileWriter(new File("numbers.txt"));

			for (int i = 0; i < 10; i++) {
				writer.write("" + i + "\n"); // Forza la conversione dell'intero
												// in stringa
			}

			writer.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File(
					"numbers.txt")));

			String line = reader.readLine();

			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}

			reader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
