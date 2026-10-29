
import java.time.LocalDateTime;

public class OrderParser {

    public Order parseOrder(String line) {
        String[] parts = line.split("\\|");

        LocalDateTime dateTime = LocalDateTime.parse(parts[0]);
        String nameCompany = parts[1];
        int quantity = Integer.parseInt(parts[2]);

        return new Order(nameCompany, quantity, dateTime);
    }
}
