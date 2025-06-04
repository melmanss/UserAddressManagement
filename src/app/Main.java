package app;

public class Main {
    public static void main(String[] args) {

        User user = new User("Олександр");

        Address address = new Address("Вулиця Передова, 1", "Дніпро", "49000");

        user.setAddress(address);

        System.out.println("Користувач: " + user.getName());
        System.out.println("Адреса: " + user.getAddress());
    }
}
