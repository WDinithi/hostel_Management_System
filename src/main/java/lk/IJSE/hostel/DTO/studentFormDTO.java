package lk.IJSE.hostel.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class studentFormDTO {
    private String student_id;
    private String name;
    private String address;
    private String contact;
    private LocalDate date;
    private String gender;
}
