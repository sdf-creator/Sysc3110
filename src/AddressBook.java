import java.util.ArrayList;

public class AddressBook {

    private ArrayList <BuddyInfo> buddies;

    public AddressBook() {
        this.buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddies.add(buddy);
            System.out.println("added!");
        }
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);

    }

    public static void main(String[] args){
        System.out.println("Address Book");
    }
}
