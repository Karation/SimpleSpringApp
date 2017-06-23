package app.service;


import app.model.Teacher;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public interface TeacherService {

    Teacher create(Teacher teacher);
    List<Teacher> findAllTeachers();
    void delete(String uuid);
}
