package com.code.breakers.entity;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;
import jakarta.persistence.MappedSuperclass;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseEntity{
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@jakarta.persistence.Id
	Integer id;
}
