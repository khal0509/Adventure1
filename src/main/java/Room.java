public class Room {
    private String name;

    private String description;
    private Room North;
    private Room East;
    private Room West;
    private Room South;

    public Room(String name, String Description) {
        this.name = name;
        this.description = description;
    }


}
