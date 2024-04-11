import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class ItemType {
    private String name;
    private Double deposit;
    private Double costPerDay;

    public ItemType(String name, Double deposit, Double costPerDay) {
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
    }

    @Override
    public String toString() {
        return "The details of the item type are:\n" +
               "Name: " + name + "\n" +
               "Deposit: " + deposit + "\n" +
               "Cost Per Day: " + costPerDay;
    }

    // Getters and Setters
}

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter the Item type details:");
            System.out.println("Enter the name:");
            String name = reader.readLine();

            System.out.println("Enter the deposit:");
            Double deposit = Double.parseDouble(reader.readLine());

            System.out.println("Enter the cost per day:");
            Double costPerDay = Double.parseDouble(reader.readLine());

            ItemType item = new ItemType(name, deposit, costPerDay);
            System.out.println(item);
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
}
