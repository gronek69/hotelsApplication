package pl.dawid.hotelsapplication.remote.rest.dto.common;

public class ReservationDto {

    private int id;
    private int roomId;
    private int days;

    public ReservationDto(int id, int roomId, int days) {
        this.id = id;
        this.roomId = roomId;
        this.days = days;
    }
}
