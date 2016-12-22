package lesson2;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) 
	{
		Stream.of(1, 2, 3, 4, 5, 6).forEach(System.out::println);
		
		
		//ThreadLocalRandom.current().ints().forEach(System.out::println);
		ThreadLocalRandom.current().ints(100).forEach(System.out::println);
	}
	
}
