import java.util.Arrays;

class Employee implements Comparable<Employee>{
	String name;
	int age;
	Employee(String n, int a) {
		name = n;
		age = a;
	}
	
	public int compareTo(Employee e) {
		return name.compareTo(e.name);
		//return age<e.age?-1:age>e.age?1:0;
	}
	
	public String toString() {
		return name + ": " + age;
	}
	
}

public class Main {
	public static void main(String [] args) {
		Employee [] emps = {new Employee("Bam", 29), new Employee("Baker", 26), new Employee("Jim", 63)};
		System.out.println("Before");
		System.out.println(Arrays.toString(emps));
		
		Arrays.sort(emps);
		System.out.println("After");
		System.out.println(Arrays.toString(emps));
		
	}
}
