import java.util.Scanner;

public class Program1 {
	static Scanner sc = new Scanner(System.in);
	static
	{
		System.out.println("Enter Array Length");
	}
	static int len = sc.nextInt();
	static int array[] = new int[len];
	int i;

	public static void main(String[] args) {
		Program1 obj = new Program1();

		for (obj.i = 0; obj.i < array.length; obj.i++) 
		{
			System.out.println("Enter Array Value");
			array[obj.i] = sc.nextInt();
		}

		System.out.println("Choose 1 to 4 for shifting method");

		int shift = sc.nextInt();

		switch (shift) 
		{
		case 1:
			obj.left_once();
			break;
		case 2:
			obj.right_once();
			break;
		case 3:
			obj.left_twice();
			break;
		case 4:
			obj.right_twice();
			break;
		default:
			obj.left_once();
			break;
		}
	}

	public void left_once() 
	{
		System.out.println("Before Right Shifting");
		for (i = 0; i < array.length; i++) 
		{
			System.out.print(array[i] + " ");
		}

		int temp = array[array.length - 1];
		for (i = array.length - 1; i > 0; i = i - 1) 
		{
			array[i] = array[i - 1];
		}
		System.out.println();

		array[0] = temp;

		System.out.println("After Right Shifting");
		for (i = 0; i < array.length; i++) 
		{
			System.out.print(array[i] + " ");
		}
	}

	public void right_once() {

		System.out.println("Before Left Shifting");
		for (i = 0; i < array.length; i++) 
		{
			System.out.print(array[i] + " ");
		}

		i = 0;
		int temp1 = array[i];
		int temp2 = array[i + 1];

		for (int count = 1; count <= 2; count++) 
		{
			for (i = 0; i < (array.length - 1); i++) 
			{
				array[i] = array[i + 1];
			}
		}
		System.out.println();

		array[array.length - 1] = temp2;
		array[array.length - 2] = temp1;

		System.out.println("After Left Shifting");
		for (i = 0; i < array.length; i++) 
		{
			System.out.print(array[i] + " ");
		}
	}

	public void right_twice() {

		System.out.println("Before Right Shifting");
		for (i = 0; i < array.length; i++) 
		{
			System.out.print(array[i] + " ");
		}

		int temp1 = array[array.length - 1];
		int temp2 = array[array.length - 2];
		for (int count = 1; count <= 2; count++) 
		{
			for (i = array.length - 1; i > 0; i = i - 1) 
			{
				array[i] = array[i - 1];
			}
			System.out.println();
		}

		array[1] = temp1;
		array[0] = temp2;

		System.out.println("After Right Shifting");
		for (i = 0; i < array.length; i++) 
		{
			System.out.print(array[i] + " ");
		}
	}

	public void left_twice() {

		System.out.println("Before Left Shifting");
		for (i = 0; i < array.length; i++) 
		{
			System.out.print(array[i] + " ");
		}

		i = 0;
		int temp1 = array[i];
		int temp2 = array[i + 1];

		for (int count = 1; count <= 2; count++) 
		{
			for (i = 0; i < (array.length - 1); i++) 
			{
				array[i] = array[i + 1];
			}
		}
		System.out.println();

		array[array.length - 1] = temp2;
		array[array.length - 2] = temp1;

		System.out.println("After Left Shifting");
		for (i = 0; i < array.length; i++) 
		{
			System.out.print(array[i] + " ");
		}
	}

}