package pl.mateusz.hotelsapplicationtest.remote.rest.dto.response;

import pl.mateusz.hotelsapplicationtest.domain.model.ReservationStatusType;
import pl.mateusz.hotelsapplicationtest.remote.rest.dto.request.PersonDto;
import pl.mateusz.hotelsapplicationtest.remote.rest.dto.request.RoomsReservationDto;

import java.util.List;

public class ReservationsDto {

    private Integer id;

    private ReservationStatusType status;

    private List<RoomsReservationDto> reservation;

    private PersonDto person;

    public ReservationsDto() {
    }

    public ReservationsDto(Integer id, ReservationStatusType status, List<RoomsReservationDto> reservation, PersonDto person) {
        this.id = id;
        this.status = status;
        this.reservation = reservation;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ReservationStatusType getStatus() {
        return status;
    }

    public void setStatus(ReservationStatusType status) {
        this.status = status;
    }

    public List<RoomsReservationDto> getReservation() {
        return reservation;
    }

    public void setReservation(List<RoomsReservationDto> reservation) {
        this.reservation = reservation;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
