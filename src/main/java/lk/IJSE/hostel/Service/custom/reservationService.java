package lk.IJSE.hostel.Service.custom;

import lk.IJSE.hostel.DTO.reservationDTO;
import lk.IJSE.hostel.Service.SuperService;

import java.util.List;

public interface reservationService extends SuperService<reservationDTO, String> {
    List<reservationDTO> reservationSearchByText(String text);
    List<reservationDTO> getNotPaidKeyMoney();
}
