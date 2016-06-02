import java.util.Scanner;
/*
 * Fahrenheit to Celsius converter
 */
public class FahrenheitToCelsius {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		//Convert Fahrenheit to Celsius
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		System.out.println(fahrenheit + " fahrenheit" + " is " + celsius + " in Celsius.");
	}
}
