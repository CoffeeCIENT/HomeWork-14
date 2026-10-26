//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product scanner = new Product(2, "Сканер", 2000, "Инструменты");
        System.out.println(scanner);
        Product scanner2 = new Product(2, "Сканер", 2600, "Инструменты");
        System.out.println(scanner2);
        Product megger = new Product(3, "Мегомметр", 6000, "Измерители");
        System.out.println(megger);
        Product mp3 = new Product(5, "Плеер", 720, "Девайсы");
        System.out.println(mp3);

        boolean equalsProducts2And3 = scanner.equals(megger);
        System.out.println("Равны ли товары - " + scanner.getName() + " и " + megger.getName() + " = " + equalsProducts2And3);

        Order order1 = new Order("Астрид_Dark", new Product[]{scanner, megger});
        System.out.println(order1);
        Order order2 = new Order("Шут_гороховый", new Product[]{mp3});
        System.out.println(order2);
        Order order3 = new Order("Лезвие_12", new Product[]{scanner, megger});
        System.out.println(order3);
        Order order4 = new Order("Астрид_Dark", new Product[]{scanner, megger});
        System.out.println(order4);

        boolean equalsOrders1And3 = order1.equals(order3);
        System.out.println("Равны ли заказы - " + order1.getCustomer() + " и " + order3.getCustomer() + " = " + equalsOrders1And3);
        boolean equalsOrders1And4 = order1.equals(order4);
        System.out.println("Равны ли заказы - " + order1.getCustomer() + " и " + order4.getCustomer() + " = " + equalsOrders1And4);
        boolean equalsOrders2And3 = order2.equals(order3);
        System.out.println("Равны ли заказы - " + order2.getCustomer() + " и " + order3.getCustomer() + " = " + equalsOrders2And3);
    }
}