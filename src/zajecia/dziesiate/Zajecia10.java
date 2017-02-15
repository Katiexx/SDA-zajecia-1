package zajecia.dziesiate;

import zajecia.dziewiate.Address;
import zajecia.dziewiate.User;

import java.util.HashMap;

/**
 * Created by RENT on 2017-02-13.
 */
public class Zajecia10 {
    public static void main(String[] args) {

        Product product1 = new Product ("carrot");
        Product product2 = new Product ("beetroot", "fresh", 4.0);
        Product product3 = new Product ("broccoli", "frozen", 6.5);

        Client client1 = new Client ("Jan", "Kowalski");
        Client client2 = new Client ("Zbigniew", "Wolski");
        Client client3 = new Client ("Krzysztof", "Nowak", "606736234", new Address("Poznan","Polna", 34, "23-345", "Polska"));
        HashMap<Product, Integer> products = new HashMap<>();
        products.put(product1, 50);
        products.put(product2, 10);
        products.put(product3, 300);
       Warehouse warehouse = new Warehouse((products));
        HashMap<Product, Integer> productIntegerHashMap = warehouse.get(product1, 20);
        System.out.println();


//        HashMap<String, User> map = new HashMap<>();
//        map.put("1234567", new User ("Szymon" , "Nowak","askjldfhlk"));
//        map.put("1234567", new User ("Szymon" , "Nowak","askjldfhlk"));
//        map.forEach((k, v) -> {
//            System.out.println(k);
//            System.out.println(v);
//            System.out.println();
//        });

//        User user = map.get("1234567");
//        System.out.println(user);
    }
}
