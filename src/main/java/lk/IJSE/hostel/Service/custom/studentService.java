package lk.IJSE.hostel.Service.custom;

import lk.IJSE.hostel.DTO.studentFormDTO;

import java.util.List;

public interface studentService {
    List<studentFormDTO> studentSearchByText(String text);
    int getStudentCount();

}
