package homeWork7_2;

public class GSM {
	
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	String lastIncomingCall;
	String lastOutgoingCall;
	
	void insertSimCard(String newSimMobileNumber) {
		if(newSimMobileNumber.charAt(0) == '0' && newSimMobileNumber.charAt(1) == '8' 
				&& newSimMobileNumber.length()==10) {
			if(hasSimCard==false) {
				hasSimCard=true;
				simMobileNumber = newSimMobileNumber;
			}
			else {
				System.out.println("This GSM alredy has a sim! ");
			}
		}
	}
	void removeSimCard() {
		if(hasSimCard==true) {
			hasSimCard=false;
			simMobileNumber = null;
		}
	}
	
	
	void call(GSM callReceiver,int callDuration) {
		Call c1=new Call();
		c1.caller=simMobileNumber;
		c1.receiver=callReceiver.simMobileNumber;
		c1.duration=200;
		if(callDuration<c1.duration && c1.caller!=c1.receiver 
				&& hasSimCard && callReceiver.hasSimCard ) {
			lastOutgoingCall=c1.receiver;
			callReceiver.lastIncomingCall=simMobileNumber;
			outgoingCallsDuration+=callDuration;
		}
		else {
			System.out.println("Incorrect Call!");
		}
		
	}
	void getSumForCall(){
		Call c1=new Call();
		c1.priceForAMinute = 100;
		System.out.println("Outgoing calls sum: " + c1.priceForAMinute*outgoingCallsDuration);
	}
	void printInfoForTheLastOutgoingCall(){
		if(lastOutgoingCall!=null){
			System.out.println("Last Outgoing Call: " + lastOutgoingCall);
		}
	}
	void printInfoForTheLastIncomingCall() {
		if(lastIncomingCall!=null){
			System.out.println("Last Incoming Call: " + lastIncomingCall);
		}
	}

}
