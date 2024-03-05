package app;

public class Main {
    public static void main(String[] args) {
        Collection userCollection = new Collection();

        userCollection.addser(new User("Dima", "Dima@gmail.com"));
        userCollection.addser(new User("Bob", "Dima@gmail.com"));
        userCollection.addser(new User("Tim", "Tim@gmail.com"));
        userCollection.addser(new User("Marya", "Marya@gmail.com"));
        userCollection.addser(new User("Misha", "Misha@gmail.com"));

        System.out.println();
        userCollection.printAllUsers();

        int indexTo = 3;
        User userAtIndex = userCollection.getUserAtIndex(indexTo);
        if (userAtIndex != null) {
            System.out.println("\nUser at index " + indexTo + ": " + userAtIndex);
        } else {
            System.out.println("\nNo user found at index " + indexTo);
        }
    }
}
