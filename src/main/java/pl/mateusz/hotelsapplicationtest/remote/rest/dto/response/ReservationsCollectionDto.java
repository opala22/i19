package pl.mateusz.hotelsapplicationtest.remote.rest.dto.response;

import java.util.List;

public class ReservationsCollectionDto {

    private List<ReservationsDto> reservation;

    public ReservationsCollectionDto() {
    }

    public ReservationsCollectionDto(List<ReservationsDto> reservation) {
        this.reservation = reservation;
    }

    public List<ReservationsDto> getReservation() {
        return reservation;
    }

    public void setReservation(List<ReservationsDto> reservation) {
        this.reservation = reservation;
    }
}
