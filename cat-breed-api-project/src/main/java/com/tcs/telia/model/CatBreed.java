package com.tcs.telia.model;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties
@Entity
@Table(name = "cat_breed")
public class CatBreed implements Serializable
{

@JsonProperty("id")
@Id
@Column
private String id;

@JsonProperty("name")
@Column
private String name;

@Column
@JsonProperty("breed_group")
private String breed_group;

@Column
@JsonProperty("weight")
private String weight;

@Column
@JsonProperty("description")
private String description;



private final static long serialVersionUID = -5914134685995471799L;

@JsonProperty("id")
public String getId() {
return id;
}

@JsonProperty("id")
public void setId(String id) {
this.id = id;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("weight")
public String getWeight() {
return weight;
}

@JsonProperty("breed_group")
public String getBreed_group() {
	return breed_group;
}

@JsonProperty("breed_group")
public void setBreed_group(String breed_group) {
	this.breed_group = breed_group;
}

@JsonProperty("weight")
public void setWeight(String weight) {
this.weight = weight;
}

@JsonProperty("description")
public String getDescription() {
	return description;
}

@JsonProperty("description")
public void setDescription(String description) {
	this.description = description;
}

}