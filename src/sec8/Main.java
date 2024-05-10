package sec8;

public class Main {
    public static void main(String[] args) {
        run();
        Log log = new Log();
        log.run();
        int result = log.calc(64);
        System.out.println(result);
    }

    private static void run() {
        System.out.println("Hello World_Main!");
    }
}
