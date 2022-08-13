import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String text = "elen sila lumenn omentilmo";

        Function<String, List<String>> function = (f) -> Arrays.stream(f.split(" "))
                .sorted(Comparator.naturalOrder())
                .distinct()
                .collect(Collectors.toList());

        // Реализация функционального интерфейса Function и Stream API (монада) -
        // это отличительные черты функционального стиля

        System.out.println("В словарь добавлены новые слова (дубликаты исключены), отсортированные в алфавитном порядке:");
        function.apply(text).forEach(System.out::println);
    }
}
