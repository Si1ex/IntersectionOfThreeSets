import java.util.HashSet;
import java.util.Set;

public class TRAI_22_X5_dankurhi implements TRAI_22_X5 {
    
    public <E> Set<E> yhdessaKolmesta(Set<E> s1, Set<E> s2, Set<E> s3) {

        Set<E> tulos = new HashSet<>();

        // TODO

        HashSet<E> A = new HashSet<>(s1);
        HashSet<E> B = new HashSet<>(s2);
        HashSet<E> C = new HashSet<>(s3);

        for (E x : A)
            if (!s2.contains(x) && !s3.contains(x))
                tulos.add(x);
        for (E x : B)
            if (!s1.contains(x) && !s3.contains(x))
                tulos.add(x);
        for (E x : C)
            if (!s2.contains(x) && !s1.contains(x))
                tulos.add(x);


        return tulos;
    }
}