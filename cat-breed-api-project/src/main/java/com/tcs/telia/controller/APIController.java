package com.tcs.telia.controller;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.telia.model.CatBreed;
import com.tcs.telia.service.APIService;
//mark class as Controller

@Controller
public class APIController 
{
//Autowiring the Service class
@Autowired
APIService apiService;

/*It displays a form to input data, here "command" is a reserved request attribute  
 *which is used to display object data into form  
 */    
@GetMapping("/")    
public String viewHomePage(Model model){ 
	
	model.addAttribute("listCats", apiService.getAllBreeds());  
    return "index";  
}
 
}
