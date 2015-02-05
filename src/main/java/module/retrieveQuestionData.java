package module;

public class retrieveQuestionData {

	private Integer	question_id;
	private Integer	answer_type;
	private Integer	question_state;
	private String	question_text;
	private Integer	numeric_min;
	private Integer	numeric_max;
	private String nickname;
	

	public int getQuestion_id() {
		return this.question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public int getAnswer_type() {
		return this.answer_type;
	}
	public void setAnswer_type(int answer_type) {
		this.answer_type = answer_type;
	}
	public int getQuestion_state() {
		return this.question_state;
	}
	public void setQuestion_state(int question_state) {
		this.question_state = question_state;
	}
	public String getQuestion_text() {
		return this.question_text;
	}
	public void setQuestion_text(String question_text) {
		this.question_text = question_text;
	}
	public int getNumeric_min() {
		return this.numeric_min;
	}
	public void setNumeric_min(int numeric_min) {
		this.numeric_min = numeric_min;
	}
	public int getNumeric_max() {
		return this.numeric_max;
	}
	public void setNumeric_max(int numeric_max) {
		this.numeric_max = numeric_max;
	}
	public String getNickname() {
		return this.nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


}
