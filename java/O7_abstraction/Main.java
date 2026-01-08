package O7_abstraction;

public class Main {
    public static void main(String[] args) {
        Beverage latte = new Coffee();
        Beverage tea = new Tea();

        latte.prepare(); // How hidden from caller
        latte.serve();

        tea.prepare();
        tea.serve();
    }
}
