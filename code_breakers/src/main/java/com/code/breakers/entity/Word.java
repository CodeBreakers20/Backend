package com.code.breakers.entity;

import com.fasterxml.jackson.core.sym.Name;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Word extends BaseEntity {
	String name;
	
	@ManyToOne
	@JsonProperty(access = Access.WRITE_ONLY)
	Category category;
	
}
