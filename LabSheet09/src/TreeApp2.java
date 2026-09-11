

public class TreeApp2 {

	public static void main(String[] args) {
		
		System.out.println("------------------------------");
		System.out.println("Binary Tree From createTree4()");
		System.out.println("------------------------------");
		
		BinaryTree tree = new BinaryTree();
		tree.createTree4();
		tree.printTree(tree.getRoot(), 0);
				
		System.out.println("------------------------------");
		System.out.println("Binary Tree From createTree5()");
		System.out.println("------------------------------");
		BinaryTree tree5 = new BinaryTree();
		tree5.createTree5();
		tree5.printTree(tree5.getRoot(), 0);
		
		System.out.println("------------------------------");
		System.out.println("Binary Tree From createTree6()");
		System.out.println("------------------------------");
		BinaryTree tree6 = new BinaryTree();
		tree6.createTree6();
		tree6.printTree(tree6.getRoot(), 0);
		
		
	}

}


