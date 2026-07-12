import java.util.ArrayList;
import java.util.Scanner;
 
public class Exercise_2 {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
 
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
 
		for (int num : initial_numbers) {
			numbers.add(num);
		}
		System.out.println("Initial numbers = " + numbers);
 
		System.out.print("Enter a number to add at the end: ");
		int add_last = scan.nextInt();
		numbers.add(add_last);
		System.out.println("After added to the end = " + numbers);
 
		System.out.print("Enter a number to insert at index 3: ");
		int add_insert = scan.nextInt();
		int insert_index = 3;
		numbers.add(insert_index, add_insert);
		System.out.println("After inserted at index " + insert_index + " = " + numbers);
 
		int delete_index = 5;
		numbers.remove(delete_index);
		System.out.println("After deleted index " + delete_index + " = " + numbers);
 
		int update_index = 0;
		int today_date = 12;
		numbers.set(update_index, today_date);
		System.out.println("After updated index " + update_index + " with today's date = " + numbers);
 
		System.out.println("\nFinal numbers = " + numbers);
	}
 
}