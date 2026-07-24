
public class TodoList {

	public static void main(String[] args) {
		
		
		DoubleLinkedList todoList = new DoubleLinkedList();
		
		todoList.insert("Finish Homework");
		System.out.println(todoList.traversal());
		
		todoList.insert("Laundry");
		todoList.insert("Group Meeting");
		System.out.println(todoList.traversal());
		
		todoList.insert(0, "Submit Report");
		System.out.println(todoList.traversal());
		
		
		todoList.insert("Go to gym");
		System.out.println(todoList.traversal());
	}

}
