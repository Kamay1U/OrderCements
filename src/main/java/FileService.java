
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileService {

    public List<Order> readOrders() throws IOException {
        List<String> lines = Files.readAllLines(
                Path.of("D:\\JAVAproject\\TestCement\\untitled\\discount_day.txt")
        );

        List<Order> orders = new ArrayList<>();
        OrderParser parser = new OrderParser();

        for (String line : lines) {
            Order orderItem = parser.parseOrder(line);
            orders.add(orderItem);
        }

        return orders;
    }
}
