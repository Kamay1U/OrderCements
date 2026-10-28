
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        FileService fileService = new FileService();

        List<Order> orders = fileService.readOrders();

        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
