package PostGame;

public class GroundMailService extends Mail {
	
//	 public GroundMailService(String type) {
//		if(type.equalsIgnoreCase("Truck")){
//			createMail(1);
//		}else if(type.equalsIgnoreCase("Train")) {
//			createMail(2);
//		}
//	}

	@Override
	public Transport createMail() {
		return new Truck();
	}

}
//mishe iino behtar ham nevesht injoori ke naim ye bar to sazandeh if bezarim ye bar to
//create. mishe to main mostaghim method create ro seda bazani, parameter bedi behesh