package State.Model;

public interface IPacketState {
	void next(packet packets);

	void current(packet packets);

	void previous(packet packets);
}
