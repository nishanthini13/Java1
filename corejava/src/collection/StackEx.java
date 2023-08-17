package collection;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer> s=new Stack <>();
System.out.println("stack empty :"+s.isEmpty());
s.push(10);
s.push(20);
s.push(30);
s.push(40);
System.out.println("element in stack :"+s);
System.out.println("size in my stack :"+s.size());
s.pop();
System.out.println("after poping :"+s);
s.peek();
System.out.println(s.peek());
s.push(50);
System.out.println("element in stack :"+s);
System.out.println("empty in stack :"+s.isEmpty());
int position=s.search(30);
System.out.println("print position :"+position);

//System.out.println("indexof ex:"+((StackEx) s).indexof(3));
System.out.println("last index :"+s.lastIndexOf(s));
	}

	private static int indexof(int i) {
		// TODO Auto-generated method stub
		return 2;
	}

}
