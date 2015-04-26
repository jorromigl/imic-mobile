package com.imic.app.imic;
import java.sql.Blob;
import java.util.Date;
import java.util.Collection;
import java.util.HashSet;





import org.codehaus.jackson.annotate.JsonIgnore;



public class Incidence extends DomainEntity{
	
	private String referenceNumber;
	private String status;
	private String title;
	private String description;
	private Blob photo;
	private Date creationDate;
	private Date closingDate;
	private String conclusions;
	private Date actualizationDate;

	
	public Incidence(){
		super();
		comments = new HashSet<Comment>();
		assessmentIncidences = new HashSet<AssessmentIncidence>();

	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public Blob getPhoto() {
		return photo;
	}

	public void setPhoto(Blob photo) {
		this.photo= photo;
	}
	

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(Date closingDate) {
		this.closingDate = closingDate;
	}
	
	public String getConclusions() {
		return conclusions;
	}

	public void setConclusions(String conclusions) {
		this.conclusions = conclusions;
	}
	

	public Date getActualizationDate() {
		return actualizationDate;
	}
	
	
	public void setActualizationDate(Date actualizationDate) {
		this.actualizationDate = actualizationDate;
	}
	
	private Policy policy;
	private Expert expert;
	private RepairCompany repairCompany;
	private Collection<Comment> comments;
	private Collection<AssessmentIncidence> assessmentIncidences;
	

	public Policy getPolicy() {
		return policy;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}
	
	@JsonIgnore
	public Expert getExpert() {
		return expert;
	}

	public void setExpert(Expert expert) {
		this.expert = expert;
	}
	
	@JsonIgnore
	public RepairCompany getRepairCompany() {
		return repairCompany;
	}

	public void setRepairCompany(RepairCompany repairCompany) {
		this.repairCompany = repairCompany;
	}
	
	@JsonIgnore
	public Collection<Comment> getComments() {
		return comments;
	}

	public void setComments(Collection<Comment> comment) {
		this.comments = comment;
	}

	@JsonIgnore
	public Collection<AssessmentIncidence> getAssessmentIncidences() {
		return assessmentIncidences;
	}

	public void setAssessmentIncidences(
			Collection<AssessmentIncidence> assessmentIncidences) {
		this.assessmentIncidences = assessmentIncidences;
	}
	
	
	
	
	

}
