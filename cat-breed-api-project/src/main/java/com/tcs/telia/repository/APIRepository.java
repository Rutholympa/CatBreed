package com.tcs.telia.repository;
import org.springframework.data.repository.CrudRepository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.telia.model.CatBreed;

public interface APIRepository extends JpaRepository<CatBreed, String>
{

}
