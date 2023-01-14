package week121;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnimalsCollection {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("cat", 12));
        animals.add(new Animal("dog", 4));
        animals.add(new Animal("mouse", 1));
        animals.add(new Animal("elephant", 20));
        animals.add(new Animal("horse", 2));
        animals.add(new Animal("duck", 4));
        animals.add(new Animal("pig", 5));
        animals.add(new Animal("lion", 11));
        animals.add(new Animal("chicken", 2));
        animals.add(new Animal("tiger", 3));

        System.out.println("ex. 1: Lion");
        Stream<Animal> animalsStream = animals.stream();
        Optional<Animal> animalOptional = animalsStream.filter(animal -> Objects.equals(animal.getName(), "lion")).findAny();
        if (animalOptional.isPresent()) {
            Animal lions = animalOptional.get();
            System.out.println("There is a lion in the collection and his age is " + lions.getAge());
        } else {
            throw new IllegalArgumentException();
        }

        System.out.println("ex. 2: age");
        Stream<Animal> animalsStream2 = animals.stream();
//        List<Integer> animalAges = animalsStream2.map(animal -> animal.getAge()).toList();
//        animalAges.stream().sorted().forEach(System.out::println);






        System.out.println("ex. 3: animals who are older than 4 years old");
        Stream<Animal> animalsStream3 = animals.stream();
        int count = (int) animalsStream3.filter(animal -> animal.getAge() > 4).count();
        System.out.println(count);

        System.out.println("ex. 4: Map of animals");
        HashMap<String, Animal> table = new HashMap<>();
        Stream<Animal> animalsStream4 = animals.stream();
        animalsStream4.forEach(animal -> table.put(animal.getName(), animal));
        System.out.println(table);

        System.out.println("ex. 5: all animals names in one line using reduce");
        Stream<Animal> animalStream5 = animals.stream();
        Optional<String> animalNames = animalStream5
                .map(Animal::getName)
                .reduce((total, current) -> {
                    String names = total +", "+ current;
                    return names;
                });
        System.out.println(animalNames.stream().toList());
    };

}
