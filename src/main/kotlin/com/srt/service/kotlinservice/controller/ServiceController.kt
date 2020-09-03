package com.srt.service.kotlinservice.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.http.ResponseEntity
import com.srt.service.kotlinservice.model.Customer
import com.srt.service.kotlinservice.service.Service

@RestController
@RequestMapping("api/v1")
class ServiceController (private val service: Service) {
	
	
	
	@RequestMapping("/getCustomer/{id}")
fun getCustomer(@PathVariable id: String): ResponseEntity<Customer>{
		return ResponseEntity.ok(service.getCustomerById(id));
	}
}