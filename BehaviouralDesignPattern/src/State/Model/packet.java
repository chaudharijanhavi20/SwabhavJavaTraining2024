package State.Model;

public class packet {
	IPacketState state;

	public packet() {
		state = new Ordered();
	}

	public IPacketState getState() {
		return state;
	}

	public void setState(IPacketState state) {
		this.state = state;
	}

	public void goToNextState() {
		state.next(this);
	}

	public void goToPreviousState() {
		state.previous(this);
	}

	public void currentStatus() {
		state.current(this);
	}
}
