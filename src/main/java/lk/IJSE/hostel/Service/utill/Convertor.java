package lk.IJSE.hostel.Service.utill;

import lk.IJSE.hostel.DTO.roomFormDTO;
import lk.IJSE.hostel.DTO.studentFormDTO;
import lk.IJSE.hostel.Entity.Student;

public class Convertor {
    public studentFormDTO tostudentFormDTO(Student student) {
        studentFormDTO studentFormDTO = new studentFormDTO();
        studentFormDTO.setStudent_id(student.getStudent_id());
        studentFormDTO.setName(student.getName());
        studentFormDTO.setAddress(student.getAddress());
        studentFormDTO.setContact(student.getContact());
        studentFormDTO.setDate(student.getDate());
        studentFormDTO.setGender(student.getGender());
        return studentFormDTO;

    }
}