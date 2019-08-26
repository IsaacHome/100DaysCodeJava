package moderjavainaction.chap05;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PuttingIntoPractice {
	
	public static void main(String[] args) {
		    Trader raoul = new Trader("Raoul", "Cambridge");
		    Trader mario = new Trader("Mario", "Milan");
		    Trader alan = new Trader("Alan", "Cambridge");
		    Trader brian = new Trader("Brian", "Cambridge");
		    
		    List<Transaction> transactions = Arrays.asList(
		            new Transaction(brian, 2011, 300),
		            new Transaction(raoul, 2012, 1000),
		            new Transaction(raoul, 2011, 400),
		            new Transaction(mario, 2012, 710),
		            new Transaction(mario, 2012, 700),
		            new Transaction(alan, 2012, 950)
		        );
		    
		    
		    
		    List<Transaction> year2011 = transactions.stream()
		    		.filter( t -> t.getYear() == 2011)
		    		.collect(Collectors.toList());
		    
		    System.out.println(year2011);
		    
		    //2 What are all the unique cities where the traders work?
		    
		    List<String>  cities =transactions.stream()
		    		.map( t -> t.getTrader().getCity())
		    		.distinct()
		    		.collect(Collectors.toList());
		    
		    System.out.println(cities);
		    
		    //3 Finds all traders from Cambridge and sort them by name
		    
		    List<Trader> traders = transactions.stream()
		    		.map( Transaction::getTrader)
		    		.filter( trader -> trader.getCity() =="Cambridge")
		    		.sorted(Comparator.comparing(Trader::getName))
		    		.collect(Collectors.toList());
		    
		    System.out.println(traders);
		    
		    
		    //4 Return a string of all traders’ names sorted alphabetically.
		    
		    String  names =transactions.stream()
		    		.map( trader-> trader.getTrader().getName())
		    		.distinct()
		    		.sorted()
		    		.reduce("", (n1,n2) -> n1 + n2);
		    
		    System.out.println(names + " ");
		    
		    
		    //5 Are any traders based in Milan?
		    
		    boolean milan =transactions.stream()
		    		.anyMatch( transaction -> transaction.getTrader().getCity().equals("Milan"));
		    
		    System.out.println(milan);
		    		
		    	
		    //6 Prints all transactions’ values from the traders living in Cambridge
		    
		    transactions.stream()
		    .filter( t -> "Cambridge".equals(t.getTrader().getCity()))
		    .map(Transaction::getValue)
		    .forEach(System.out::print);
		    
		    
		    //7 What’s the highest value of all the transactions?
		    Optional<Integer> highestValue = transactions.stream().map(Transaction::getValue).reduce(Integer::max);
		    System.out.println("Highest Value: " +highestValue.get());
		    

	}

}
