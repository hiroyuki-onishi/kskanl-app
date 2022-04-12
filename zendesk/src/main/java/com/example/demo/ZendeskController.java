package com.example.demo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.DwhTicket;
import com.example.demo.service.DwhTicketService;

@Controller
public class ZendeskController {
  @Autowired
  DwhTicketService dwhTicketService;
  
  @RequestMapping("/index")
  public String index(Model model) {
        
    return "index";
  }

  @RequestMapping("/dwh_select_all")
  public String hello(Model model) {
    
//    model.addAttribute("hello", "Hello World!"); // Hello World!の表示
    
    // zendeskデータの取得
    List<DwhTicket> dwhTicketDataList = dwhTicketService.findAllData();
    model.addAttribute("dwhTicketDataList", dwhTicketDataList);
    
    return "dwhSelectAll";
  }
  
}