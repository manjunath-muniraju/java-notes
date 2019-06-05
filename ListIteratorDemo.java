import java.util.*;

class ListIteratorDemo {
	public static void main(String args[]) {
		LinkedList ll = new LinkedList();

		ll.add("Bala");
		ll.add("Venki");
		ll.add("Chiru");
		ll.add("Nag");
		System.out.println(ll);

		ListIterator litr = ll.listIterator();
		while(litr.hasNext()) {
			String name = (String) litr.next();
			if(name.equals("Venki")) {
				litr.remove();
			} else if(name.equals("Chiru")) {
				System.out.println("inside chiru");
				litr.set("charan");
			} else if(name.equals("Nag")) {
				litr.add("Chithu");
			}
		}
		System.out.println(ll);
	}
}