package com.srt.service.kotlinservice.service

import org.springframework.stereotype.Service
import com.srt.service.kotlinservice.model.Customer

@Service
class Service {
	
	fun getCustomerById (customerId: String): Customer
	{
		return  Customer();
	}
}