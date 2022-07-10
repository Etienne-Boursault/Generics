import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {
        shout("Etienne", "Yeah");
        shout(23, 42);
        shout(new Cat("Jerry"), new Dog());

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("Bernard"));
        printList(catList);
    }

    private static <T, V> void shout(T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "!!!!");
        System.out.println(otherThingToShout + "!!!!");
    }

    private static void printList(List<? extends Animal> myList) {
        System.out.println(myList);
    }
}
