import java.util.*;

public class CopyListDemo {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number n : src) dest.add(n);
    }

    public static void main(String[] args) {
        List<Number> dest = new ArrayList<>();
        List<Integer> srcInt = Arrays.asList(1, 2, 3);
        List<Double> srcDbl = Arrays.asList(1.1, 2.2);

        copyList(dest, srcInt);
        copyList(dest, srcDbl);

        System.out.println("Dest contains: " + dest);
    }
}
