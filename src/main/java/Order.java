
import java.time.LocalDateTime;

public class Order {
    String nameCompany;
    int quantity;
    LocalDateTime dateTime;

    public Order(String nameCompany, int quantity, LocalDateTime dateTime) {
        this.nameCompany = nameCompany;
        this.quantity = quantity;
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Компания: " + nameCompany
                + ", количество: " + quantity
                + ", Дата и время: " + dateTime;
    }
}
