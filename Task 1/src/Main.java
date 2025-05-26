public class Main {
    public static void main(String[] args) {

        Phone iphone = new Phone(8999, "Iphone", 1.1);
        Phone samsung = new Phone(8800, "Samsung", 1.2);

        iphone.receiveCall("Iphone");
        samsung.receiveCall(8800, "Samsung");

        Phone honor = new Phone();
        honor.name = "Honor";
        honor.weight = 1.3;
        honor.number = 8900;
    }
}
