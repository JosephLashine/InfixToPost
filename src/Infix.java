

	import java.util.*;

	public class Infix {

	    public static void main(String[] args) {

	        char y = '&';

	        Queue<Character> q = new LinkedList<Character>();
	        boolean success = true;
	        char x;
	        q.offer('+');
	        
	        Iterator it=q.iterator();
	        while(it.hasNext())
	        {
	            Character iteratorValue=(Character)it.next();
	            System.out.println("Queue  Value :"+iteratorValue);
	        }
	        
	        try {
	            x = q.remove();
	            System.out.println(" Removed "+x);
	            x = q.remove();
	            System.out.println(" Removed "+x);
	            success = true;
	        } catch (NoSuchElementException e) {
	            success = false;
	            System.out.println("found empty queue when trying to remove.");
	        }
	        q.offer('(');
	        q.offer(y);
	        it=q.iterator();
	        while(it.hasNext())
	        {
	            Character iteratorValue=(Character)it.next();
	            System.out.println("Queue  Value :"+iteratorValue);
	        }        
	        try {
	            x = q.remove();
	          System.out.println(" Removed "+x);
	            success = true;
	        } catch (NoSuchElementException e) {
	            success = false;
	        }
	    }
	}

