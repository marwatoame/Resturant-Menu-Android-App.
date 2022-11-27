package com.example.resturantmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.resturantmenu.model.FoodItem;
import com.example.resturantmenu.model.IItemsData;
import com.example.resturantmenu.model.ItemsData;

import java.util.List;

public class MenuActivity extends AppCompatActivity {

    private TextView mainmenu;
    private Spinner spn_list;
    private Button btn_show;
    private ListView lv_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mainmenu = findViewById(R.id.mainmenu);
        spn_list = findViewById(R.id.spn_list);
        btn_show = findViewById(R.id.btn_show);
        lv_list = findViewById(R.id.lv_list);

        IItemsData data = new ItemsData();
        List<String> cats = data.getCategories();
        ArrayAdapter<String> adapterCats = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, cats);
        spn_list.setAdapter(adapterCats);

        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = spn_list.getSelectedItem().toString();
                List<FoodItem> result = data.getItemsByCat(str);
                ArrayAdapter<FoodItem> adapterItems = new ArrayAdapter<FoodItem>(MenuActivity.this,
                        android.R.layout.simple_list_item_1, result);
                lv_list.setAdapter(adapterItems);
            }
        });

    }
}