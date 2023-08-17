package collection;

import java.util.ArrayDeque;


public class DeQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayDeque<Integer> dq=new ArrayDeque<	Integer>();
dq.offer(7);
dq.add(6);
dq.addFirst(2);
dq.offerFirst(8);
dq.offerLast(9);
System.out.println(dq);
int r=dq.pollLast();
System.out.println(r);
System.out.println(dq);
int p=dq.pollFirst();
System.out.println(p);
System.out.println(dq);
	}

}
