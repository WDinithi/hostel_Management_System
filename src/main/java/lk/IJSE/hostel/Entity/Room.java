package lk.IJSE.hostel.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@Entity(name = "Room")
public class Room implements SuperEntity{
    @Id
    private String room_type_id;
    private String type;
    private double key_money;
    private int qty;

    @ToString.Exclude
    @OneToMany(mappedBy = "room" , targetEntity = Reservation.class)
    private List<Reservation> reservationList=new ArrayList<>();

    public Room() {

    }
}
