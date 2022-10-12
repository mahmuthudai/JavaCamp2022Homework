package miniProjectPrimeNumbers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
			int number = scan.nextInt();
			boolean isPrime = true;
			for (int i = 2; i < number; i++) {
			    if (number % i == 0) {
			        isPrime = false;
			    }
			}
			if (number==1){
			    System.out.println(number + " asal degildir");
			    return;
			}
			if (number<=1){
			    System.out.println(number+ " gecersizdir");
			    return;
			}
			if (isPrime == false) {
			    System.out.println(number + " asal sayi degildir");
			} else {
			    System.out.println(number + " asal sayidir");
			}
		}
    }
}