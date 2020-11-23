package com.fsoft.model.bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @Getter @Setter
@Embeddable 
public class AdditionalAttributes {

	@Column(name = "status", columnDefinition = "varchar(10)")
	private String status = "new";
}
