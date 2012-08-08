package com.example.listview.selected.row;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class AtoZ_List extends Activity implements OnItemClickListener{

	String[] values = new String[] { 
    		"A: ANDROID", "B: BLUETOOTH", "C: CHAT",
    		"D: DOWNLOAD", "E: EMAIL", "F: FACEBOOK", "G: GOOGLE", "H: HP",
    		"I: IPHONE", "J: JAVA", "K: KINGSTON", "L: LAPTOP", "M: MESSENGER",
    		"N: NERO", "O: ORKUT", "P: PICASSA", "Q: QUICKHEAL", "R: RAM",
    		"S: STACKOVERFLOW", "T: TWITTER", "U: USB", "W: WIFI", "V: VISTA",
    		"X: XP","Y: YOUTUBE","Z: ZORPIA"};
	
	ListView lv;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        lv = (ListView)findViewById(R.id.listView1);
        lv.setAdapter(new ArrayAdapter<String>(AtoZ_List.this, R.layout.list_row,R.id.textView1, values));
        
        // Set multiple row selection enable.
        // lv.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        
        // Set single row selection enable.
        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        lv.setItemChecked(1, true);
        lv.setOnItemClickListener(this);
    }

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		
		// If you setted multi-selection then use this.
		// CheckableLayout cl = (CheckableLayout)view;
		// cl.toggle();
		
		// If you set single selecton then use this.
		lv.setItemChecked(position, true);
	}
    
}
