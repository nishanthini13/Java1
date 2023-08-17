package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Movie implements Comparable{
	int myear,mprice;
	String mName;
	public int getMyear() {
		return myear;
	}
	public void setMyear(int myear) {
		this.myear = myear;
	}
	public int getMprice() {
		return mprice;
	}
	public void setMprice(int mprice) {
		this.mprice = mprice;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public Movie(int myear, int mprice, String mName) {
		super();
		this.myear = myear;
		this.mprice = mprice;
		this.mName = mName;
	}
	@Override
	public String toString() {
		return "Movie [myear=" + myear + ", mprice=" + mprice + ", mName=" + mName + "]";
	}
	class SortByMovieName implements Comparator<Movie>{

		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return super.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return super.equals(obj);
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
public SortByMovieName() {
			super();
			// TODO Auto-generated constructor stub
		}
class SortByMname implements Comparator<Movie>{
		@override
		public int compare(Movie o1, Movie o2) {
	return o1.mName.compareTo(o2.mName);
}
		
		
	}
@Override
public int compare(Movie o1, Movie o2) {
	// TODO Auto-generated method stub
	return 0;
}
}
public class ComparableStringEx {

	private static final Comparator SortByMovieName = null;

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <Movie> ar= new ArrayList<Movie>();
ar.add(new Movie (2001,80,"RRR"));
ar.add(new Movie (2020,90,"GGG"));
 //Collections.sort(ar);
 System.out.println(" movie name sorting");
 Collections.sort(ar,SortByMovieName);
 for(Movie SortByMovieName  :ar){
		System.out.println(SortByMovieName);
	    }

}

}
@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}
}


