/**
 * 
 */
package com.capgemini.traineelab.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Mayur Dongare
 *
 */

@Entity
@Table(name = "trainee")
public class Trainee {

	@Id
	private int traineeId;

	@NotEmpty(message = "Enter Name.")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "Name must contain only alphabets")
	private String traineeName;

	private String traineeDomain;
	private String traineeLocation;

	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getTraineeDomain() {
		return traineeDomain;
	}

	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}

	public String getTraineeLocation() {
		return traineeLocation;
	}

	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}

}
