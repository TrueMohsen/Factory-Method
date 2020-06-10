package PostGame;

public abstract class Mail {
	
	public void newMailService() {
		Transport t=createMail();
		t.deliver();
	}
	
	public abstract Transport createMail();

}
