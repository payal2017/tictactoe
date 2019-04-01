
package com.example.dell.mainproject;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class howtoplay extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_howtoplay);
        TextView t=(TextView)findViewById(R.id.Unique);
        //TextView f=(TextView)findViewById(R.id.scrollv) ;
            TextView tstrategy=(TextView)findViewById(R.id.txt_strtgy);
        //ScrollView scrollView=(ScrollView)findViewById(R.id.scroll);

        t.setText("\uF0D8\tTic-tac-toe (also known as noughts and crosses or Xs and Os) is a paper-and-pencil game for two players, X and O, who take turns marking the spaces in a 3×3 grid. The player who succeeds in placing three of their marks in a horizontal, vertical, or diagonal \n" +
                "row wins the game.\n" +
                "\n");
        tstrategy.setText("1.\tWin: If the player has two in a row, they can place a third to get three in a row.\n" +
                "2.\tBlock: If the opponent has two in a row, the player must play the third themselves to block the opponent.\n" +
                "3.\tFork: Create an opportunity where the player has two threats to win (two non-blocked lines of 2).\n" +
                "4.\tBlocking an opponent's fork:\n" +
                "•\tOption 1: The player should create two in a row to force the opponent into defending, as long as it doesn't result in them creating a fork. For example, if \"X\" has a corner, \"O\" has the center, and \"X\" has the opposite corner as well, \"O\" must not play a corner in order to win. (Playing a corner in this scenario creates a fork for \"X\" to win.)\n" +
                "•\tOption 2: If there is a configuration where the opponent can fork, the player should block that fork.\n" +
                "5.\tCenter: A player marks the center. (If it is the first move of the game, playing on a corner gives \"O\" more opportunities to make a mistake and may therefore be the better choice; however, it makes no difference between perfect players.)\n" +
                "6.\tOpposite corner: If the opponent is in the corner, the player plays the opposite corner.\n" +
                "7.\tEmpty corner: The player plays in a corner square.\n" +
                "8.\tEmpty side: The player plays in a middle square on any of the 4 sides.\n");

        t.getDisplay();
        tstrategy.getDisplay();
        t.setMovementMethod(new ScrollingMovementMethod());
        tstrategy.setMovementMethod(new ScrollingMovementMethod());


    }

}

