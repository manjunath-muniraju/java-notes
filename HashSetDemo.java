import java.util.*;

class HashSetDemo {
	public static void main(String args[]) {
		HashSet h = new HashSet();

		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(10);

		System.out.println(h.add("B"));
		System.out.println(h);


		HashSet s = new HashSet();
		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(1);

		System.out.println(s.add(emp1));
		System.out.println(s.add(emp2));
		System.out.println(s.size());
		System.out.println(s);
	}
}

class Employee {
	int id;

	Employee(int id) {
		this.id = id;
	}

	@Override
    public boolean equals(Object obj) {
        return this.id == ((Employee)obj).id;
    }
 /*
    @Override
    public int hashCode() {
        return id;
    }
    */
}