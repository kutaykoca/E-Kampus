package com.javatpoint.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.javatpoint.model.Faculty;
import com.javatpoint.service.FacultyService;

@RestController
public class FacultyController
{
    @Autowired
    FacultyService facultyService;
    @GetMapping("/faculty")
    private List<Faculty> getAllFaculty()
    {
        return facultyService.getAllFaculty();
    }
    @GetMapping("/faculty/{id}")
    private Faculty getFaculty(@PathVariable("id") int id)
    {
        return facultyService.getFacultyById(id);
    }
    @DeleteMapping("/faculty/{id}")
    private void deleteFaculty(@PathVariable("id") int id)
    {
        facultyService.delete(id);
    }
    @PostMapping("/faculty")
    private int saveFaculty(@RequestBody Faculty faculty)
    {
        facultyService.saveOrUpdate(faculty);
        return faculty.getId();
    }
}
