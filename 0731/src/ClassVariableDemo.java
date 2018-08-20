public class ClassVariableDemo {
	public static void main(String[] args) {
	System.out.println(Employee.s_num);	
	System.out.println(Person.s_num);	
}
}

class Employee{
	static String s_num = "2018-01"; // static 공유변수
	int salary = 200;
}

class Person{
	static String s_num = "2015-06";			
}