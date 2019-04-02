import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		LinkedList myList = new LinkedList();
		myList.Add(4);
		myList.Add(15);
		myList.Add(3);
		myList.Add(6);
		myList.Add(19);
		
		System.out.println("Linked list contents:");
		myList.Print();
		
		Scanner in = new Scanner(System.in);
		String junkString = in.nextLine();
	}
}
