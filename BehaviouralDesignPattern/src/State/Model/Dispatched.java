package State.Model;

public class Dispatched implements IPacketState {


	public void next(packet packets) {
		packets.setState(new Delivered());
	}


	public void current(packet packets) {
		System.out.println("Packet is in Dispatched state");

	}

	public void previous(packet packets) {
		System.out.println("Cannot go to previous state from the Dispatched state");
	}

}
