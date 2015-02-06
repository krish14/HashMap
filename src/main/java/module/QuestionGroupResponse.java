package module;

public class QuestionGroupResponse {

	private int	id; 
	private int	sections_questions_id;
	private String	response;
	private String	tag;
	private QuestionGroupInstance question_group_instance_id;
	
	
	public QuestionGroupInstance getQuestion_group_instance_id() {
		return this.question_group_instance_id;
	}
	public void setQuestion_group_instance_id(QuestionGroupInstance question_group_instance_id) {
		this.question_group_instance_id = question_group_instance_id;
	}
	                        
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getSections_questions_id() {
		return this.sections_questions_id;
	}
	public void setSections_questions_id(int sections_questions_id) {
		this.sections_questions_id = sections_questions_id;
	}
	public String getResponse() {
		return this.response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public String getTag() {
		return this.tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}


}
