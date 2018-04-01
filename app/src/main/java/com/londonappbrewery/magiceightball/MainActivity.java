package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
//Create a variable of type ImageView with the name ballDisplay
    ImageView ballDisplay;
    Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //link the ballDisplay with the ball image from layout file
        ballDisplay = (ImageView) findViewById(R.id.image_eightBall);
        //Create a variable called ballArray
        //Set ballArray to contain the references to the 5 images in the drawable folder
        final int [] ballArray = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3,
                R.drawable.ball4, R.drawable.ball5};
        //Link the askButton in the layout to the Java code
        myButton = (Button) findViewById(R.id.askButton);
        //Set a Listener on myButton
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator = new Random();
                // Make the random number generator spit out a new random number
                int number = randomNumberGenerator.nextInt(4);
                // grab a random 8 ball image from the ballArray.
                // Then tell the ImageView to display
                // this image
                ballDisplay.setImageResource(ballArray[number]);
            }
        });



    }
}
