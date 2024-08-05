package State.Test;

import State.Model.packet;

public class packetTest {
public static void main(String[] args) {
	packet packets=new packet();
	
	packets.currentStatus();
	
	packets.goToNextState();
	packets.goToPreviousState();
}
}
