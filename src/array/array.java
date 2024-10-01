package array;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class array {

	public static void main(String[] args) {
		
		
    ArrayList<Integer> ar1=new ArrayList<Integer>();
         ar1.add(1);
         ar1.add(2);
         
         System.out.println(ar1);
         System.out.println(ar1.size());
         
         PriorityQueue<Integer> pri=new PriorityQueue<>();
         
         pri.offer(110);
         pri.offer(22);
         pri.offer(93);
         pri.offer(44);
         pri.offer(55);
         
         System.out.println("----------------------------");
         
         System.out.println(pri);
//         System.out.println(pri.peek());

//         System.out.println(pri.poll());
//         System.out.println(pri.poll());
//         System.out.println(pri.poll());
//
         System.out.println(pri);

//         System.out.println(pri.size());
         
         while(!pri.isEmpty()) {
        	 
         }
	}

}
