package solid;

import solid.srp.models.Input;
import solid.srp.models.Order;
import solid.srp.models.Persistent;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Input input = new Input();
        Order order = input.inputFromConsole();
        Persistent persistent = new Persistent("order.json");
        persistent.saveToJson(order);
    }
}
