//OUTPUT
Before Right Shifting
0 10 20 30 40 50 60 70 80 90 100
After Right Shifting
100 0 10 20 30 40 50 60 70 80 90
//


public class Right_Shift {

	public static void main(String[] args) 
	{
		int array[] = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int i;
		
		System.out.println("Before Right Shifting");
		for(i=0; i<array.length;i++)
		{
		System.out.print(array[i] + " ");
		}

		int temp = array[array.length - 1];
		for(i = array.length - 1; i>0; i=i-1)
		{
		array[i] = array[i-1];
		}
		System.out.println();
		
		array[0] = temp;

		System.out.println("After Right Shifting");
		for(i=0; i<array.length;i++)
		{
		System.out.print(array[i] + " ");
		}
	}
}