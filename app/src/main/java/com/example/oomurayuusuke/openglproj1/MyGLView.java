package com.example.oomurayuusuke.openglproj1;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by oomurayuusuke on 2017/03/31.
 */

public class MyGLView extends GLSurfaceView{

    MyRenderer myRenderer;

    public MyGLView(Context context) {
        super(context);
        myRenderer = new MyRenderer();
        setRenderer(myRenderer);
    }

}
