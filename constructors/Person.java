package constructors;

public class Person {

	String name;
    int age;

    Person() {
        name = "Unknown";
        age = 0;
    }

    Person(String n, int a) {
        name = n;
        age = a;
    }

    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
	public static void main(String[] args) {
		 Person p1 = new Person("Alice", 22); 
	        Person p2 = new Person(p1);          

	        p1.display();
	        p2.display();

	}

}
