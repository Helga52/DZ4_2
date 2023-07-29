public class BmiService {
    public int calculate(int weight, float height) {
        return (int) (weight / Math.pow(height,2));
    }
}
