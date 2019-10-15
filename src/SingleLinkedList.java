

class Node {
	int data;
	Node next;

	// Constructor to create a new node with given data
	Node(int d) {
		data = d;
		next = null;
	}
}

public class SingleLinkedList {
	Node head;

	// Add the given node to the front of the list
	void addFront(int ele) {
		// create node with given data
		Node new_node = new Node(ele);
		// as we are inserting in the first so already existing nodes must me
		// linked with new node so append it
		new_node.next = head;
		// now point head node to the newly created node
		head = new_node;
	}

	// add a new node after the given node
	public void insertAfterGiveNode(Node oldNode, int new_data) {
		// Check if the given Node is null
		if (oldNode == null) {
			System.out.println("Given node can't be null");
			return;
		}
		// create new node with given data
		Node node = new Node(new_data);

		// make new node next old node.next. all the nodes pointing by old node
		// should be pointed by new node
		node.next = oldNode.next;

		// joins the old with new node
		oldNode.next = node;
	}
	// inserts node at the end of the list
	public void insetAtEnd(int ele)
	{
		// creates node with given data
		Node new_node = new Node(ele);

		// if list is empty than make new node as head
		if (head == null)
		{
			head = new Node(ele);
			return;
		}

		// as the we are inserting node in the end so next will null
		new_node.next = null;

		// traverse the list till the end
		Node trav = head; 
		while (trav.next != null)
			trav = trav.next;

		//link new node to last node
		trav.next = new_node;
		return;
	}
	public void display(){
		Node trav=head;
		while(trav!=null){
			System.out.print(trav.data+" ");
			trav=trav.next;
		}
	}
}
