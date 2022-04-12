package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DwhTicket;
import com.example.demo.service.DwhTicketService;

@RestController
public class ZendeskRestController {
	  @Autowired
	  DwhTicketService dwhTicketService;

	
	@RequestMapping("/rest/dwh_select_all")
	public List<DwhTicket> restAll() {
		return dwhTicketService.findAllData();
	}
	
//	@RequestMapping("/rest/{num}")
//	public MyData restBy(@PathVariable int num) {
//		return service.get(num);
//	}
}
