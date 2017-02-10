package com.theironyard.androidcontacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import static android.R.id.list;
import static com.theironyard.androidcontacts.R.styleable.View;

public class MainActivity extends AppCompatActivity implements android.view.View.OnClickListener, AdapterView.OnItemLongClickListener {


    ArrayAdapter<String> it; 
    EditText text;
    Button addButton;
    ListView listView;

    ArrayAdapter<String> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addButton.setOnClickListener(this);
        text.setOnClickListener(this);

        listView = (ListView) findViewById(R.id.listView);
        text = (EditText) findViewById(R.id.editText);
        addButton = (Button) findViewById(R.id.button);

        items = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)
        list.setAdapter(items);



    }

    @Override
    public void onClick(View v, EditText text, EditText phone) {
        String item = text.getText().toString();
        String phone = text.getPhone().toString();
        items.add(item);
        text.setText("");

    }

    @Override
    public boolean setOnItemLongClickListener(AdapterView<?> parent, View view, int position, long id) {
        String item = items.getItem(position);
        items.remove(item);
        return true;
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        return false;
    }
}
