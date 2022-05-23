package co.darshit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class f_input {
	public static void main(String[] args) {
		try {
			Scanner scanner=new Scanner(new File("E:\\Collage\\Inmovidutech\\diabetes.csv"));
			while(scanner.hasNextLine()) {
				String text=scanner.nextLine();
				Scanner sc=new Scanner(text);
				sc.useDelimiter(",");
				while(sc.hasNext()) {
					System.out.println(sc.next());
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
