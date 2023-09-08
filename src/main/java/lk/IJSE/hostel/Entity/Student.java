package lk.IJSE.hostel.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@Entity(name="Student")
public class Student implements SuperEntity {
    @Id
    private String student_id;
    private String name;
    private String address;
    private String contact;
    private LocalDate date;
    private String gender;

    @ToString.Exclude
    @OneToMany(mappedBy = "Student" ,targetEntity = Reservation.class)
    private List<Reservation> list= new ArrayList<>();

    public Student() {

    }
}
