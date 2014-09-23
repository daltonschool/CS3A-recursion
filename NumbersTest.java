
public class NumbersTest {
	public static void main(String[] args) {
		System.out.println("factorial " + (factorialTest()?"Passed":"Failed"));
	}
	
	static boolean factorialTest() {
		if(Numbers.factorial(0)!=1) return false; 
		if(Numbers.factorial(1)!=1) return false;
		if(Numbers.factorial(5)!=120) return false;
		if(Numbers.factorial(20)!=-2102132736) return false;  //recursion check
		if(Numbers.factorial(-2)!=1) return false;  //error handling check
		return true;
	}
}
