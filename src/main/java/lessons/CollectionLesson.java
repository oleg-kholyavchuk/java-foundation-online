package lessons;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class CollectionLesson {

    public static void main(String[] args) {

        List list = List.of("ddsdsds", "dsdsffsfsfs", "ds", "sdafsafas");

        printAll(list);

        nCopies(list, 1);

        System.out.println("list = " + list);

    }

    public static void printAll(Iterable<?> iterable) {
        for (Object odj : iterable) {
            System.out.print(" ----- " + odj + " , ");
        }
    }

    public static <T> Iterable<T> nCopies(T value, int count) {
        if (count < 0)
            throw new IllegalArgumentException("Negative: " + count);
        return () -> new Iterator<>() {
            int rest = count;

            @Override
            public boolean hasNext() {
                return rest > 0;
            }

            @Override
            public T next() {
                if (rest == 0)
                    throw new NoSuchElementException();
                rest--;
                return value;
            }
        };
    }
}
