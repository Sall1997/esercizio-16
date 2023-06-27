public class House {
    private String address;
    private int numberOfRooms;
    private int numberOfFloors;

    public House(String address, int numberOfRooms, int numberOfFloors) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.numberOfFloors = numberOfFloors;
        System.out.println("A new House has been created");

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}