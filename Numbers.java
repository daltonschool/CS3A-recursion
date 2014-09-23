/**
 * Recursion Assignment
 * @author 
 *
 * Remove the NotImplemented line from any methods you write
 * DO NOT change the method signatures
 * You MAY write helper classes
 */
public class Numbers {
	
	/*
	 * Factorial (0pt)
	 * F(n ) = n * F(n-1)     (if n > 0)
	 * F(0) = 1
	 */
	static int factorial(int num) {
		if(num<=0) return 1;
		return num * factorial(num-1);
	}
	
	/*
	 * Summation (1pt)
	 * S(n ) = n + S(n-1)     (if n > 0)
	 * S(0) = 0
	*/
	static int summation(int n) {
		throw new NotImplemented();
	}
	
	/*
	 * Fibonacci (1pt)
	 * F(0) = 0
	 * F(1) = 1
	 * F(n ) = F(n-1) + F(n-2) (if n > 0)
	 */
	static int fibonacci(int n) {
		throw new NotImplemented();
	}
	
	/*
	 * Sum of a number's digits (1pt)
	 * S(n ) = n					(if n < 10)
	 * S(n ) = S(n/10) + n mod 10   (if n>= 10)
	*/
	static int sumDigits(int n) {
		throw new NotImplemented();
	}
	
	/*
	 * Product of a number's digits (1pt)
	 * S(n ) = n					(if n < 10)
	 * S(n ) = S(n/10) * n mod 10   (if n>= 10) 
	 */
	static int productDigits(int n) {
		throw new NotImplemented();
	}
	
	/*
	 * Product of two whole numbers (1pt)
	 * P(a,b) = a + P(a,b-1)        (if b > 0)
	 * P(a,0) = 0
	 */
	static int product(int a, int b) {
		throw new NotImplemented();
	}
	
	/*
	 * Sum over a range of numbers (1pt)
	 * S(a,b) = a				(if a = b)
	 * S(a,b) = b + S(a,b-1)
	 */
	static int sumRange(int a, int b) {
		throw new NotImplemented();
	}
	
	/*
	 * Reverse a number's digits (2pt)
	 * R(n,v) = n + 10 * v				  (if n < 10)
	 * R(n,v) = R(n/10, 10*v + n mod 10))
	 * (v begins at 0)
	 */
	static int reverseDigits(int n) {
		throw new NotImplemented();
	}
	
	/*
	 * Euclid's Algorithm for GCD (2pt)
	 * GCD(x,y) = y                 (if y <= x & x mod y=0)
	 * GCD(x,y) = GCD(y,x mod y)
	 */
	static int gcd(int x, int y) {
		throw new NotImplemented();
	}
	
	/*
	 * Compound interest balance (2pt)
	 * B(p,r,t) = P                (if t = 0)
	 * B(p,r,t) = (1+r)*B(p,r,t-1)
	 */
	static double compound(double p, double r, int t) {
		throw new NotImplemented();
	}
	
	/*
	 * Newton's algorithm for square root (3pt)
	 * SR(n,p,e) = e				 (if | e^2 - n | < p)
	 * SR(n,p,e) = SR(n,p,(e+n/e)/2)
	 * (e begins at n)
	 */
	static double sqrtNewton(double n, double p) {
		throw new NotImplemented();
	}
	
	/*
	 * Bisection method for square root (3pt)
	 * SR(n,p,h,l) = e				(if | e^2 - n | <= p)
	 * SR(n,p,h,l) = SR(n,p,e,l)    (if e^2 > n)
	 * SR(n,p,h,l) = SR(n,p,h,e)    
	 * (where e=(h+l)/2, h begins at n, and l begins at 0)
	 */
	static double sqrtBisection(double n, double p) {
		throw new NotImplemented();
	}
	
	/*
	 * Combinations (2pt)
	 * C(n,k) = n			(if k = 1)
	 * C(n,k) = 0			(if k > n)
	 * C(n,k) = 1			(if k = n)
	 * C(n,k) = C(n-1,k) + C(n-1,k-1)
	 */
	static int combinations(int n, int k) {
		throw new NotImplemented();
	}
	
}
