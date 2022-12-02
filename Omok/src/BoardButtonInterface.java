import java.awt.event.ActionEvent;
/**
 * 바둑판버튼 
 */
public interface BoardButtonInterface {
	/**
	 * 이 위치에 어떤 돌이 있는지 확인
	 * @return 돌을 놓은 사람의 고유번호를 돌려줌
	 */
	public int setStone();
	/**
	 * 버튼의 상태를 바꿔줌
	 * @return
	 */
	public int push();
	
	/**
	 * 버튼이 눌렸을때 이미지가 바뀌고 OmokFrame에 위치를 반환함
	 * @param e 
	 */
    void actionPerformed(ActionEvent e);
}