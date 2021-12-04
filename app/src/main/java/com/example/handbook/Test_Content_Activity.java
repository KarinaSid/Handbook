package com.example.handbook;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class Test_Content_Activity extends AppCompatActivity {
    private TextView text_content;
    private Typeface face1;
    private ImageView iContent;
    private int category = 0;
    private int position = 0;
    private int[] array_cat= {R.string.cat1, R.string.cat2 ,R.string.cat3,R.string.cat4,R.string.cat5,R.string.cat6,R.string.cat7,R.string.cat8,R.string.cat9};
    private int[] array_food= {R.string.food1,R.string.food2,R.string.food3};
    private int[] array_diseases= {R.string.disease1,R.string.disease2,R.string.disease3,R.string.disease4,R.string.disease5,R.string.disease6,R.string.disease7};
    private int[] array_care= {R.string.care1,R.string.care2,R.string.care3,R.string.care4};
    private int[] array_image_cat= {R.drawable.cat1,R.drawable.cat2,R.drawable.cat3,R.drawable.cat4,R.drawable.cat5,R.drawable.cat6,R.drawable.cat7,R.drawable.cat8,R.drawable.cat9};
    private int[] array_image_food ={R.drawable.dry_food,R.drawable.wet_food,R.drawable.naturalnoe_food};
    private int[] array_image_disease ={R.drawable.disease1,R.drawable.disease2,R.drawable.disease3,R.drawable.disease4,R.drawable.disease5,R.drawable.disease6,R.drawable.disease7};
    private int[] array_image_care ={R.drawable.care1, R.drawable.care2,R.drawable.care3,R.drawable.care4};
    @Overrid
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_content);
        init();

        reciveIntent();
    }

            private void reciveIntent() {
            Intent i= getIntent();
            if(i != null)
            {
                category = i.getIntExtra("category",0);
                position = i.getIntExtra("position",0);

            }
            switch (category){
                case 0:
                    iContent.setImageResource(array_image_cat[position]);
                    text_content.setText(array_cat[position]);
                    break;
                case 1:
                    iContent.setImageResource(array_image_food[position]);
                    text_content.setText(array_food[position]);
                    break;
                case 2:
                    iContent.setImageResource(array_image_disease[position]);
                    text_content.setText(array_diseases[position]);
                    break;
                case 3:
                    iContent.setImageResource(array_image_care[position]);
                    text_content.setText(array_care[position]);
                    break;
            }
        }

        private void init() {
            text_content = findViewById(R.id.text_main_content);
            iContent = findViewById(R.id.imageContent);
            face1 = Typeface.createFromAsset(this.getAssets(), "fonts/Merriweather-Italic.ttf");
            text_content.setTypeface(face1);
        }







}
