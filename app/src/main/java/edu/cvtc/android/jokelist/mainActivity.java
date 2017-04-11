package edu.cvtc.android.jokelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class mainActivity extends AppCompatActivity {

    

    /**
     * This is the EditText used to enter text for a new Joke to be added to jokeList.
     */
    private EditText jokeEditText;

    /**
     * This is the button for creating and adding  new Joke to jokeLIst using text entered in
     * jokeEditText.
     */
    private Button addJokeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        setContentView(R.layout.activity_main);
        initLayout();
    }

    /**
     * Method used to encapsulate the code for initializing and setting the layout for this Activity
     */
    private void initLayout() {
        final LinearLayout container = new LinearLayout(this);
        container.setOrientation(LinearLayout.VERTICAL);

        final LinearLayout addJokeLayout = new LinearLayout(this);
        addJokeLayout.setOrientation(LinearLayout.HORIZONTAL);



        setContentView(container);
    }

}
