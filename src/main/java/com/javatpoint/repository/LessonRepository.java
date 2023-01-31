package com.javatpoint.repository;
import org.springframework.data.repository.CrudRepository;
import com.javatpoint.model.Lesson;
public interface LessonRepository extends CrudRepository<Lesson, Integer>
{
}
