import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        palavras.add("Alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

//        Comparator<String> comparador = new ComparadorDeTamanhos();
//        Collections.sort(palavras, comparador);
        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

//        System.out.println(palavras);

        palavras.forEach(s -> System.out.println(s));
    }
}
