package moderjavainaction.chap04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBasic {

	 public static void main(String[] args) {
		 
		 getLowCaloriesDishNameInJava7(Dish.menu).forEach(System.out::print);
		 System.out.println();
		 System.out.println("Using Java 8 Stream");
		 getLowCaloriesDishNameInJava8(Dish.menu).forEach(System.out::print);
		
	}
	 
	 
	 public static List<String> getLowCaloriesDishNameInJava7(List<Dish> dishes){
		 List<Dish> lowCaloriesDish = new ArrayList<Dish>();
		 
		 for(Dish dish :dishes) {
			 if(dish.getCalories() < 400){
				 lowCaloriesDish.add(dish);
			 }
		 }
		 
		 List<String > lowCaloriesDishesName = new ArrayList<String>();
		 Collections.sort(lowCaloriesDish,new Comparator<Dish>() {

			@Override
			public int compare(Dish o1, Dish o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getCalories(), o2.getCalories());
			}
			 
		});
		 
		 for(Dish d: lowCaloriesDish) {
			  lowCaloriesDishesName.add(d.getName());
		 }
		 
		 return lowCaloriesDishesName;
	 }
	 
	 public static List<String> getLowCaloriesDishNameInJava8(List<Dish> dishes){
		 return dishes.stream()
				 .filter( d -> d.getCalories() < 400)
				 
				 .map(Dish::getName)
				 .limit(3)
				 .sorted()
				 .collect(Collectors.toList());
	 }
}
