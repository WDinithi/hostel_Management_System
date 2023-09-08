package lk.IJSE.hostel.Service;

import jakarta.persistence.Id;
import lk.IJSE.hostel.DTO.SuperDTO;

import java.io.Serializable;
import java.util.List;

public interface SuperService <T extends SuperDTO, ID extends Serializable>{
boolean save(T dto);
boolean update(T dto);
boolean delete (T dto);
T search(Id id);
List<T> getAll();
//ID getLastId;
}
