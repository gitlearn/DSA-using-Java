import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(2);
		s.push(1);
		s.push(9);
		s.push(4);
		s.push(3);
		sortStack(s);
		while(!s.isEmpty()) System.out.println(s.pop());
	}
	public static void sortStack(Stack<Integer> s){
	    if(s.isEmpty()) return;
	    int temp = s.pop();
	    sortStack(s);
	    insert(s, temp);
	}
	public static void insert(Stack<Integer> s, int a){
	    if(s.isEmpty()) {
	        s.push(a);
	        return;
	    }
	    if(s.peek() < a){
	        int temp = s.pop();
	        insert(s, a);
	        s.push(temp);
	        return;
	    }else {
	        s.push(a);
	        return;
	    }
	}
}
