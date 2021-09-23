package com.shotathemagician.btu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.shotathemagician.btu.R;
import com.shotathemagician.btu.CircleMenuLayout.OnMenuItemClickListener;

public class MainCircleActivity extends Activity {

	private CircleMenuLayout mCircleMenuLayout;
	private String[] mItemTexts = new String[] { "გოგრა", "კაცი ქუდზე", "არქიტექტ2","კამფეტი", "დრაკულას სახლი", "ბუსკუნჩულა","დიდი ძმა","სანთელი" };
	private int[] mItemImgs = new int[] { R.drawable.a,
			R.drawable.b, R.drawable.c,
			R.drawable.d, R.drawable.e,
			R.drawable.f,R.drawable.g,R.drawable.h};

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main02);

		mCircleMenuLayout = (CircleMenuLayout) findViewById(R.id.id_menulayout);
		mCircleMenuLayout.setMenuItemIconsAndTexts(mItemImgs, mItemTexts);

		mCircleMenuLayout.setOnMenuItemClickListener(new OnMenuItemClickListener()
		{

			@Override
			public void itemClick(View view, int pos)
			{
				Toast.makeText(MainCircleActivity.this, mItemTexts[pos],Toast.LENGTH_SHORT).show();
			}

			@Override
			public void itemCenterClick(View view)
			{
				Toast.makeText(MainCircleActivity.this,"ოინი ან ხუმრობა!  ",Toast.LENGTH_SHORT).show();
			}
		});
	}
}