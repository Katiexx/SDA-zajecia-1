package zajecia.dziewiate;

/**
 * Created by RENT on 2017-02-11.
 */
public class Zajecia9 {
    public static void main(String[] args) {
        User user = new User("Zosia", "Kowalska", "24.08.1995");
        Address address = new Address("Poznan", "Polna", 23, "23-213", "Poland");
        user.address = address;
        user.print();

    }

    public static void printUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            users[i].print();

        }

    }


}


