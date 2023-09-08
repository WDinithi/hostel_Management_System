package lk.IJSE.hostel.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "User")
public class User implements SuperEntity{
    @Id

    private String UserName;
    private String Password;
    private String jobRole;
    private String passwordHint;
}
