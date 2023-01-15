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

        System.out.println("ex. 1: find lion and show his age");
        Optional<Animal> animalOptional = animals.stream().filter(animal -> Objects.equals(animal.getName(), "lion")).findAny();
        if (animalOptional.isPresent()) {
            Animal lions = animalOptional.get();
            System.out.println("There is a lion in the collection and his age is " + lions.getAge());
        } else {
            throw new IllegalArgumentException();
        }

        System.out.println("ex. 2: sort by age");
        animals.stream().sorted(Comparator.comparingInt(Animal::getAge)).forEach(System.out::println);

        System.out.println("ex. 3: number of animals who are older than 4 years old");
        int count = (int) animals.stream().filter(animal -> animal.getAge() > 4).count();
        System.out.println(count);

        System.out.println("ex. 4: Map of animals");
        HashMap<String, Animal> table = new HashMap<>();
        animals.forEach(animal -> table.put(animal.getName(), animal));
        System.out.println(table);

        System.out.println("ex. 5: all animals names in one line using reduce");
        Optional<String> animalNames = animals.stream()
                .map(Animal::getName)
                .reduce((total, current) -> {
                    return total +", "+ current;
                });
        System.out.println(animalNames.stream().toList());
    };

}
