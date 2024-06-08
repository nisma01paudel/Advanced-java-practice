final class Bike {
    void run() {
        System.out.println("running");
    }
}

// Honda cannot extend Bike because Bike is declared final
class Honda {
    void run() {
        System.out.println("running safely with 100 kmph");
    }

    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.run();
    }
}
