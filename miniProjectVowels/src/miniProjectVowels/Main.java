package miniProjectVowels;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
			char harf = scan.next().charAt(0);

			switch (harf) {
			    case 'A':
			    case 'I':
			    case 'O':
			    case 'U':
			        System.out.println("kal�n sesli");
			        break;
			    default:
			        System.out.println("ince sesli");
			}
		}
    }
}
