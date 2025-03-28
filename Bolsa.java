package LAB02;
import java.util.ArrayList;
import java.util.Iterator; 

public class Bolsa<T>implements Iterable<T> {
	private ArrayList<T> lista = new ArrayList<>();
    private int tope;

    public Bolsa(int tope) {
    	super();
        this.tope = tope;
    }

    public void add(T objeto) {
        if (lista.size() >= tope) {
            throw new RuntimeException("La bolsa está llena, no caben más elementos.");
        } else {
            lista.add(objeto);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return lista.iterator();
    }
}
