package java8ex;

import java.util.Arrays;
import java.util.List;

public class LambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intSeq = Arrays.asList(1,2,3);
		intSeq.forEach(x -> System.out.println(x));
		//multi lambda
		
		intSeq.forEach(x -> { x += 2; 
		System.out.println(x);
		});
		//lambda with local variable
		intSeq.forEach(x -> {
			int y = x * 2;
			System.out.println(y);
			});
		//lambda with declared parameter type
		intSeq.forEach((Integer x -> { x += 2; 
		System.out.println(x);
		});
		// implementation of lambdas
		public static void genName(Integer x) { 
			System.out.println(x);
		}
	}

}
