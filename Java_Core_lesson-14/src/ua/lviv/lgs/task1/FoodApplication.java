package ua.lviv.lgs.task1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class FoodApplication {
	
	public static void main(String[] args) {
		
		Set<Food> setFood = new HashSet<>();
		
		setFood.add(new Food("Banana", 10));
		setFood.add(new Food("Kokoa", 5));
		setFood.add(new Food("Bread", 2));
		setFood.add(new Food("Mustard", 12));
		setFood.add(new Food("Milk", 25));
		setFood.add(new Food("Coke", 5));
		
		Iterator<Food> iterator = setFood.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
				
		System.out.println();
		
		TreeSet<Food> ts = new TreeSet<>(new FoodAllFieldComparator());
		
		ts.add(new Food("Banana", 10));
		ts.add(new Food("Kokoa", 5));
		ts.add(new Food("Bread", 2));
		ts.add(new Food("Mustard", 12));
		ts.add(new Food("Milk", 25));
		ts.add(new Food("Coke", 5));
					
		for (Food food : ts) {
			System.out.println(food);
		}
		
		System.out.println();
		
		
		
	}

}
