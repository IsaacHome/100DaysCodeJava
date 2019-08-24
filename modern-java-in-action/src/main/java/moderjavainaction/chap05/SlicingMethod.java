package moderjavainaction.chap05;

import java.util.List;
import java.util.stream.Collectors;

public class SlicingMethod {
	
	public static void main(String[] args) {
		List<Dish> sliciedMenu = Dish.menu.stream()
				.filter( dish -> dish.getCalories() > 320)
				.limit(3)
				.collect(Collectors.toList());
		
		System.out.println(sliciedMenu);
		
		
		
	}

}
