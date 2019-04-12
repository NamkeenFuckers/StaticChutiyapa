package check;

public class Checking {
	
	
	
	public String meth()
	{
		Sample s1 = new Sample();
		System.out.println(s1.i);
		System.out.println(Sample.j=90);
		System.out.println(s1.hello());
		System.out.println(s1.hi());
		System.out.println(Sample.hi());
//		System.out.println(Sample.hello());
//		System.out.println(Sample.i);
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println("Sample.j "+ Sample.j);
		Sample.j=77;
		/*Sample s = new Sample();
		System.out.println(s.i);
		System.out.println(Sample.j);
		System.out.println(s.hello());
		System.out.println(Sample.hi());*/
		Checking ch = new Checking();
		ch.meth();
		
		
		
	}

}
