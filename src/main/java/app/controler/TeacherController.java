package app.controler;


import app.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import app.service.TeacherService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @RequestMapping(value = "/create/{name}/{lastName}", method = RequestMethod.POST)
    public Teacher createTeacher(@RequestBody Teacher teacher) {
        return teacherService.create(teacher);
    }
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<Teacher> findAllTeachers(){
        return teacherService.findAllTeachers();
    }
    @RequestMapping(value = "/delete/{uuid}", method = RequestMethod.DELETE)
    public void deleteTeacher(@PathVariable String uuid){
        teacherService.delete(uuid);
    }

}
