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

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @Setter @Getter
@Entity
@Table(name = "UsingComputers")
@IdClass(KeyUsingComputer.class)
public class UsingComputer {
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "guestID")
	private Guest guest;
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "computerId")
	private Computer computer;
	
	@Id
	private LocalDate dayStartUsingComputer;
	
	@Id
	private LocalTime timeStartUsingComputer;
	
	@Column(name = "timeUsingComputer")
	private int timeUsingComputer;
}
