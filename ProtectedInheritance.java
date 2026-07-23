class Person {
    protected String name;
    protected int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Scholar extends Person {
    String branch;

    Scholar(String name, int id, String branch) {
        super(name, id);
        this.branch = branch;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Branch: " + branch);
    }
}

public class ProtectedInheritance {
    public static void main(String[] args) {
        Scholar s = new Scholar("Adhithyan", 101, "Computer Science");
        s.display();
    }
}