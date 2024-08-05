package State.Model;

public class Delivered implements IPacketState {

	public void next(packet packets) {
		packets.setState(this);
	}

	public void current(packet packets) {
		System.out.println("Packet is in Delivered state");

	}

	public void previous(packet packets) {
		System.out.println("cannot move to previous state from Delivered state");
	}

}
