package pl.dawid.hotelsapplication.remote.rest.dto.request;

import pl.dawid.hotelsapplication.remote.rest.dto.common.PersonDto;
import pl.dawid.hotelsapplication.remote.rest.dto.common.ReservationDto;

import java.util.List;

public class CreateReservationDto {

    private List<ReservationDto> reservations;
    private PersonDto person;

    public CreateReservationDto(List<ReservationDto> reservations, PersonDto person) {
        this.reservations = reservations;
        this.person = person;
    }
}
