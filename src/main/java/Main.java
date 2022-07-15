public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long expected = 30;
        long amount = 1000;
        boolean registered = true;

        long actual = service.calculate(amount, registered);
        System.out.println(expected + "==?==" + actual);
    }
}

