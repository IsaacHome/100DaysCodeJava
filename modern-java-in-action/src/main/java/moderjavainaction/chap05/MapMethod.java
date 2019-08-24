package moderjavainaction.chap05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethod {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Modern","Java","In","Action");
		
		List<Integer> wordLength=words.stream()
				.map( String::length)
				.collect(Collectors.toList());
		System.out.println(wordLength);
		
	}

}
