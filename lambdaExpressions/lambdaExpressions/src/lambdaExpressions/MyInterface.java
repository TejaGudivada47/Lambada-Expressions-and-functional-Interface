package lambdaExpressions;
import java.lang.FunctionalInterface;
public interface MyInterface {
double getPiValue();
}
class Main{
	public static void main(String[] args) {
		MyInterface ref;
		ref=()->3.145;
		System.out.println("Value of Pi is : "+ref.getPiValue());
	}
}

lambda with parameters
interface MyInterface{
	String reverse(String n);
}
class Main{
	public static void main(String[] args) {
		MyInterface ref=(str)->{
			String result="";
			for(int i=str.length()-1;i>=0;i--)
			result += str.charAt(i);
				return result;	
		};
		System.out.println("Reversed of a string is "+ref.reverse("Lambda"));
	}
}



Generic Functional Interface
interface GenericInterface<T>{
	T fun(T t);
}
class Main{
	public static void main(String[] args) {
		GenericInterface<String> rev=(str)->{
			String res="";
			for(int i=str.length()-1;i>=0;i--)
				res += str.charAt(i);
			return res;
		};
		System.out.println("Reversed of a string is "+rev.fun("Lambda"));
		GenericInterface<Integer> fac = (n)->{
			int res=1;
			for(int i=1;i<=n;i++)
				res = i*res;
			return res;
		};
		System.out.println("factorial is :"+fac.fun(5));
	}
}