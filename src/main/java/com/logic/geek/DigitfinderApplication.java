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
	int var3 = 	countDigit4(2333345);
	int var4 = 	countDigit5(23333456);
	System.out.println("THe value of var1 is" + var1);
	System.out.println("THe value of var2 is" + var2);
	System.out.println("THe value of var3 is" + var3);
	System.out.println("THe value of var4 is" + var4);
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
	
static int countDigit4(long n) {
		
	int length = (int) (Math.log10(n) + 1);
	return length;
	}

static int countDigit5(long number) {
	
	int length = 0;
	
	if (number < 100000) {
	    if (number < 100) {
	        if (number < 10) {
	            return 1;
	        } else {
	            return 2;
	        }
	    } else {
	        if (number < 1000) {
	            return 3;
	        } else {
	            if (number < 10000) {
	                return 4;
	            } else {
	                return 5;
	            }
	        }
	    }
	} else {
	    if (number < 10000000) {
	        if (number < 1000000) {
	            return 6;
	        } else {
	            return 7;
	        }
	    } else {
	        if (number < 100000000) {
	            return 8;
	        } else {
	            if (number < 1000000000) {
	                return 9;
	            } else {
	                return 10;
	            }
	        }
	    }
	}
	
	}



}
