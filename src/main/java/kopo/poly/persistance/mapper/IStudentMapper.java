package kopo.poly.persistance.mapper;

import kopo.poly.dto.StudentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IStudentMapper {

    // 회원 등록
    void insertStudent(StudentDTO pDTO) throws Exception;

    //회원 전체 목록
    List<StudentDTO> getStudentList() throws Exception;

    //회원 1명보기
    StudentDTO getStudent(StudentDTO pDTO) throws Exception;

    //회원 글 수정
    void updateStudent(StudentDTO pDTO) throws Exception;

    //회원 글 삭제
    void deleteStudent(StudentDTO pDTO) throws Exception;

}
