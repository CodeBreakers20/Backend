package com.code.breakers.entity;

import com.fasterxml.jackson.core.sym.Name;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class UserTemp extends BaseEntity {
	String username;
	
}
