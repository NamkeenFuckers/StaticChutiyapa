package check;

public class Sample {

	 int i=50;
	static int j=990;
	
	public String hello()
	{
		return("Non static Hello World");
	}
	
	public static String hi()
	{
		return ("static Hi World");
	}
	
	public static void main(String[] args) {
		System.out.println(Sample.j+90);
		j=90;
	}
	

}
