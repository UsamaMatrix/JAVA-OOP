class Parent {
    private String privateMessage = "This is a private message.";
    protected String protectedMessage = "This is a protected message.";

    public void showMessages() {
        System.out.println("Inside Parent class:");
        System.out.println(privateMessage);
        System.out.println(protectedMessage);
    }
}

class Child extends Parent {
    public void accessMessages() {
        System.out.println("Inside Child class:");
        // System.out.println(privateMessage); // ❌ Error: privateMessage not accessible
        System.out.println(protectedMessage);  // ✅ Accessible due to protected modifier
    }
}

public class AccessModifiersDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.accessMessages();

        System.out.println("----------");

        Parent p = new Parent();
        p.showMessages();
    }
}
