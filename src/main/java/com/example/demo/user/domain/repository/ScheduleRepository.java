package com.example.demo.user.domain.repository;

import com.example.demo.user.domain.entity.Schedule;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface ScheduleRepository extends JpaRepository<Schedule, Long>{

  @Query(value = "SELECT * FROM schedule where start between:sdate and:edate", nativeQuery = true)
  List<Schedule> findByStartBetween(String sdate, String edate);

  Schedule findByScheduleSeq(int scheduleSeq);

  @Transactional
  void removeByScheduleSeq(int scheduleSeq);
}
