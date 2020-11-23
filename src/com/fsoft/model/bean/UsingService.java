package com.fsoft.model.bean;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Range;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor @Getter @Setter
@Entity
@Table(name = "usingServices")
@IdClass(KeyUsingService.class)
public class UsingService {
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "guestID")
	private Guest guest;
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "serviceId")
	private Service service;
	
	@Id
	@Column(name = "dateUsing")
	private LocalDate dateUsing;
	
	@Id
	@Column(name = "timeUsing")
	private LocalTime timeUsing;
	
	@Column(name = "quantity")
	@Range(min = 1 , message = "quantity must greater than 0")
	private int quantity;
	
}
