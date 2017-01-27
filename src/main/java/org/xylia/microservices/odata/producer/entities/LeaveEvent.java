package org.xylia.microservices.odata.producer.entities;

import java.io.Serializable;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * @author Rajesh Iyer
 */

@Entity
@Table(name = "LVE_EVT")
public class LeaveEvent implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.getLogger(LeaveEvent.class);

	@Id
	@GeneratedValue
	@Column(name = "I_CLM")
	private int id;

	@Column(name = "I_EMY")
	private int employeeId;

	@Column(name = "D_WRK_LST")
	private String dateLastWorked;

	@Column(name = "I_STA_RTW")
	private String returnToWorkStatus;

	@Column(name = "D_RTW")
	private String returnToWorkDate;

	@Column(name = "T_UDT_RCD")
	private Date recordUpdatedTimestamp;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getDateLastWorked() {
		return dateLastWorked;
	}

	public void setDateLastWorked(String dateLastWorked) {
		this.dateLastWorked = dateLastWorked;
	}

	public String getReturnToWorkStatus() {
		return returnToWorkStatus;
	}

	public void setReturnToWorkStatus(String returnToWorkStatus) {
		this.returnToWorkStatus = returnToWorkStatus;
	}

	public String getReturnToWorkDate() {
		return returnToWorkDate;
	}

	public void setReturnToWorkDate(String returnToWorkDate) {
		this.returnToWorkDate = returnToWorkDate;
	}

	public Date getRecordUpdatedTimestamp() {
		return recordUpdatedTimestamp;
	}

	public void setRecordUpdatedTimestamp(Date recordUpdatedTimestamp) {
		this.recordUpdatedTimestamp = recordUpdatedTimestamp;
	}

}