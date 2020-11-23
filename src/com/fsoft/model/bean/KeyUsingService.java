package com.fsoft.model.bean;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor @Getter @Setter
public class KeyUsingService implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Guest guest;
	private Service service;
	private LocalDate dateUsing;
	private LocalTime timeUsing;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateUsing == null) ? 0 : dateUsing.hashCode());
		result = prime * result + ((guest == null) ? 0 : guest.hashCode());
		result = prime * result + ((service == null) ? 0 : service.hashCode());
		result = prime * result + ((timeUsing == null) ? 0 : timeUsing.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KeyUsingService other = (KeyUsingService) obj;
		if (dateUsing == null) {
			if (other.dateUsing != null)
				return false;
		} else if (!dateUsing.equals(other.dateUsing))
			return false;
		if (guest == null) {
			if (other.guest != null)
				return false;
		} else if (!guest.equals(other.guest))
			return false;
		if (service == null) {
			if (other.service != null)
				return false;
		} else if (!service.equals(other.service))
			return false;
		if (timeUsing == null) {
			if (other.timeUsing != null)
				return false;
		} else if (!timeUsing.equals(other.timeUsing))
			return false;
		return true;
	}
}
