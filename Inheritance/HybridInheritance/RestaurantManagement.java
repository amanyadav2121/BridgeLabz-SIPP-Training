

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

interface Worker {
    void performDuties();
}

class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking dishes.");
    }
}

class Waiter extends Person implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers.");
    }
}

public class RestaurantManagement {
    public static void main(String[] args) {

        Chef chef = new Chef("Ravi", 101);
        Waiter waiter = new Waiter("Anita", 201);

        System.out.println("Chef Info:");
        chef.displayPersonInfo();
        chef.performDuties();

        System.out.println();

        System.out.println("Waiter Info:");
        waiter.displayPersonInfo();
        waiter.performDuties();
    }
}
