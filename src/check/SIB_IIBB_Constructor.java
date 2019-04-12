package check;

//Java code to illustrate order of 
//execution of constructors, static 
//and initialization blocks 
class SIB_IIBB_Constructor { 

	SIB_IIBB_Constructor(int x) 
	{ 
		System.out.println("ONE argument constructor"); 
	} 

	SIB_IIBB_Constructor() 
	{ 
		System.out.println("No argument constructor"); 
	} 

	static
	{ 
		System.out.println("1st Static Block"); 
	} 

	{ 
		System.out.println("1st IIB init"); 
	} 

	{ 
		System.out.println("2nd IIB init"); 
	} 

	static
	{ 
		System.out.println("2nd Static Block"); 
	} 

	public static void main(String[] args) 
	{ 
		new SIB_IIBB_Constructor(); 
		new SIB_IIBB_Constructor(8); 
	} 
} 
