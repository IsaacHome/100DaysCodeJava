package moderjavainaction.chap04;
import java.util.Arrays;
import java.util.List;


public class Dish {
	
		public enum Type{
			MEAT,
			FISH,
			OTHER
		}
		
		private  String name;
		private  boolean vegetarian;
		private  int calories;
		private Type type;
		public Dish(String name, boolean vegetarian, int calories, Type type) {
			super();
			this.name = name;
			this.vegetarian = vegetarian;
			this.calories = calories;
			this.type = type;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public boolean isVegetarian() {
			return vegetarian;
		}
		public void setVegetarian(boolean vegetarian) {
			this.vegetarian = vegetarian;
		}
		public int getCalories() {
			return calories;
		}
		public void setCalories(int calories) {
			this.calories = calories;
		}
		public Type getType() {
			return type;
		}
		public void setType(Type type) {
			this.type = type;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return name;
		}
		
		public static final List<Dish> menu = Arrays.asList(
				new Dish("pork", false, 800, Dish.Type.MEAT),
			      new Dish("beef", false, 700, Dish.Type.MEAT),
			      new Dish("chicken", false, 400, Dish.Type.MEAT),
			      new Dish("french fries", true, 530, Dish.Type.OTHER),
			      new Dish("rice", true, 350, Dish.Type.OTHER),
			      new Dish("season fruit", true, 120, Dish.Type.OTHER),
			      new Dish("pizza", true, 550, Dish.Type.OTHER),
			      new Dish("prawns", false, 400, Dish.Type.FISH),
			      new Dish("salmon", false, 450, Dish.Type.FISH)
				);

}
