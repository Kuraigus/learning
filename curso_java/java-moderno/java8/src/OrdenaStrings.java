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

        Comparator<String> comparador = new ComparadorDeTamanhos();
//        Collections.sort(palavras, comparador);
        palavras.sort(comparador);

//        System.out.println(palavras);

        Consumer<String> consumidor = new ImprimeNaLinha();
        palavras.forEach(consumidor);
    }
}

class ImprimeNaLinha implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class ComparadorDeTamanhos implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}
