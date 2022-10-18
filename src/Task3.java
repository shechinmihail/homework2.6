import java.util.ArrayList;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {
        example();
    }

    static void example() {
        List<List<String>> biDemArrList = new ArrayList<>();
        boolean replacement = true;
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                int zero = 0;
                if (replacement) zero = 1;
                if (j % 2 == zero) {
                    biDemArrList.get(i).add(j, "◯");
                } else {
                    biDemArrList.get(i).add(j, "●");
                }
            }
            replacement = !replacement;
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
