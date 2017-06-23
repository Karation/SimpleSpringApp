package app.repository;


import app.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mkrec_000 on 16/06/2017.
 */
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    Teacher findOneByUuid(String uuid);
    void deleteByUuid(String uuid);
}
