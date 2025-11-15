package generics;

class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
}

public class generic_pair {
	public static void main(String[] args) {

        Pair<String, Integer> student = new Pair<>("Amol", 20);
        System.out.println("Name: " + student.getFirst());
        System.out.println("Age: " + student.getSecond());

        Pair<Double, String> data = new Pair<>(99.5, "Marks");
        System.out.println("First: " + data.getFirst());
        System.out.println("Second: " + data.getSecond());
    }
}
