package conway.domain;

public interface ICell {
	void setStatus(boolean v);
	boolean isAlive();
	void switchCellState();
}
