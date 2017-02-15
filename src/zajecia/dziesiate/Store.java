package zajecia.dziesiate;

import java.util.HashMap;


public class Store {
    private Warehouse warehouse;

    public Store(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public Order cerateOrder(Client client) {
        return new Order(client, new HashMap<>());
    }

    public void addToBasket(Order order, Product product, int amount) {
        if (warehouse.hasAmount(product, amount)){
            order.addToOrder(product, amount);
        }else {
            System.out.println("Sorry");
        }
    }

    public void finish (Order order){
        HashMap<Product, Integer> basket = order.getBasket();
        basket.forEach((productsInBasket, amountOfProductInBasket) -> {
            warehouse.get(productsInBasket, amountOfProductInBasket);
        });
        System.out.println(order.finish());
    }
}
