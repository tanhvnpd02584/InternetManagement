package com.fsoft.model.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "services")
public class Service {
	
	@Id
	@Column(name  = "serviceId")
	private long serviceId;
	
	@Column(name  = " serviceName")
	private String serviceName;
	
	@Column(name = "calUnit")
	private String calUnit;
	
	@Column(name = "unitPrice")
	private double unitPrice;
	
	@OneToMany(mappedBy = "service", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<UsingService> usingServices;
}
