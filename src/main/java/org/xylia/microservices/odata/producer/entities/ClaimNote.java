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
@Table(name = "CLM_NTE")
public class ClaimNote implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.getLogger(ClaimNote.class);

	@Id
	@GeneratedValue
	@Column(name = "I_CLM")
	private int id;

	@Column(name = "C_TYP_NTE")
	private String noteType;

	@Column(name = "T_CRT_RCD")
	private Date noteCreatedDate;

	@Column(name = "T_UDT_RCD")
	private Date noteUpdatedDate;

	@Column(name = "I_USR_CRT_RCD")
	private String noteCreatorUser;

	@Column(name = "I_USR_UDT_RCD")
	private String noteUpdatedUser;

	@Column(name = "X_CMT")
	private String comments;

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getNoteType() {
		return noteType;
	}

	public void setNoteType(final String noteType) {
		this.noteType = noteType;
	}

	public Date getNoteCreatedDate() {
		return noteCreatedDate;
	}

	public void setNoteCreatedDate(final Date noteCreatedDate) {
		this.noteCreatedDate = noteCreatedDate;
	}

	public Date getNoteUpdatedDate() {
		return noteUpdatedDate;
	}

	public void setNoteUpdatedDate(final Date noteUpdatedDate) {
		this.noteUpdatedDate = noteUpdatedDate;
	}

	public String getNoteCreatorUser() {
		return noteCreatorUser;
	}

	public void setNoteCreatorUser(final String noteCreatorUser) {
		this.noteCreatorUser = noteCreatorUser;
	}

	public String getNoteUpdatedUser() {
		return noteUpdatedUser;
	}

	public void setNoteUpdatedUser(final String noteUpdatedUser) {
		this.noteUpdatedUser = noteUpdatedUser;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(final String comments) {
		this.comments = comments;
	}

}