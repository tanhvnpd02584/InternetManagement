package com.fsoft.model.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * @author TanHVN1
 *
 */
@NoArgsConstructor @Getter @Setter
@Entity
@Table(name = "computers")
public class Computer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "computerId")
	private Long computerId;
	
	@Column(name = "location")
	private String location;
	
	@Embedded
	private AdditionalAttributes status = new AdditionalAttributes();
	
	@OneToMany(mappedBy = "computer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<UsingComputer> usingComputers;
}
