package generics;
import java.util.ArrayList;

class Fruit {
    public void show() {
        System.out.println("I am a Fruit");
    }
}

class Apple extends Fruit {
    @Override
    public void show() {
        System.out.println("I am an Apple");
    }
}

class Mango extends Fruit {
    @Override
    public void show() {
        System.out.println("I am a Mango");
    }
}

class FruitBox<T extends Fruit> {

    private ArrayList<T> items = new ArrayList<>();

    public void add(T fruit) {
        items.add(fruit);
    }

    public void display() {
        for (T f : items) {
            f.show();
        }
    }
}

public class FruitStorage {
	public static void main(String[] args) {

        FruitBox<Fruit> box = new FruitBox<>();
        box.add(new Apple());
        box.add(new Mango());
        box.display();

        

    }
}
