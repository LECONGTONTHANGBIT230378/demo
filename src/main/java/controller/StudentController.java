package controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @GetMapping
    public List<String> getStudents() {
        return List.of("Thắng", "Quang", "Minh");
    }

    @GetMapping("/{id}")
    public String getStudentById(@PathVariable int id) {
        List<String> students = List.of("Thắng", "Quang", "Minh");
        if (id >= 0 && id < students.size()) {
            return students.get(id);
        }
        return "Không tìm thấy sinh viên";
    }
}