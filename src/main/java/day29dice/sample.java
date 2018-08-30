package day29dice;



import java.util.Random;

public class sample {

	    public static void main(String[] args) {
	        Random random = new Random();
	        for (int i = 1; i <= 10; i++) {
	            int value = 16 + random.nextInt(5);
	            System.out.println(value);
	      }
	 }
}
