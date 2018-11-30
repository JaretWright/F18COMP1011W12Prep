import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class WarmUp {
    public static void main(String[] args)
    {
        TreeMap<String, Double> gifts = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return t1.compareToIgnoreCase(s);
            }
        });

        gifts.put("MSI GT83", 6149.00);
        gifts.put("Canon EF 50mm/1.4 portrait kit", 659.99);
        gifts.put("Apple watch 4", 519.99);

        for (String gift: gifts.keySet())
            System.out.printf("%s costs: $%.2f%n", gift, gifts.get(gift));
    }
}
