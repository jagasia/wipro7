
public class App {

	public static void main(String[] args) {
		JLinkedList list=new JLinkedList();
		list.addNode("India");
		list.addNode("Australia");
		list.addNode("Srilanka");
		list.addNode("Pakistan");
		list.addNode("Bangladesh");
		list.addNode("Japan");
		
//		list.deleteNode("Japan");
		list.deleteNode("Srilanka");
//		list.deleteNode("India");
		list.displayAllNodes();
	}

}
