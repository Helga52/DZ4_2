public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 73; // вес
        float height = 1.62F; // рост
        int bmi = service.calculate(weight, height); // должно получиться 27
        System.out.println(bmi);
    }
}