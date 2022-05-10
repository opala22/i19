package pl.mateusz.hotelsapplicationtest.remote.rest.dto.response;

import java.util.List;

public class HotelDto {
    private Integer id;

    private String name;

    private List<RoomDto> room;

    public HotelDto() {
    }

    public HotelDto(Integer id, String name, List<RoomDto> room) {
        this.id = id;
        this.name = name;
        this.room = room;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RoomDto> getRoom() {
        return room;
    }

    public void setRoom(List<RoomDto> room) {
        this.room = room;
    }
}
