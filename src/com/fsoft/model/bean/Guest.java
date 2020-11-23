package com.fsoft.model.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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

@NoArgsConstructor @Getter @Setter
@Entity
@Table(name = "guests")
public class Guest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "guestID")
	private long guestID;
	
	@Column(name = "guestName")
	private String guestName;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "phoneNumber")
	private String phoneNumber;
	
	@Column(name = "email")
	private String email;
	
	@OneToMany(mappedBy = "guest", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<UsingComputer> usingComputers;

	@OneToMany(mappedBy = "guest", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<UsingService> usingServices;
}
