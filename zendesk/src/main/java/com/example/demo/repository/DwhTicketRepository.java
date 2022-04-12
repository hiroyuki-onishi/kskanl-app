package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.DwhTicket;

@Repository
public interface DwhTicketRepository extends JpaRepository<DwhTicket, Integer> {
	
}