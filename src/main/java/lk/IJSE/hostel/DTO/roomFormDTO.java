package lk.IJSE.hostel.DTO;

import lk.IJSE.hostel.Entity.Reservation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class roomFormDTO implements SuperDTO {
    private String room_type_id;
    private String type;
    private double key_money;
    private int qty;

    @ToString.Exclude
    List<Reservation> reservationList=new ArrayList<>();
}
