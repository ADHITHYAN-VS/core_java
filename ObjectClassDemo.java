class Product {
    int id;
    String name;

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product[id=" + id + ", name=" + name + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product other = (Product) obj;
        return id == other.id;
    }
}

public class ObjectClassDemo {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Keyboard");
        Product p2 = new Product(101, "Keyboard");

        System.out.println(p1);
        System.out.println("Equals check: " + p1.equals(p2));
    }
}