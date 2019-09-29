package storyG.No15_observer.obser1;

public class Button {
	public void onClick() {
		//�̺�Ʈ ó��
		if(onClickOListener != null) {
			onClickOListener.onClick(this);
		}
	}
	public interface OnClickListener{
		public void onClick(Button button);
	}
	private OnClickListener onClickOListener;
	public void setOnClickOListener(OnClickListener onClickListener) {
		this.onClickOListener = onClickListener;
	}
}
