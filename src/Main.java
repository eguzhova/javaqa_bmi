public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 65.7f;
        float height = 1.74f;
        float bmi = service.calculate (weight,height);
        System.out.printf("Body Mass Index is "+"%.1f",bmi);
    }

}
