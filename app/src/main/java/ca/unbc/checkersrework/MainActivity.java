package ca.unbc.checkersrework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.Console;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int boardSize = 8;
        GridView grid = (GridView) findViewById(R.id.Grid);

        Tile[] board = new Tile[64];
//
        int width = Resources.getSystem().getDisplayMetrics().widthPixels;
//
        int[] color = {Color.RED, Color.BLACK};


        Paint paint = new Paint();

        //Determines / Sets paint value of block
        if((1+1) % 2 == 0)
        {
            paint.setColor(color[(1+1) % 2]);
        }
        else {
            paint.setColor(color[(1+1) % 2]);
        }

        grid.addView( new Tile(this.getBaseContext(),new Rect(0, 0,
                1 * width / boardSize,1* width / boardSize), paint));
      grid.addView ( new Tile(this.getBaseContext(),new Rect(1 * width / boardSize, 1 * width / boardSize,
                2 * width / boardSize,2* width / boardSize), paint));

        //GridAdapter adapter = new GridAdapter(getApplicationContext(), board);
        //grid.setAdapter(adapter);






//
//        Log.println(1,"ASSERT", "  ");

//        if(findViewById(R.id.GridLayout) != null)
          //TextView view = (TextView) findViewById(R.id.textView);
        //LinearLayout grid = (LinearLayout) findViewById(R.id.Yes);

//        grid.setColumnCount(8);
//        grid.setColumnCount(8);

//        TextView text = new TextView(this.getBaseContext());
//        text.setText("Text1");
//        TextView text2 = new TextView(this.getBaseContext());
//        TextView text3 = new TextView(this.getBaseContext());
//        text2.setText("Text2");
//        text3.setText("Text3");
//
//        grid.addView(text);
//        grid.addView(text2);
//        grid.addView(text3);

        //grid.

        //grid.setAlignmentMode(1);



//        TextView text = new TextView(this);
//        text.setText("BLah");
//        grid.addView(text);
//
//        grid.addView(new Tile(this.getBaseContext(),new Rect(1 * width / boardSize, 1 * width / boardSize,
//                2 * width / boardSize,2* width / boardSize), paint), 1);

        //grid.invalidate();


//        for(int i = 0; i < boardSize; i++)
//        {

//        int i=0;
//            //Creates board columns.
//            for(int j = 0; j < boardSize; j++)
//            {
//                Paint paint = new Paint();
//
//                //Determines / Sets paint value of block
//                if((i+j) % 2 == 0)
//                {
//                    paint.setColor(color[(i+j) % 2]);
//                }
//                else {
//                    paint.setColor(color[(i+j) % 2]);
//                }
//
//                GridLayout.Spec row = GridLayout.spec(i);
//                GridLayout.Spec col = GridLayout.spec(j);
//                GridLayout.LayoutParams first = new GridLayout.LayoutParams(row, col);
//                grid.setOrientation(GridLayout.HORIZONTAL);
//
//                grid.addView(new Tile(this.getBaseContext(),new Rect(j * width / boardSize, i * width / boardSize,
//                        (j+1) * width / boardSize,(i+1)* width / boardSize), paint), j+i);
//                TextView text = (TextView) findViewById(R.id.textView);
//                text.setText("" + i);
//
//                //board[i][j].invalidate();
//            }
//        }

    }

    public class CustomAdpater extends BaseAdapter
    {

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }
    }
}