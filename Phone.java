package Phone;

public class Phone {
    String number;
    String model;
    int weight;

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nPhone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void receiveCall(String name){
        System.out.println("Звонит " + name + Phone.this.getNumber());
    }
    public void receiveCall(String name, String phone){
        System.out.println("Звонит " + name + phone);
    }

    public void sendMessage(String ... numbers){
        for (String number : numbers){
            System.out.println(number);
        }
        System.out.println();
    }
}
