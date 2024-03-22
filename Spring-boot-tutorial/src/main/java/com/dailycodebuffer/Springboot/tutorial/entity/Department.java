package com.dailycodebuffer.Springboot.tutorial.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Negative;
import javax.validation.constraints.NegativeOrZero;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long departmentId;
	@NotBlank(message="Please provide the Department Name")
 private String departmentName;
	private String departmentAddress;
	private String departmentCode;
	
	
	
	
	
	  /*
	    *==Validation annotations ==
	    *  @Length (max=5,min=1)
		@Size(max=10, min=2)
		@Email
		@Positive
		@PositiveOrZero
		@Negative
		@NegativeOrZero
		@Future
		@FutureOrPresent
		@Past
		@PastOrPresent
		*/
	
	
}
