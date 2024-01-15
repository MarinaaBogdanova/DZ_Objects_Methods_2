public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int massIndex = service.calculate(1.7, 80);
        System.out.println(massIndex);
    }
}
