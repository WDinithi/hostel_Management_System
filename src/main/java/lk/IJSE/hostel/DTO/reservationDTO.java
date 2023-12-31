package lk.IJSE.hostel.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class reservationDTO implements SuperDTO {
    private String res_id;
    private LocalDate date;

    @ToString.Exclude
    private studentFormDTO studentFormDTO;

    @ToString.Exclude
    private roomFormDTO roomFormDTO;
    private String status;
}
