package com.Cocacola.pricemanagementapi.Repository;

import com.Cocacola.pricemanagementapi.Entities.Level;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelRepository extends JpaRepository<Level, Long> {

    @Modifying
    @Transactional
    @Query(
            value = "ALTER SEQUENCE tb_level_id_seq RESTART WITH 1",
            nativeQuery = true
    )
    void resetSequence();
}