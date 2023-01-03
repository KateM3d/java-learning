package week121;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
    public static void main(String[] args) {
        // Stream.of()
        Stream<String> strings = Stream.of("one", "two", "three");
        //Stream.builder()
        Stream<String> strings2 = Stream.<String>builder()
                .add("one")
                .add("two")
                .add("three")
                .build();

        //.stream()
        List<String> stringList = List.of("one", "two", "three");
        Stream<String> string3 = stringList.stream();

        //map()
        System.out.println("using map()");
        Stream<Integer> integers = Stream.of(1, 2, 3, 4, 5);
        integers.map(i -> i + 1)
                .forEach(i -> System.out.println(i));

        //filter()
        System.out.println("using filter()");
        Stream<Integer> integers2 = Stream.of(1, 2, 3, 4, 5);
        integers2.filter(i -> i > 3)
                .forEach(i -> System.out.println(i));

        //distinct()
        System.out.println("using distinct()");
        Stream<Integer> integers3 = Stream.of(1, 2, 3, 5, 4, 6, 3, 3);
        integers3.distinct().forEach(i -> System.out.println(i));

        //limit()
        System.out.println("using limit()");
        Stream<Integer> integers4 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integers4.limit(4).forEach(i -> System.out.println(i));

        //anyMatch() => true/false
        System.out.println("using anyMatch()");
        Stream<Integer> nums = Stream.of(1, 2, 3, 4, 5);
        boolean isThreeAvailable = nums.anyMatch(i -> i == 3);
        System.out.println(isThreeAvailable);

        //allMatch()
        System.out.println("using allMatch()");
        Stream<Integer> nums2 = Stream.of(1, 2, 3, 4, 5, 6, 7);
        boolean doesAllMatch = nums2.allMatch(i -> i == 3);
        System.out.println(doesAllMatch);

        //noneMatch()
        System.out.println("using noneMatch()");
        Stream<Integer> nums3 = Stream.of(1, 2, 3, 4, 5, 7, 8, 9, 0);
        boolean doesMatch = nums3.noneMatch(i -> i == 400);
        System.out.println(doesMatch);

        //collect()
        System.out.println("using collect()");
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        List<Integer> integerList = integerStream.collect(Collectors.toList());
        integerList.stream().forEach(i -> System.out.println(i));

        //count()
        System.out.println("using count()");
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        long streamCount = numbers.count();
        System.out.println(streamCount);

        //findAny()
        System.out.println("using findAny()");
        Stream<Integer> numbers2 = Stream.of();
        Optional<Integer> resultOptional = numbers2.findAny();
        if (resultOptional.isPresent()) {
            Integer result = resultOptional.get();
            System.out.println(result);
        } else {
            System.out.println("result is null");
        }

        //forEach()
        System.out.println("using forEach()");
        Stream<Integer> integerStream2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        integerStream2.forEach(i -> System.out.println(i));

        //reduce()
        System.out.println("using reduce()");
        Stream<Integer> integerStream3 = Stream.of(1, 2, 3, 4, 5);
        Optional<Integer> resultOptional1 = integerStream3.reduce((i, j) -> i + j);
        if (resultOptional1.isPresent()) {
            Integer result = resultOptional1.get();
            System.out.println(result);
        } else {
            System.out.println("result is null");
        }
    }
}
