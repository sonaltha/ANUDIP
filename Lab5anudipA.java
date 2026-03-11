package prac2;

import java.util.Stack;

public class Lab5anudipA {

	public static void main(String[] args) {
		
		Stack st=new Stack();
		st.push("Hi");
		st.push(10);
		st.push(15.36);
		st.push("a");
		
		System.out.println("Stack after pushing the item " +st);
		
		System.out.println("Top Element= " +st.peek());
		
		System.out.println("Popped Element= "+ st.pop());
		
		System.out.println("stack after popping= "+st);
		
		System.out.println("Is this stack empty= "+st.isEmpty());
		
	}

}
