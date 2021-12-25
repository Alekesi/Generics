public class Main {
    public static void main(String[] args) {
        Generic<Integer> example = new Generic<>(1);
        System.out.println(example.toString());
        System.out.println(example.getcar());

        Generic<String> example1 = new Generic<>("2");
        System.out.println(example1.toString());
        System.out.println(example1.getcar());;

    }
}
