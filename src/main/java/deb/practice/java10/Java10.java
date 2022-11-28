package deb.practice.java10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Java10 {

	public void executeVarVariable() {
		var map = new HashMap<Integer, String>(); // Cannot use diamond operator. It will provide you unexpected
													// behavior


		map.put(1, "Hello");
		map.put(2, "Hi");
		System.out.println(map);

		var list = new ArrayList<String>(); // It will provide you arraylist of object. If you want list of employee need to
										// provide new ArrayList<Employee>
		// Should not use where code is unreadable like var result = obj.prcoess()

	}

	public void executeCopyOfMethod() {
		List<Integer> demoList = List.of(1);
		System.out.println("Returned unmodifiable list of() " + demoList);
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");
		greetings.add("Hi");
		List<String> copyOfGreetings = List.copyOf(greetings);
		System.out.println("Returned unmodifiable list copyOf() " + copyOfGreetings.toString());
	}

	public void executeStreamChange() {
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");
		greetings.add("Hi");
		greetings.add(" ");
		List<String> unmodifiableGreetings = greetings.stream().filter(item -> !item.contains(" ")).toList();
		System.out.println("Returned unmodifiable list from stream method " + unmodifiableGreetings);
	}

}
