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

/*It displays a form to input data, here "listCats" is a reserved request attribute  
 *which is used to display object data into form  
 */    
@GetMapping("/")    
public String viewHomePage(Model model){ 
	
	model.addAttribute("listCats", apiService.getAllBreeds());  
    return "index";  
}
 
/*It saves object into database. The @ModelAttribute puts request data  
 *  into model object. */    
@PostMapping("/saveCat")
public String saveCat(@ModelAttribute("cat") CatBreed cat) {
    // save catbreed to database
    apiService.save(cat);
    return "redirect:/";
}


@GetMapping("/showNewCatBreedForm")    
public String showNewCatBreedForm(Model model){  
	// create model attribute to bind form data
    CatBreed cat= new CatBreed();    
    model.addAttribute("cat",cat);  
    return "new_cat_breed";    
}   
    
/* It deletes record for the given id in URL and redirects to / */         
@GetMapping("/deleteCat/{id}")
public String deleteCat(@PathVariable(value = "id") String id) {

    // call delete breed method
    deleteBreed(id);
    return "redirect:/";
}


//creating a delete mapping that deletes a specified cat breed
@DeleteMapping("/breeds/{breedid}")
private void deleteBreed(@PathVariable("breedid") String breedId) 
{
apiService.delete(breedId);
}

//creating a get mapping that retrieves all the cat breeds detail from the database

@GetMapping("/breeds") private List<CatBreed> getAllBreeds() { return
apiService.getAllBreeds(); }


  //creating post mapping that save the cat breed detail in the database
  
  @PostMapping("/breeds") 
  private String saveBreeds(@RequestBody CatBreed breeds) {
	  apiService.save(breeds);
	  return breeds.getId(); 
	  }
  
  
  //creating a get mapping that retrieves the detail of a specific breed
  
  @GetMapping("/breeds/{breedid}")
  private CatBreed getBreeds(@PathVariable("breedid") String breedId) { return
  apiService.getBreedById(breedId); }

}
