package com.developer.gavinejoyce.icubeofficial;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.FloatMath;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import static com.developer.gavinejoyce.icubeofficial.R.id.start;

/**
 * Created by Gavine Joyce on 04/02/2017.
 */

public class ImageV extends ImageView {

    // These matrices will be used to move and zoom image
    Matrix matrix = new Matrix();
    Matrix savedMatrix = new Matrix();
    String TAG="ImageV";

    // We can be in one of these 3 states
    static final int NONE = 0;
    static final int DRAG = 1;
    static final int ZOOM = 2;
    int mode = NONE;

    // Remember some things for zooming
    PointF start = new PointF();
    PointF mid = new PointF();
    float oldDist = 1f;
    String savedItemClicked;
    public ImageV(Context context) {
        super(context);
    }


}
