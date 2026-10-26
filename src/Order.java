import java.util.Arrays;

public class Order {

    private String customer;
    private Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Product[] getBasket() {
        return basket;
    }

    public void setBasket(Product[] basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Заказ: " + Arrays.toString(this.basket) + ", Покупатель: " + this.customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        if (!customer.equals(order.customer)) return false;
        if (this.basket.length != order.basket.length) return false;
        for (int i = 0; i < basket.length; i++) {
            Product product1 = this.basket[i];
            Product product2 = order.basket[i];
            if ((product1 == null && product2 != null) || (product1 != null && !product1.equals(product2))) {
                return false;
            }
        }
        return true;
    }
}
