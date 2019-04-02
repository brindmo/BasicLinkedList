public class LinkedList 
{
	Node head;
	
	public LinkedList()
	{
		head = null;
	}
	
	public void Add(int i)
	{
		Node currentNode = head;
			
		if (currentNode != null)
		{
			while (currentNode.next != null)
			{
				currentNode = currentNode.next;
			}
			
			currentNode.next = new Node(i);
		}
		else
		{
			head = new Node(i);
		}
	}
	
	public void Print()
	{
		Node currentNode = head;
		
		if (currentNode != null)
		{
			System.out.print(currentNode.nodeInt);
		}
		
		while (currentNode.next != null)
		{
			currentNode = currentNode.next;
			System.out.print(" -> " + currentNode.nodeInt);
		}
	}
	
	private class Node
	{
		int nodeInt;
		Node next;
		
		public Node(int i)
		{
			nodeInt = i;
			next = null;
		}
	}
}
