import java.util.ArrayList;
public class Test{
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        System.out.println("Размер ArrayList = " + a.size());
        a.add(5);a.add(-1);a.add(22);a.add(17);
        System.out.println("Элемент с индексом два = " + a.get(2));
        System.out.println("Удалим элемент с индексом один = " + a.remove(1));
        System.out.println("Элемент с индексом один = " + a.get(1));
        System.out.println("Размер ArrayList = " + a.size());
        a.clear();
    }
}