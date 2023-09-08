package lk.IJSE.hostel.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Locale;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity (name="Reservation")
public class Reservation implements SuperEntity {
    @Id
    private String res_id;
    private Locale data;

    @ToString.Exclude
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER ) private  Student student;

    @ToString.Exclude
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER) private Room room ;

    private String status;
}
