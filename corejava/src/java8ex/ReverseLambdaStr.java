package java8ex;
interface RevString{
	String rev(String s);
	
}
public class ReverseLambdaStr {

	//private static final String String = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RevString rs=(String s)->
{
	String revs="";
	for(int i=s.length()-1;i>=0;i--) {
		char w= s.charAt(i);
		revs=revs+w;
	}
	return revs;
};
System.out.println(" Reverse :"+rs.rev(null));
}
}