public class Phone {
    static String country = "United States";

    int number;
    String name;
    double weight;


    public Phone () {
    }

    public Phone(int number, String name, double weight) {
        this.number = number;
        this.name = name;
        this.weight = weight;
    }

    public void receiveCall(String name) {
        receiveCall(number, "");
    }

    public void receiveCall(int number, String name){
        System.out.println(" - " + name + " is calling\n" + (number == 0 ? "" : number + " calls"));
    }

}
