package com.androidsnippets.wordpress.swipetodelete;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends SwipeListViewActivity {

	private ListView mListView;
	private ArrayAdapter<String> mAdapter;

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mListView = (ListView) findViewById(R.id.listView1);
		mAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, new String[] { "Item 1",
						"Item 2", "Item 2", "Item 3", "Item 4", "Item 5" });
		mListView.setAdapter(mAdapter);
		
		
		// Added comment and comment 
		// Added another comment
		
	}

	@Override
	public ListView getListView() {
		return mListView;
	}

	@Override
	public void getSwipeItem(boolean isRight, int position) {
		Toast.makeText(this,
				"Swipe to " + (isRight ? "right" : "left") + " direction",
				Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onItemClickListener(ListAdapter adapter, int position) {
		Toast.makeText(this, "Single tap on item position " + position,
				Toast.LENGTH_SHORT).show();
	}

}
