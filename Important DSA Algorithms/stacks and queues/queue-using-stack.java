import java.util.*;
public class Main
{
	public static void main(String[] args) {
		QueueADT q = new QueueADT();
		q.dequeue();
		q.enqueue(3);
		q.enqueue(4);
		q.size_of_queue();
		q.enqueue(5);
		q.enqueue(6);
		q.size_of_queue();
		q.enqueue(7);
		q.dequeue();
		q.dequeue();
		q.size_of_queue();
		q.dequeue();
	}
}
class QueueADT{
     Stack<Integer> stack1;
     Stack<Integer> stack2;
     public QueueADT(){
         stack1 = new Stack<>();
         stack2 = new Stack<>();
     }
     public void enqueue(int i){
         if(stack1.isEmpty()) {
             stack1.push(i);
             while(!stack1.isEmpty()){
                 stack2.push(stack1.pop());
             }
         }
         else {
             stack2.push(i);
             while(!stack2.isEmpty()){
                 stack1.push(stack2.pop());
             }
         }
     }
     public void dequeue(){
         if(stack1.isEmpty () && stack2.isEmpty()) {
             System.out.println("queue is empty");
             return;
         }
         else if(stack1.isEmpty()){
             int e = stack2.pop();
             System.out.println(e + " popped");
         }
         else {
             int e = stack1.pop();
             System.out.println(e + " popped");
         }
     }
     public void size_of_queue(){
         if(stack1.isEmpty()) { 
             System.out.println(stack2.size());
         } else {
             System.out.println(stack1.size());
         }
     }
}