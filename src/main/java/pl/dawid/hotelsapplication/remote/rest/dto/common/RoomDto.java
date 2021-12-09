package pl.dawid.hotelsapplication.remote.rest.dto.common;

public class RoomDto {

    private int id;
    private int beds;
    private double price;

    public RoomDto(int id, int beds, double price) {
        this.id = id;
        this.beds = beds;
        this.price = price;
    }
}
