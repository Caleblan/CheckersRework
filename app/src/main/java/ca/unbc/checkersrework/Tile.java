package ca.unbc.checkersrework;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Tile extends View implements View.OnTouchListener {
    private Rect square;
    private Paint paint;
    //private Piece piece = null;
    private ImageButton button;

    public Tile(Context context, Rect square, Paint paint) {
        super(context);
        this.square = square;
        this.paint = paint;
    }



    @Override
    public void onDraw(Canvas canvas)
    {
        //canvas.drawRect();
        canvas.drawRect(square, paint);
        //this.setBackgroundColor(Color.GREEN);
    }

//    public Rect getSquare() {
//        //return square;
//    }

//    public Piece getPiece()
//    {
//        return piece;
//    }

//    public Paint getPaint() { return paint; }

    /**
     * Sets color member variable. Although it is already set in constructor,
     * this method is useful to be able to show the possible moves a piece can
     * take by altering matrix entry colors.
     *
     *
     */
    public void setPaint(int color)
    {
        paint.setColor(color);
    }


    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        Toast.makeText(view.getContext(), "Touched layout", Toast.LENGTH_SHORT).show();
        return true;
    }
}

