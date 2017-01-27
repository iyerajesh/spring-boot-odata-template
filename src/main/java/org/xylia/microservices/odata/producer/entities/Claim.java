package org.xylia.microservices.odata.producer.entities;

import java.io.Serializable;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * @author Rajesh Iyer
 */

@Entity
@Table(name = "CLM")
public class Claim implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.getLogger(Claim.class);

	@Id
	@GeneratedValue
	@Column(name = "I_CLM")
	private int id;

	@Column(name = "C_SCU_EVT")
	private String securityEventCode;

	@OneToOne
	@JoinColumn(name = "I_CLM")
	private LeaveEvent leaveEvent;

	public LeaveEvent getLeaveEvent() {
		return leaveEvent;
	}

	public void setLeaveEvent(LeaveEvent leaveEvent) {
		this.leaveEvent = leaveEvent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSecurityEventCode() {
		return securityEventCode;
	}

	public void setSecurityEventCode(String securityEventCode) {
		this.securityEventCode = securityEventCode;
	}

}