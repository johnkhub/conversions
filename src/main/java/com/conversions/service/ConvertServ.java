package com.conversions.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConvertServ {

	public Double convertToCelcius(Double inKelvin) {
		
		return (inKelvin+273.15);
	}
	public Double convertToKelvin(Double inCelsius) {
		
		return (inCelsius-273.15);
	}
	public Double convertToKilometers(Double inMiles) {
		
		return (inMiles*1.60934);
	}
	public Double convertToMiles(Double inKilos) {
		
		return (inKilos*0.621371);
	}
	/*
	@Autowired
	CustomerRepo customerRepo;
	
	public List<CustomerModel> getAllCustomers(){
		List<CustomerModel> custList=customerRepo.findAll();
		if(custList.size()>0) {
			return custList;
		}
		else {
			return new ArrayList<CustomerModel>();
		}
	}
	
	public CustomerModel getCustomerById(Long id) {
		Optional<CustomerModel> cust=customerRepo.findById(id);
		if(cust.isPresent()) {
			return cust.get();
		}
		else {
			return null;/// throw
		}
	}
	
	public CustomerModel updateCustomer(Long cid,CustomerModel inCust) {
			if(cid != null) {
				Optional<CustomerModel> cust=customerRepo.findById(cid);
				if(cust.isPresent()) {
					CustomerModel newCust=cust.get();
					newCust.setCname(inCust.getCname());
					return newCust;
				}
				else {
					return null;
				}	
			}
			else {
				return null;
			}
	}
	
	public CustomerModel createCustomer(CustomerModel inCust) { //throws
		inCust=customerRepo.save(inCust);
		return inCust;
	}
	
	public void deleteCustomer(Long id) {
		Optional<CustomerModel>cust=customerRepo.findById(id);
		if(cust.isPresent()) {
			customerRepo.deleteById(id);
		}
		else {
			//return null;
		}
	}
	
	public void deleteAllCustomers() {
		customerRepo.deleteAll();
	}
	*/
}
