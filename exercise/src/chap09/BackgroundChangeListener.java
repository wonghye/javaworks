package chap09;

import chap09.CheckBox.OnSelectListener;

public class BackgroundChangeListener implements OnSelectListener{

	@Override
	public void onSelect() {
		System.out.println("배경을 변경합니다.");
	}
	
}
