package java8ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {
public void main(String[]args) {
	CharSequence ch=(CharSequence) Arrays.asList("nisha");
	
	ch=Stream.iterate(" ",((String) ch).split(""));
	System.out.println(ch);
		}
}

