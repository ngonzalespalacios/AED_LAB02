package LAB02;
import java.util.ArrayList;

public class Cajoneria<T> {
    private ArrayList<Caja<T>> cajoneria;

    public Cajoneria() {
        cajoneria = new ArrayList<>();
    }

    public void addCaja(Caja<T> caja) {
        cajoneria.add(caja);
    }

    public int[] search(T obj) {
        for (int i = 0; i < cajoneria.size(); i++) {
            if (cajoneria.get(i).getObjeto().equals(obj)) {
                return new int[]{i, cajoneria.get(i).getColor().hashCode()};
            }
        }
        return null;
    }

    public T delete(T obj) {
        for (int i = 0; i < cajoneria.size(); i++) {
            if (cajoneria.get(i).getObjeto().equals(obj)) {
                return cajoneria.remove(i).getObjeto();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cajoneria.size(); i++) {
            sb.append((i + 1) + " | " + cajoneria.get(i).getColor() + " | " + cajoneria.get(i).getObjeto() + "\n");
        }
        return sb.toString();
    }
}

