package pl.dawid.hotelsapplication.remote.rest.dto.common;

import java.util.List;

public class HotelDto {

    private int id;
    private String name;
    private List<RoomDto> rooms;

    public HotelDto(int id, String name, List<RoomDto> rooms) {
        this.id = id;
        this.name = name;
        this.rooms = rooms;
    }
}
