package app.service.impl;

import app.dto.TeacherDTO;
import app.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.repository.TeacherRepository;
import app.service.TeacherService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

/**
 * Created by mkrec_000 on 16/06/2017.
 */
@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;


    @Override
    public Teacher create(Teacher teacher) {
        if (teacher == null) {
            throw new RuntimeException();
        }
        if (teacher.getId() != null) {
            throw new RuntimeException();
        }

        teacher.setUuid(UUID.randomUUID().toString());
        return  teacherRepository.save(teacher);
    }

    @Override
    public List<Teacher> findAllTeachers() {
        return teacherRepository.findAll();
    }

    @Override

    public void delete(String uuid) {
        teacherRepository.deleteByUuid(uuid);
    }
}
