import java.util.Scanner;

/* Let the user type 10 names and print in reverse order */

class nameList
{

	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		String[] name = new String[10];
		int count;

		for (count = 0; count < 10; count++)
		{
			System.out.println("Input a name ");
			name[count] = input.next();

		}

		for (count = 9; count >= 0; count--)
		{
			System.out.println(name[count]);
		}
	}
}