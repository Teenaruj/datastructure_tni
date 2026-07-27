
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

		todoList.remove();
		System.out.println("To-Do List = " + todoList.traversal());

		todoList.remove(3);
		System.out.println("To-Do List = " + todoList.traversal());

		todoList.remove(0);
		System.out.println("To-Do List = " + todoList.traversal());

		System.out.println("\nBackward Traversal " + todoList.backwardTraversal());
	}

}
