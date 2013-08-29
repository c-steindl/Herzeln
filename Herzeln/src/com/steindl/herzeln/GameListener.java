package com.steindl.herzeln;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class GameListener implements OnClickListener {
	private Button ok;
	private HerzelnActivity ha;

	public GameListener(HerzelnActivity herzelnActivity) {
		ha = herzelnActivity;
	}

	@Override
	public void onClick(View arg0) {
		//ok = (Button) arg0.findViewById(R.id.ok_button);
		//ha.setContentView(R.layout.new_game);
	}

}
