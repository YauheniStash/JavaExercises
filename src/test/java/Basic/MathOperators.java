package Basic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class MathOperators {
	//How to add 2 integer numbers
	@Test
	public void MathOperators(){
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please, enter any number:");
		int number1=scanner.nextInt();
		System.out.println("Please, enter one more number:");
		int number2=scanner.nextInt();
		int devision=number1/number2;
		System.out.println("The sum of the entered numbers is equal: "+devision);
		
		
	}
	@Test
	public void complexMathActions() {
		System.out.println(11%3);
	}
	@Test
	//print the even numbers from 1 to 10 and count them
	public void evenNumbers() {
		int a=0;
		for (int i=1;i<=10;i++) {
			if(i%2==0)
			{
				System.out.println(i);
				a++;				
			}			
	}
		System.out.println(a);
	}
	@Test
	//find all the odds numbers from the array and count them
	public void oddsNumbersInArray() {
		int array[]= {1,1,3,4,5,6,7,24,9,10,11,12,13};
		int count=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				System.out.println(array[i]);
				count++;
			}
		}System.out.println(count);
	}
	@Test
	public void multiplication() {
		Scanner sc=new Scanner(System.in);
		System.out.println( "Enter first number: ");
		int number1=sc.nextInt();
		System.out.println( "Enter second number: ");
		int number2=sc.nextInt();
		System.out.println(number1*number2);
		
	}
	@Test
	public void multiplyUpTo10() {
		//this is a scanner
		Scanner sc=new Scanner(System.in);
		System.out.println( "Enter first number: ");
		int number1=sc.nextInt();
		for (int i=1;i<=10;i++) {
			System.out.println(number1+"*"+i+"="+number1*i);
		}
	}
	@Test
	public void test() {
		// Write a Java program that calculates the average of input numbers.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of numbers you want to calculate the evarage: ");
		int numbers=sc.nextInt();
		int sum=0;
		
		for (int i=0;i<numbers;i++) {
			System.out.println("Enter any hole number: ");
			int inputNumbers=sc.nextInt();
			
			sum=sum+inputNumbers;
		}
		System.out.println("The average number of your input numbers is: "+sum/numbers);
	}
	
	@Test
	public void newTest() {
		// Write a Java program that calculates the average of input numbers.
		double num = 0;
		  double x = 1;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Input the number(n) you want to calculate the average: ");
		  int n = sc.nextInt();
		  while (x <= n) {
		   System.out.println("Input number " + "("+ (int) x +")" + ":");
		   num += sc.nextInt();
		   x += 1;
		  }
		  double avgn = (num / n);

		  System.out.println("Average:" + avgn);
		 
	}
	@Test
	public void perimeterAndAreaOfRectangle() {
	//Write a Java program to print the area and perimeter of a rectangle
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle: ");
		double length=sc.nextDouble();
		System.out.println("Enter the width of the rectangle: ");
		double width=sc.nextDouble();
		double perimeter=(length+width)*2;
		double area=length*width;
		System.out.println(perimeter);
		System.out.println(area);	
	
	}
	@Test
	public void missinNumber() {
		/*You are given a list of n- integers and these integers are in the range
		of 1 to n. There are no duplicates in the list. One of the integers is
		missing in the list. Write an efficient code to find the missing integer.*/
		int arr[]= {1,3,5,6,2};
		int sum=0;
		for (int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
	

}
