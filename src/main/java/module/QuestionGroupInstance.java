package module;

import org.hibernate.mapping.Set;

public class QuestionGroupInstance {
	
;
	private int question_group_id;
	private int entity_id;
	private String date_conducted;
	private int completed_status;
	private int created_by;
	private int version_id;
	private int event_source_id;
	private Set id;
	
	public Set getId() {
		return this.id;
	}
	public void setId(Set id) {
		this.id = id;
	}
	public int getQuestion_group_id() {
		return this.question_group_id;
	}
	public void setQuestion_group_id(int question_group_id) {
		this.question_group_id = question_group_id;
	}
	public int getEntity_id() {
		return this.entity_id;
	}
	public void setEntity_id(int entity_id) {
		this.entity_id = entity_id;
	}
	public String getDate_conducted() {
		return this.date_conducted;
	}
	public void setDate_conducted(String date_conducted) {
		this.date_conducted = date_conducted;
	}
	public int getCompleted_status() {
		return this.completed_status;
	}
	public void setCompleted_status(int completed_status) {
		this.completed_status = completed_status;
	}
	public int getCreated_by() {
		return this.created_by;
	}
	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}
	public int getVersion_id() {
		return this.version_id;
	}
	public void setVersion_id(int version_id) {
		this.version_id = version_id;
	}
	public int getEvent_source_id() {
		return this.event_source_id;
	}
	public void setEvent_source_id(int event_source_id) {
		this.event_source_id = event_source_id;
	}
	

}
