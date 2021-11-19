//OUTPUT
Before Right Shifting
0 10 20 30 40 50 60 70 80 90 100

After Right Shifting
90 100 0 10 20 30 40 50 60 70 80
//


public class Right_Shift_Twice {

	public static void main(String[] args) 
	{
		int array[] = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int i;
		
		System.out.println("Before Right Shifting");
		for(i=0; i<array.length;i++)
		{
		System.out.print(array[i] + " ");
		}

		int temp1 = array[array.length - 1];
		int temp2 = array[array.length - 2];
		for(int count = 1; count<=2; count++)
		{
		for(i = array.length - 1; i>0; i=i-1)
		{
		array[i] = array[i-1];
		}
		System.out.println();
		}
		
		array[1] = temp1;
		array[0] = temp2;
		
		System.out.println("After Right Shifting");
		for(i=0; i<array.length;i++)
		{
		System.out.print(array[i] + " ");
		}
	}
}