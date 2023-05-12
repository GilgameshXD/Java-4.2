public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 98;
        double height = 1.87;
        int index = (int) service.calculate(weight, height); // должно получиться 500
        System.out.println(index);
    }
}