package lk.IJSE.hostel.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class userFormDTO {
    private String UserName;
    private String Password;
    private String jobRole;
    private String passwordHint;
}
