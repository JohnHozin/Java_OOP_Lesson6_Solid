public class Persister implements Savable{
	private User user;
	
	public Persister(User user){
		this.user = user;
	}
	
	public void save(){
		System.out.println("Save user: " + user.getName());
	}

	@Override
	public void report() {
		System.out.println("Report for user: " + user.getName());
	}
}