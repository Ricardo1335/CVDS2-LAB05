
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
	public static setUserId(int UserId) {
		this.UserId = UserId;
	}
	public static setId(int Id) {
		this.Id = Id;
	}
	public static setTitle(String Title) {
		this.Title = Title;
	}
	public static setCompleted(boolean Completed) {
		this.Completed = Completed;
	}
	

	
}
