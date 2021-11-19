//OUTPUT
Before Left Shifting
0 10 20 30 40 50 60 70 80 90 100
After Left Shifting
20 30 40 50 60 70 80 90 100 0 10
//


public class Left_Shift_Twice {

	public static void main(String[] args) 
	{
		int array[] = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int i;
		
		System.out.println("Before Left Shifting");
		for(i=0; i<array.length;i++)
		{
		System.out.print(array[i] + " ");
		}

		i = 0;
		int temp1 = array[i];
		int temp2 = array[i+1];
		
		for(int count = 1; count <=2; count++)
		{
		for(i = 0; i<(array.length-1); i++)
		{
		array[i] = array[i+1];
		}
		}
		System.out.println();
		
		array[array.length-1] = temp2;
		array[array.length-2] = temp1;

		System.out.println("After Left Shifting");
		for(i=0; i<array.length;i++)
		{
		System.out.print(array[i] + " ");
		}
	}
}