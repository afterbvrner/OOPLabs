package com.example.taskmanager.repository;

import com.example.taskdriver.entity.Employee;
import com.example.taskdriver.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Repository
public interface TaskRepository extends JpaRepository<Task, UUID> {
    List<Task> findAllByEmployee(Employee employee);
    List<Task> findAllByActivatedAfterAndActivatedBefore(Instant start, Instant end);
    List<Task> findAllByOpenedAfterAndOpenedBefore(Instant start, Instant end);
    List<Task> findAllByResolvedAfterAndResolvedBefore(Instant start, Instant end);
}
