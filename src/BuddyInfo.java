public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;

    // Constructor with all fields
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Default constructor
    public BuddyInfo() {
        this("No Name", "No Address", "No Phone");
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void printbuddy(){
        System.out.println(name);
    }

}
