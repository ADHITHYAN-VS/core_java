interface InterfaceA {
    default void show() {
        System.out.println("Interface A show");
    }
}

interface InterfaceB {
    default void show() {
        System.out.println("Interface B show");
    }
}

class CombinedService implements InterfaceA, InterfaceB {
    @Override
    public void show() {
        InterfaceA.super.show();
        InterfaceB.super.show();
        System.out.println("Combined implementation complete");
    }
}

public class MultipleInterfaceConflict {
    public static void main(String[] args) {
        CombinedService cs = new CombinedService();
        cs.show();
    }
}