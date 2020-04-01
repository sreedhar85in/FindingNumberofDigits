package com.logic.geek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DigitfinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitfinderApplication.class, args);
		countDigit(1256555);
	int var1 = 	countDigit2(2333345);
	int var2 = 	countDigit3(2333345);
	System.out.println("THe value of var1 is" + var1);
	System.out.println("THe value of var2 is" + var2);
	}

	static int countDigit(long n) {

		int count = 0;
		while (n != 0) {

			n = n / 10;
			++count;

		}
		System.out.println("THe value of the count is " + " " + count);
		return count;
	}

	static int countDigit2(long n) {

		if (n == 0) {

			return 0;
		}
		System.out.println("THe value of the count is " + " " + n);
		return 1 + countDigit2(n / 10);

	}
	
	static int countDigit3(long n) {
		
		return (int) Math.floor(Math.log10(n)+1);
	}

}
