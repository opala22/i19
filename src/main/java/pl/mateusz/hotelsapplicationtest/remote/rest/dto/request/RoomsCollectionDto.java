package pl.mateusz.hotelsapplicationtest.remote.rest.dto.request;

import java.util.List;

public class RoomsCollectionDto {

    private List<RoomsReservationDto> roomReservation;

    public RoomsCollectionDto() {
    }

    public RoomsCollectionDto(List<RoomsReservationDto> roomReservation) {
        this.roomReservation = roomReservation;

    }

    public List<RoomsReservationDto> getRoomReservation() {
        return roomReservation;
    }

    public void setRoomReservation(List<RoomsReservationDto> roomReservation) {
        this.roomReservation = roomReservation;
    }
}
