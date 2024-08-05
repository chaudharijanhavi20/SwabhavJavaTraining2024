package State.Model;

public class Ordered implements IPacketState {

	public void next(packet packets) {
		packets.setState(new Dispatched());
	}

	public void current(packet packets) {
		System.out.println("Packet is in Ordered state");
	}

	public void previous(packet packets) {
		System.out.println("Cannot go to previous state from Ordered state");
	}

}
