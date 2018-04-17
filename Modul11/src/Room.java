import java.util.Random;

public abstract class Room implements RoomProperties{
    private int size;
    private int amountOfDoors;
    private int amountOfWindows;
    private String roomType;
    private String floorType;

    public Room(String roomType, int size, int amountOfDoors, int amountOfWindows) {
        this.roomType = roomType;
        this.size = size;
        this.amountOfDoors = amountOfDoors;
        this.amountOfWindows = amountOfWindows;
        this.floorType = setFloorType();
    }

    public Room() {

    }

    public String setFloorType() {
        String[] types = {"wood", "stone", "granite", "plastic"};
        Random r = new Random();
        String floorType = types[r.nextInt(types.length)];
        return floorType;
    }

    public int getSize() {
        return this.size;
    }

    public String getFloorType() {
        return this.floorType;
    }

    public int getAmountOfDoors() {
        return this.amountOfDoors;
    }

    public int getAmountOfWindows() {
        return this.amountOfWindows;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public String getShower() {
        return "lol";
    }


    public void PrintStats() {
        System.out.printf("\ntype: %s\n", getRoomType());
        System.out.printf("size: %dm^2\n", size);
        System.out.printf("doors: %d\n", amountOfDoors);
        System.out.printf("windows: %d\n", amountOfWindows);
    }
}
