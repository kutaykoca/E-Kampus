package com.javatpoint.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.javatpoint.model.Lesson;
import com.javatpoint.service.LessonService;

@RestController
public class LessonController
{
    @Autowired
    LessonService lessonService;
    @GetMapping("/lesson")
    private List<Lesson> getAllLesson()
    {
        return lessonService.getAllLesson();
    }
    @GetMapping("/lesson/{id}")
    private Lesson getLesson(@PathVariable("id") int id)
    {
        return lessonService.getLessonById(id);
    }
    @DeleteMapping("/lesson/{id}")
    private void deleteLesson(@PathVariable("id") int id)
    {
        lessonService.delete(id);
    }
    @PostMapping("/lesson")
    private int saveLesson(@RequestBody Lesson lesson)
    {
        lessonService.saveOrUpdate(lesson);
        return lesson.getId();
    }
}
