package com.conversions.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.conversions.service.ConvertServ;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/conversions")
public class ConvertRest {

  @Autowired
  ConvertServ convertServ;
  
  @GetMapping("/ktoc/{val}")
  public Object returnCelcius(@PathVariable("val") Double val) {
	
    if (val!=null) {
      return convertServ.convertToCelcius(val);
    } else {
      return "Null input";
    }
  }
  @GetMapping("/ctok/{val}")
  public Object returnKelvin(@PathVariable("val") Double val) {
	
    if (val!=null) {
      return convertServ.convertToKelvin(val);
    } else {
      return "Null input";
    }
  }
  @GetMapping("/mtok/{val}")
  public Object returnKilos(@PathVariable("val") Double val) {
	
    if (val!=null) {
      return convertServ.convertToKilometers(val);
    } else {
      return "Null input";
    }
  }
  @GetMapping("/ktom/{val}")
  public Object returnMiles(@PathVariable("val") Double val) {
	
    if (val!=null) {
      return convertServ.convertToMiles(val);
    } else {
      return "Null input";
    }
  }


}