package com.example.demo.dao;


import com.example.demo.modle.Court;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by WangLei on 18-6-4.
 */
@Transactional
@Repository
@ResponseBody
public interface CourtDao extends JpaRepository<Court, Integer> {



    @Query(value = "select c from Court c where c.courtId = ?1")
    Court findByCourtId(int courtId);


    @Modifying
    @Query(value = "update Court c set c.num = c.num + 1 where c.courtId = ?1")
    int updateCourt(int courtId);





}
