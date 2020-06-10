package PostGame;

public class AirMailService extends Mail{

	@Override
	public Transport createMail() {
		return new Plane();
	}

}
