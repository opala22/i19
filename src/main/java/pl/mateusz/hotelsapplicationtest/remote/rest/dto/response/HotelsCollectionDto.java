package pl.mateusz.hotelsapplicationtest.remote.rest.dto.response;

import java.util.List;

public class HotelsCollectionDto {

    private List<HotelDto> Hotels;

    public HotelsCollectionDto() {
    }

    public HotelsCollectionDto(List<HotelDto> hotels) {
        Hotels = hotels;
    }

    public List<HotelDto> getHotels() {
        return Hotels;
    }

    public void setHotels(List<HotelDto> hotels) {
        Hotels = hotels;
    }
}

