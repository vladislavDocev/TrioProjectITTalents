package homeWork7_2;

public class CallDemo {

	public static void main(String[] args) {
		GSM gsm1 = new GSM();
		gsm1.hasSimCard=true;
		gsm1.simMobileNumber="0883495503";
		
		GSM gsm2 = new GSM();
		gsm2.hasSimCard=true;
		gsm2.simMobileNumber="0883495504";
		
		gsm1.call(gsm2, 189);
		gsm1.getSumForCall();
		gsm1.printInfoForTheLastOutgoingCall();
		gsm2.printInfoForTheLastIncomingCall();
	}

}
