package moderjavainaction.chap04;

import java.util.List;
import java.util.stream.Collectors;

public class HighCaloriesNames {
	public static void main(String[] args) {
		List<String> highCaloriesNames = Dish.menu.stream()
				.filter( dish -> dish.getCalories() > 400)
				.map(Dish::getName)
				.collect(Collectors.toList());
		System.out.println(highCaloriesNames);
	}

}
