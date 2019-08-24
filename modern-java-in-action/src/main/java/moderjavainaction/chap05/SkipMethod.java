package moderjavainaction.chap05;

import java.util.List;
import java.util.stream.Collectors;

public class SkipMethod {
	
	public static void main(String[] args) {
		 List<Dish> skipMenu =Dish.menu
				 .stream()
				 .filter( d -> d.getCalories() > 320)
				 .skip(4)
				 .collect(Collectors.toList());
		 
		 System.out.println(skipMenu);
	}

}
