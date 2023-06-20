public class Application {
    String firstName = "";
    String lastName = "";

    public void fullName() {
        System.out.println("Firstname: " + firstName + ", " + " Lastname: " + lastName);
    }
    public Application(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void main(String[] args) {
        Application app = new Application("Maria ", "Martinez");
        app.fullName();
    }
}

