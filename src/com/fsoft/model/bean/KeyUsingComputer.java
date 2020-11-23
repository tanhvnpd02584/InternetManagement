package com.fsoft.model.bean;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @Getter @Setter
public class KeyUsingComputer implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Guest guest;
	private Computer computer;
	private LocalDate dayStartUsingComputer;
	private LocalTime timeStartUsingComputer;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((computer == null) ? 0 : computer.hashCode());
		result = prime * result + ((dayStartUsingComputer == null) ? 0 : dayStartUsingComputer.hashCode());
		result = prime * result + ((guest == null) ? 0 : guest.hashCode());
		result = prime * result + ((timeStartUsingComputer == null) ? 0 : timeStartUsingComputer.hashCode());
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
		KeyUsingComputer other = (KeyUsingComputer) obj;
		if (computer == null) {
			if (other.computer != null)
				return false;
		} else if (!computer.equals(other.computer))
			return false;
		if (dayStartUsingComputer == null) {
			if (other.dayStartUsingComputer != null)
				return false;
		} else if (!dayStartUsingComputer.equals(other.dayStartUsingComputer))
			return false;
		if (guest == null) {
			if (other.guest != null)
				return false;
		} else if (!guest.equals(other.guest))
			return false;
		if (timeStartUsingComputer == null) {
			if (other.timeStartUsingComputer != null)
				return false;
		} else if (!timeStartUsingComputer.equals(other.timeStartUsingComputer))
			return false;
		return true;
	}
	
	
}
