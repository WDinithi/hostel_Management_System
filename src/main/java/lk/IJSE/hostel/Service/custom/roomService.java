package lk.IJSE.hostel.Service.custom;

import lk.IJSE.hostel.DTO.roomFormDTO;

import java.util.List;

public interface roomService {
    List<roomFormDTO> roomSearchByText(String text);
    int getRoomCount();
}
