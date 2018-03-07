package home.joci.wildcard;

import java.util.ArrayList;
import java.util.List;

import home.joci.model.A;
import home.joci.model.B;

public class Api {
	
	public static void main(String[] args) {
		B b = new B();
		A a = new A();
		a.setValue(1);
		b.setValue(2);
		
		List<A> list = new ArrayList<A>();
		list.add(a);
		list.add(b);
		
		
		List<? super A> superList = new ArrayList<A>();
		superList.add(a);
		superList.add(b);
		
		System.out.println("From List<A>");
		calculateExtend(list);
		System.out.println("From List<? super A>");
		calculateSuper(superList);
	}

	private static void calculateSuper(List<? super A> superList) {
		for (Object obj : superList) {
			if (obj instanceof A) {
				A a = (A) obj;
				System.out.println(a.getValue());
			}
		}
	}

	private static void calculateExtend(List<? extends A> list) {
		for (A a : list) {
			System.out.println(a.getValue());
		}
	}
}
