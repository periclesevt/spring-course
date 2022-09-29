package com.springcourse.springcourse.repository;


import com.springcourse.springcourse.Request;
import com.springcourse.springcourse.RequestStage;
import com.springcourse.springcourse.domain.enums.RequestState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestStageRepository extends JpaRepository<RequestStage, Long> {

    public List<RequestStage> findAllByRequestId(Long id);

    @Query("UPDATE Request SET state = ?2 WHERE id = ?1")
    public Request updateStatus(Long id, RequestState state);
}
