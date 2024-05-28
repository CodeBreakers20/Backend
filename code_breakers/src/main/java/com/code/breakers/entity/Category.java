package com.code.breakers.entity;

import java.util.ArrayList;
import java.util.List;

import javax.swing.border.TitledBorder;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public class Category extends BaseEntity {
		
		String title;
		
		@OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
		private List<Word> words;
			
		public Category(String title) {
			this.title = title;
			this.words = new ArrayList<>();
		}
		public Category() {
			
		}
		
		public int getId() {
			return this.id;
		}
		public String getTitle() {
			// TODO Auto-generated method stub
			return this.title;
		}
	}
