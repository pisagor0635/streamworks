public class StreamWorks {
    public static void main(String[] args) {

//        List<String> myList = Arrays.asList("a1", "b1", "a2", "c2", "c1");
//        myList
//                .stream()
//                .filter(s -> s.startsWith("c"))
//                .map(String::toUpperCase)
//                .sorted()
//                .forEach(System.out::println);


//        Arrays.asList("a1", "a2", "a3")
//                .stream()
//                .findFirst()
//                .ifPresent(System.out::println);

//        Stream.of("a1","a2","a3")
//                .findFirst()
//                .ifPresent(System.out::println);

//        IntStream.range(1,4)
//                .forEach(System.out::println);

//        Arrays.stream(new int[]{1, 2, 3})
//                .map(n -> 2 * n + 1)
//                .average()
//                .ifPresent(System.out::println);

//        Stream.of("a1", "a2", "a3")
//                .map(s -> s.substring(1))
//                .mapToInt(Integer::parseInt)
//                .max()
//                .ifPresent(System.out::println);

//        IntStream.range(1, 4)
//                .mapToObj(i -> "a" + i)
//                .forEach(System.out::println);

//        Stream.of(1.0, 2.0, 3.0)
//                .mapToInt(Double::intValue)
//                .mapToObj(i->"a" + i)
//                .forEach(System.out::println);


        //intermediate operations is laziness. Intermediate operations will only be executed when a terminal operation is present.
//        Stream.of("d2", "a2", "b1", "b3", "c")
//                .filter(s -> {
//                    System.out.println("filter: " + s);
//                    return true;
//                });

//        Stream.of("d2", "a2", "b1", "b3", "c")
//                .filter(s -> {
//                    System.out.println("filter: " + s);
//                    return true;
//                }).forEach(s -> System.out.println("forEach: " + s));

//        Stream.of("d2", "a2", "b1", "b3", "c")
//                .map(s -> {
//                    System.out.println("map: " + s);
//                    return s.toUpperCase();
//                })
//                .anyMatch(s -> {
//                    System.out.println("anyMatch: " + s);
//                    return s.startsWith("A");
//                });

//        Stream.of("d2", "a2", "b1", "b3", "c")
//                .map(s -> {
//                    System.out.println("map: " + s);
//                    return s.toUpperCase();
//                })
//                .filter(s -> {
//                    System.out.println("filter: " + s);
//                    return s.startsWith("A");
//                })
//                .forEach(s -> System.out.println("forEach: " + s));

//        Stream.of("d2", "a2", "b1", "b3", "c")
//                .filter(s -> {
//                    System.out.println("filter: " + s);
//                    return s.startsWith("a");
//                })
//                .map(s -> {
//                    System.out.println("map: " + s);
//                    return s.toUpperCase();
//                })
//                .forEach(s -> System.out.println("forEach: " + s));

//        Stream.of("d2", "a2", "b1", "b3", "c")
//                .sorted((s1, s2) -> {
//                    System.out.printf("sort: %s; %s\n", s1, s2);
//                    return s1.compareTo(s2);
//                })
//                .filter(s -> {
//                    System.out.println("filter: " + s);
//                    return s.startsWith("a");
//                })
//                .map(s -> {
//                    System.out.println("map: " + s);
//                    return s.toUpperCase();
//                })
//                .forEach(s -> System.out.println("forEach: " + s));

//        Stream.of("d2", "a2", "b1", "b3", "c")
//                .filter(s -> {
//                    System.out.println("filter: " + s);
//                    return s.startsWith("a");
//                })
//                .sorted((s1, s2) -> {
//                    System.out.printf("sort: %s; %s\n", s1, s2);
//                    return s1.compareTo(s2);
//                })
//                .map(s -> {
//                    System.out.println("map: " + s);
//                    return s.toUpperCase();
//                })
//                .forEach(s -> System.out.println("forEach: " + s));


//        Stream<String> stream = Stream.of("d2", "a2", "b1", "b3", "c")
//                .filter(s -> s.startsWith("a"));
//        System.out.println(stream.anyMatch(s -> s.startsWith("a"))); //true
//        System.out.println(stream.noneMatch(s -> s.startsWith("x"))); // exception (stream has been already operated)

        //Stream supplier
//        Supplier<Stream<String>> streamSupplier = () -> Stream.of("d2", "a2", "b1", "b3", "c")
//                .filter(s -> s.startsWith("a"));
//        streamSupplier.get().forEach(System.out::println);
//        System.out.println(streamSupplier.get().anyMatch(s -> s.contains("a")));


    }
}
