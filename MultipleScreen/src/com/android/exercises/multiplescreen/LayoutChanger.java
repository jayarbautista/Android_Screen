package com.android.exercises.multiplescreen;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class LayoutChanger extends FragmentActivity{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
	   super.onCreate(savedInstanceState);
	   setContentView((Integer)this.getIntent().getSerializableExtra(MultipleScreenFragment.HOLD_LAYOUT));
	}
}
