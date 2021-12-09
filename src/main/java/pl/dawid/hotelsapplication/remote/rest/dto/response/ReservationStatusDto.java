package pl.dawid.hotelsapplication.remote.rest.dto.response;

import pl.dawid.hotelsapplication.remote.rest.dto.common.PersonDto;
import pl.dawid.hotelsapplication.remote.rest.dto.common.ReservationDto;
import pl.dawid.hotelsapplication.domain.model.ReservationStatus;

import java.util.List;

public class ReservationStatusDto {

    private int id;
    private ReservationStatus status;
    private List<ReservationDto> reservations;
    private PersonDto person;

    public ReservationStatusDto(int id, ReservationStatus status, List<ReservationDto> reservations, PersonDto person) {
        this.id = id;
        this.status = status;
        this.reservations = reservations;
        this.person = person;
    }
}
