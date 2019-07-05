import java.util.*;

class MapDemoSameKey {
	public static void main(String args[]) {
		Map map = new HashMap();
		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(1);
		Employee emp3 = new Employee(3);
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());

		System.out.println(map.put(emp1, "1"));
		System.out.println(map.put(emp2, "2"));
		System.out.println(map.put(emp3, "3"));

		System.out.println(map.size());
		System.out.println(map);

		System.out.println(map.get(emp1).hashCode());
		System.out.println(map.get(emp2).hashCode());
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
 
    @Override
    public int hashCode() {
        return id;
    }
   
}