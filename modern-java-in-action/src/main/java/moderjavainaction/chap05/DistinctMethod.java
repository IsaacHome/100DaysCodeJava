package moderjavainaction.chap05;

import java.util.Arrays;
import java.util.List;

public class DistinctMethod {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
		
		 nums.stream().filter( i -> i%2 ==0).distinct().forEach(System.out::print);
	}

}
