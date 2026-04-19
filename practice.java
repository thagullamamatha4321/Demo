import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class Practice
{
	@FunctionalInterface
	static interface Calculator {
		int calculate(int a, int b);
	}

	public static void main(String[] args) {
		System.out.println("========== LAMBDA EXAMPLES ==========\n");
		
		// 1. Simple Runnable Example
		System.out.println("1. Simple Runnable Example:");
		Runnable r = () -> System.out.println("   Hello, Lambda!");
		new Thread(r).start();
		try { Thread.sleep(100); } catch (InterruptedException e) { }
		System.out.println();
		
		// 2. Iterating List using Lambda
		System.out.println("2. Iterating List using Lambda:");
		List<String> list = Arrays.asList("Java", "Spring", "Lambda");
		list.forEach(item -> System.out.println("   " + item));
		System.out.println();
		
		// 3. Filtering a List with Lambda
		System.out.println("3. Filtering a List (items starting with 'J'):");
		List<String> list2 = Arrays.asList("Java", "JavaScript", "Python");
		List<String> filteredList = list2.stream()
			.filter(s -> s.startsWith("J"))
			.collect(Collectors.toList());
		filteredList.forEach(item -> System.out.println("   " + item));
		System.out.println();
		
		// 4. Sorting a List using Lambda
		System.out.println("4. Sorting a List (alphabetically):");
		List<String> list3 = Arrays.asList("Java", "Lambda", "Kafka");
		list3.sort((s1, s2) -> s1.compareTo(s2));
		list3.forEach(item -> System.out.println("   " + item));
		System.out.println();
		
		// 5. Using a Custom Functional Interface
		System.out.println("5. Custom Functional Interface (Calculator):");
		Calculator add = (a, b) -> a + b;
		Calculator multiply = (a, b) -> a * b;
		System.out.println("   Addition: 5 + 3 = " + add.calculate(5, 3));
		System.out.println("   Multiplication: 5 * 3 = " + multiply.calculate(5, 3));
		System.out.println();
		
		// 6. Lambda with Map Iteration
		System.out.println("6. Lambda with Map Iteration:");
		Map<String, Integer> map = new HashMap<>();
		map.put("Java", 8);
		map.put("Spring", 5);
		map.put("Lambda", 1);
		map.forEach((key, value) -> System.out.println("   " + key + ": " + value));
		System.out.println();
		
		// 7. Creating a Thread with Lambda
		System.out.println("7. Creating a Thread with Lambda:");
		new Thread(() -> System.out.println("   Thread with Lambda!")).start();
		try { Thread.sleep(100); } catch (InterruptedException e) { }
		System.out.println();
		
		// 8. Lambda in Comparator
		System.out.println("8. Lambda in Comparator (sort by string length):");
		List<String> list4 = Arrays.asList("Java", "Lambda", "Kafka");
		list4.sort(Comparator.comparingInt(String::length));
		list4.forEach(item -> System.out.println("   " + item));
		System.out.println();
		
		// 9. Method Reference with Lambda
		System.out.println("9. Method Reference (print all items):");
		List<String> list5 = Arrays.asList("Java", "Lambda", "Kafka");
		list5.forEach(item -> System.out.println("   " + item));
		System.out.println();
		
		// 10. Lambda with Optional
		System.out.println("10. Lambda with Optional:");
		Optional<String> optional = Optional.of("Java");
		optional.ifPresent(s -> System.out.println("   Value is present: " + s));
		System.out.println();
		
		// 11. Lambda with Predicate
		System.out.println("11. Lambda with Predicate (check if string is empty):");
		Predicate<String> isEmpty = s -> s.isEmpty();
		System.out.println("   isEmpty.test(\"\") = " + isEmpty.test(""));
		System.out.println("   isEmpty.test(\"Java\") = " + isEmpty.test("Java"));
		System.out.println();
		
		// 12. Lambda with BiFunction
		System.out.println("12. Lambda with BiFunction (add two numbers):");
		BiFunction<Integer, Integer, Integer> add2 = (a, b) -> a + b;
		System.out.println("   add2.apply(2, 3) = " + add2.apply(2, 3));
		System.out.println();
		
		// 13. Lambda with Consumer
		System.out.println("13. Lambda with Consumer (print string):");
		Consumer<String> print = s -> System.out.println("   " + s);
		print.accept("Hello, World!");
		System.out.println();
		
		// 14. Lambda with Supplier
		System.out.println("14. Lambda with Supplier (supply a value):");
		Supplier<String> supplier = () -> "Java";
		System.out.println("   supplier.get() = " + supplier.get());
		System.out.println();
		
		// 15. Lambda with Function
		System.out.println("15. Lambda with Function (get string length):");
		Function<String, Integer> length = s -> s.length();
		System.out.println("   length.apply(\"Lambda\") = " + length.apply("Lambda"));
		System.out.println();
		
		// 16. Lambda with UnaryOperator
		System.out.println("16. Lambda with UnaryOperator (square a number):");
		java.util.function.UnaryOperator<Integer> square = x -> x * x;
		System.out.println("   square.apply(5) = " + square.apply(5));
		System.out.println();
		
		// 17. Lambda with BinaryOperator
		System.out.println("17. Lambda with BinaryOperator (multiply two numbers):");
		java.util.function.BinaryOperator<Integer> multiply2 = (a, b) -> a * b;
		System.out.println("   multiply2.apply(2, 3) = " + multiply2.apply(2, 3));
		System.out.println();
		
		// 18. Lambda for Checking Even Numbers
		System.out.println("18. Lambda for Checking Even Numbers:");
		Predicate<Integer> isEven = x -> x % 2 == 0;
		System.out.println("   isEven.test(4) = " + isEven.test(4));
		System.out.println("   isEven.test(5) = " + isEven.test(5));
		System.out.println();
		
		// 19. Lambda with Custom Sorting
		System.out.println("19. Lambda with Custom Sorting (reverse order):");
		List<String> list6 = Arrays.asList("Apple", "Pear", "Grapes");
		list6.sort((s1, s2) -> s2.compareTo(s1));
		list6.forEach(item -> System.out.println("   " + item));
		System.out.println();
		
		// 20. Lambda for Uppercase Conversion
		System.out.println("20. Lambda for Uppercase Conversion:");
		List<String> list7 = Arrays.asList("java", "spring", "lambda");
		List<String> upperList = list7.stream()
			.map(String::toUpperCase)
			.collect(Collectors.toList());
		upperList.forEach(item -> System.out.println("   " + item));
		System.out.println();
		
		// 21. Lambda with Stream Reduce
		System.out.println("21. Lambda with Stream Reduce (sum of numbers):");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers.stream()
			.reduce(0, (a, b) -> a + b);
		System.out.println("   Sum: " + sum);
		System.out.println();
		
		// 22. Lambda with Stream Filter
		System.out.println("22. Lambda with Stream Filter (even numbers):");
		List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> evenNumbers = numbers2.stream()
			.filter(n -> n % 2 == 0)
			.collect(Collectors.toList());
		evenNumbers.forEach(item -> System.out.println("   " + item));
		System.out.println();
		
		// 23. Lambda with Stream Map
		System.out.println("23. Lambda with Stream Map (to lowercase):");
		List<String> list8 = Arrays.asList("Java", "Spring", "Lambda");
		list8.stream()
			.map(String::toLowerCase)
			.forEach(item -> System.out.println("   " + item));
		System.out.println();
		
		// 24. Lambda with Stream Distinct
		System.out.println("24. Lambda with Stream Distinct (remove duplicates):");
		List<Integer> numbers3 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
		numbers3.stream()
			.distinct()
			.forEach(item -> System.out.println("   " + item));
		System.out.println();
		
		// 25. Lambda with Stream Sorted
		System.out.println("25. Lambda with Stream Sorted (alphabetical order):");
		List<String> list9 = Arrays.asList("Banana", "Pear", "Grapes");
		list9.stream()
			.sorted()
			.forEach(item -> System.out.println("   " + item));
		System.out.println();
		
		// 26. Lambda with Stream Count
		System.out.println("26. Lambda with Stream Count (count elements):");
		List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5);
		long count = numbers4.stream()
			.count();
		System.out.println("   Count: " + count);
		System.out.println();
		
		// 27. Lambda with Stream AnyMatch
		System.out.println("27. Lambda with Stream AnyMatch (check if contains 'Java'):");
		List<String> list10 = Arrays.asList("Java", "Spring", "Lambda");
		boolean containsJava = list10.stream()
			.anyMatch(s -> s.equals("Java"));
		System.out.println("   Contains 'Java': " + containsJava);
		System.out.println();
		
		// 28. Lambda with Stream AllMatch
		System.out.println("28. Lambda with Stream AllMatch (check if all even):");
		List<Integer> numbers5 = Arrays.asList(2, 4, 6, 8, 10);
		boolean allEven = numbers5.stream()
			.allMatch(n -> n % 2 == 0);
		System.out.println("   All even: " + allEven);
		System.out.println();
		
		// 29. Lambda with Stream NoneMatch
		System.out.println("29. Lambda with Stream NoneMatch (check no 'Python'):");
		List<String> list11 = Arrays.asList("Java", "Spring", "Lambda");
		boolean nonePython = list11.stream()
			.noneMatch(s -> s.equals("Python"));
		System.out.println("   Contains no 'Python': " + nonePython);
		System.out.println();
		
		// 30. Lambda with Stream FindFirst
		System.out.println("30. Lambda with Stream FindFirst (get first element):");
		List<String> list12 = Arrays.asList("Java", "Spring", "Lambda");
		Optional<String> first = list12.stream()
			.findFirst();
		first.ifPresent(item -> System.out.println("   First: " + item));
		System.out.println();
		
		// 31. Lambda with Stream FindAny
		System.out.println("31. Lambda with Stream FindAny (get any element):");
		List<String> list13 = Arrays.asList("Java", "Spring", "Lambda");
		Optional<String> any = list13.stream()
			.findAny();
		any.ifPresent(item -> System.out.println("   Any: " + item));
		System.out.println();
		
		// 32. Lambda for Summing Integers
		System.out.println("32. Lambda for Summing Integers (sum of integers):");
		List<Integer> numbers6 = Arrays.asList(1, 2, 3, 4, 5);
		int sum2 = numbers6.stream()
			.mapToInt(Integer::intValue)
			.sum();
		System.out.println("   Sum: " + sum2);
		System.out.println();
		
		// 34. Lambda for Max Integer
		System.out.println("34. Lambda for Max Integer (find maximum):");
		List<Integer> numbers7 = Arrays.asList(1, 2, 3, 4, 5);
		int max = numbers7.stream()
			.mapToInt(Integer::intValue)
			.max()
			.orElse(Integer.MIN_VALUE);
		System.out.println("   Max: " + max);
		System.out.println();
		
		// 35. Lambda for Min Integer
		System.out.println("35. Lambda for Min Integer (find minimum):");
		List<Integer> numbers8 = Arrays.asList(1, 2, 3, 4, 5);
		int min = numbers8.stream()
			.mapToInt(Integer::intValue)
			.min()
			.orElse(Integer.MAX_VALUE);
		System.out.println("   Min: " + min);
		System.out.println();
		
		// 36. Lambda for Joining Strings
		System.out.println("36. Lambda for Joining Strings (join with comma):");
		List<String> list14 = Arrays.asList("Java", "Spring", "Lambda");
		String joined = list14.stream()
			.collect(Collectors.joining(", "));
		System.out.println("   Joined: " + joined);
		System.out.println();
		
		// 37. Lambda with Stream MapToInt
		System.out.println("37. Lambda with Stream MapToInt (get string lengths):");
		List<String> list15 = Arrays.asList("Java", "Spring", "Lambda");
		list15.stream()
			.mapToInt(String::length)
			.forEach(item -> System.out.println("   " + item));
		System.out.println();
		
		// 38. Lambda with Stream Collect to Set
		System.out.println("38. Lambda with Stream Collect to Set (remove duplicates):");
		List<String> list16 = Arrays.asList("Java", "Spring", "Lambda", "Spring");
		Set<String> set = list16.stream()
			.collect(Collectors.toSet());
		set.forEach(item -> System.out.println("   " + item));
		System.out.println();
		
		// 39. Lambda with Stream GroupingBy
		System.out.println("39. Lambda with Stream GroupingBy (count frequency):");
		List<String> list17 = Arrays.asList("Java", "Spring", "Lambda", "Java");
		Map<String, Long> frequency = list17.stream()
			.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		frequency.forEach((k, v) -> System.out.println("   " + k + ": " + v));
		System.out.println();
		
		// 40. Lambda with Stream PartitioningBy
		System.out.println("40. Lambda with Stream PartitioningBy (partition even/odd):");
		List<Integer> numbers9 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Map<Boolean, List<Integer>> partitioned = numbers9.stream()
			.collect(Collectors.partitioningBy(n -> n % 2 == 0));
		partitioned.forEach((k, v) -> System.out.println("   " + (k ? "Even" : "Odd") + ": " + v));
		System.out.println();
		
		// 41. Lambda with Stream Counting
		System.out.println("41. Lambda with Stream Counting (count elements):");
		List<String> list18 = Arrays.asList("Java", "Spring", "Lambda");
		long count2 = list18.stream()
			.collect(Collectors.counting());
		System.out.println("   Count: " + count2);
		System.out.println();
		
		// 42. Lambda with Stream SummarizingInt
		System.out.println("42. Lambda with Stream SummarizingInt (get statistics):");
		List<Integer> numbers10 = Arrays.asList(1, 2, 3, 4, 5);
		IntSummaryStatistics stats = numbers10.stream()
			.collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println("   Sum: " + stats.getSum());
		System.out.println("   Average: " + stats.getAverage());
		System.out.println("   Max: " + stats.getMax());
		System.out.println("   Min: " + stats.getMin());
		System.out.println();
		
		// 43. Lambda with Stream Mapping
		System.out.println("43. Lambda with Stream Mapping (group by string length):");
		List<String> list19 = Arrays.asList("Java", "Spring", "Lambda");
		Map<Integer, List<String>> map2 = list19.stream()
			.collect(Collectors.groupingBy(String::length));
		map2.forEach((k, v) -> System.out.println("   Length " + k + ": " + v));
		System.out.println();
		
		// 44. Lambda with Stream Joining Without Delimiter
		System.out.println("44. Lambda with Stream Joining Without Delimiter:");
		List<String> list20 = Arrays.asList("Java", "Spring", "Lambda");
		String joined2 = list20.stream()
			.collect(Collectors.joining());
		System.out.println("   Joined: " + joined2);
		System.out.println();
		
		// 45. Lambda with Stream ToMap
		System.out.println("45. Lambda with Stream ToMap (string to length map):");
		List<String> list21 = Arrays.asList("Java", "Spring", "Lambda");
		Map<String, Integer> map3 = list21.stream()
			.collect(Collectors.toMap(s -> s, String::length));
		map3.forEach((k, v) -> System.out.println("   " + k + ": " + v));
		System.out.println();
		
		// 46. Lambda for Creating a Stream
		System.out.println("46. Lambda for Creating a Stream:");
		Stream<String> stream = Stream.of("Java", "Spring", "Lambda");
		stream.forEach(item -> System.out.println("   " + item));
		System.out.println();
		
		// 47. Lambda with Stream Limit
		System.out.println("47. Lambda with Stream Limit (get first 2):");
		Stream<String> stream2 = Stream.of("Java", "Spring", "Lambda", "Kafka");
		stream2.limit(2)
			.forEach(item -> System.out.println("   " + item));
		System.out.println();
		
		// 48. Lambda with Stream Skip
		System.out.println("48. Lambda with Stream Skip (skip first 2):");
		Stream<String> stream3 = Stream.of("Java", "Spring", "Lambda", "Kafka");
		stream3.skip(2)
			.forEach(item -> System.out.println("   " + item));
		System.out.println();
		
		// 49. Lambda with Stream Peek
		System.out.println("49. Lambda with Stream Peek (print while processing):");
		Stream<String> stream4 = Stream.of("Java", "Spring", "Lambda", "Kafka");
		stream4.peek(item -> System.out.println("   Peek: " + item))
			.collect(Collectors.toList());
		System.out.println();
		
		// 50. Lambda with Optional
		System.out.println("50. Lambda with Optional (check if present):");
		Optional<String> optional2 = Optional.of("Java");
		optional2.ifPresent(item -> System.out.println("   Value: " + item));
		System.out.println();
		
		System.out.println("========== END OF EXAMPLES ==========");
	}
}