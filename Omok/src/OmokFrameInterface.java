/**
 * int[][] plate를 가지고 BoardButton[][] OmokButtonArray와 판정해서 프레임을 화면에 보여줌
 */
public interface OmokFrameInterface {
	/**
	 * 이 위치에 돌을 놓음
	 * @param row 가로
	 * @param col 세로
	 */
	public void setStone(int row, int col);
	/**
	 * plate, OmokButtonArray 초기화 시키기
	 */
	public void reset();
	
}
