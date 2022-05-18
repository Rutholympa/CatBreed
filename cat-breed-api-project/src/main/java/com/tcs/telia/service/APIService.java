package com.tcs.telia.service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tcs.telia.model.CatBreed;
import com.tcs.telia.repository.APIRepository;
//defining the business logic
@Service
public class APIService 
{
@Autowired
APIRepository aPIRepository;

//getting all cat record by using the method findAll() of CrudRepository
public List<CatBreed> getAllBreeds() 
{
List<CatBreed> cats = new ArrayList<CatBreed>();
aPIRepository.findAll().forEach(cats1 -> cats.add(cats1));
return cats;
}

//getting a specific record by using the method findById() of CrudRepository
public CatBreed getBreedById(String id) 
{
return aPIRepository.findById(id).get();
}

//saving a specific record by using the method save() of CrudRepository
public void save(CatBreed breeds) 
{
aPIRepository.save(breeds);
}
//deleting a specific record by using the method deleteById() of CrudRepository
public void delete(String id) 
{
aPIRepository.deleteById(id);
}
//updating a record
public void update(CatBreed cat, String catId) 
{
aPIRepository.save(cat);
}

}