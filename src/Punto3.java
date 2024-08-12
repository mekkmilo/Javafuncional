import java.util.function.Predicate;

public class Punto3 implements Predicate<Integer>{


        Predicate<Integer> inEven = x -> x % 2 == 0;


    @Override
    public boolean test(Integer integer) {
        return inEven.test(integer);
    }

}
