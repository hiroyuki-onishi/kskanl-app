package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.model.DwhTicket;
import com.example.demo.repository.DwhTicketRepository;
@Service
@Transactional
public class DwhTicketService{
  
  @Autowired
  DwhTicketRepository dwhTicketRepository;
  
  /**
   * レコードを全件取得する。
   * @return
   */
  public List<DwhTicket> findAllData(){
    
    return dwhTicketRepository.findAll();
  }
}