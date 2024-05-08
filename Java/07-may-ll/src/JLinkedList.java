
public class JLinkedList {
	private Node start;

	public JLinkedList() {
	}

	public JLinkedList(JLinkedList.Node start) {
		super();
		this.start = start;
	}

	public Node getStart() {
		return start;
	}

	public void setStart(Node start) {
		this.start = start;
	}

	public void addNode(String value) {
		Node node = new Node(value, null);
		// where do you want to add? At the end
		// check if start is null? yes? then we are adding the first node
		if (start == null) {
			// adding 1st node
			start = node;
		} else {
			// find the last node.
			// what is last node? a node, whose next=null
			// start from first node, traverse until next is null
			Node temp = start;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(node);
		}
	}

	public void displayAllNodes() {
		for (Node temp = start; temp != null; temp = temp.getNext()) {
			System.out.println(temp.getValue());
		}
	}

	public boolean deleteNode(String value) {
		boolean isFound = false;
		Node temp = null;
		if (start == null) {
			// nothing in the list
			isFound = false;
		}
		// if there is only 1 node in the list
		else if (start.getNext() == null) {
			start = null;
			isFound=true;
		} else {
			Node previous=start;
			for (temp = start; temp != null; previous=temp, temp = temp.getNext()) {
//				System.out.print("previous:"+previous.getValue()+"  ");
//				System.out.println("temp:"+temp.getValue());
				if (temp.getValue().equals(value)) {
					// found
					isFound = true;
					// removing a node
					//at beginning
					if(start.getValue().equals(value))
					{
//						System.out.println(start.getNext().getValue());
//						start.setNext(start.getNext());
						start=start.getNext();
						temp=null;
					}
					// at end
					else if(temp.getNext()==null)
					{
						previous.setNext(null);
					}else
					{
						// in the middle
						//previous's next => temp's next
						previous.setNext(temp.getNext());
						temp=null;
					}
					

					break;
				}
			}			
		}
		return isFound;
	}

	class Node {
		String value;
		Node next;

		public Node() {
		}

		public Node(String value, JLinkedList.Node next) {
			super();
			this.value = value;
			this.next = next;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}
}
