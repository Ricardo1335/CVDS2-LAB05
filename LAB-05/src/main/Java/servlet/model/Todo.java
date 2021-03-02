package servlet.model;


public class Todo {
	private int UserId;
	private int Id;
	private String Title;
	private boolean Completed;
	public Todo(){}
	public int getUserId() {
		return UserId;
	}
	public int getId() {
		return Id;
	}
	public String getTitle() {
		return Title;
	}
	public boolean getCompleted() {
		return Completed;
	}
	public void setUserId(int UserId) {
		this.UserId = UserId;
	}
	public void setId(int Id) {
		this.Id = Id;
	}
	public void setTitle(String Title) {
		this.Title = Title;
	}
	public void setCompleted(boolean Completed) {
		this.Completed = Completed;
	}
	

	
}
