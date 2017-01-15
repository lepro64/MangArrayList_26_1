package demo.dinhmau.sadec.mangarraylist_26;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.Listview);
        final ArrayList<String> mangmonhoc=new ArrayList<String>();
        mangmonhoc.add("Lập trình Androidd");
        mangmonhoc.add("Lập trình Androidd");
        mangmonhoc.add("Lập trình Androidd");
        mangmonhoc.add("Lập trính Androidd");
        mangmonhoc.add("Lập trính IOS");
        mangmonhoc.add("Lập trính PHP");
        mangmonhoc.add("Lập trính ASP.NET");
        mangmonhoc.add("Lập trính Windows");
        mangmonhoc.add("Lập trính C");
        mangmonhoc.add("Lập trính Windows Phone");
        mangmonhoc.add("Lập trính C#");
        mangmonhoc.add("Lập trính C#");
        mangmonhoc.add("Lập trính C#");
        mangmonhoc.add("Lập trính C#");
        mangmonhoc.add("Lập trính C+");
        ArrayAdapter adapter =new ArrayAdapter(
                MainActivity.this,android.R.layout.simple_list_item_1,mangmonhoc
        );
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(
                        MainActivity.this,
                        mangmonhoc.get(position),
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}
