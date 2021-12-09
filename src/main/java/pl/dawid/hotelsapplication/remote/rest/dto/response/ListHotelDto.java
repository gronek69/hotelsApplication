package pl.dawid.hotelsapplication.remote.rest.dto.response;

import pl.dawid.hotelsapplication.remote.rest.dto.common.HotelDto;

import java.util.List;

public class ListHotelDto {

    private List<HotelDto> hotels;

    public ListHotelDto(List<HotelDto> hotels) {
        this.hotels = hotels;
    }
}
