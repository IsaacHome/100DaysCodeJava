package moderjavainaction.chap05;

import java.util.List;
import java.util.stream.Collectors;

public class FliterMethod {
	
	public static void main(String[] args) {
		List<Dish> vegetarianDishes = Dish.menu.stream()
				.filter(Dish::isVegetarian)
				.collect(Collectors.toList());
		
		vegetarianDishes.forEach(System.out::print);
		
	}

}
