package com.example.clouds;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.util.Log;
import android.view.View;

class DrawOnTop extends View { 

    public DrawOnTop(Context context) { 
            super(context); 
            // TODO Auto-generated constructor stub 
    } 

    @Override 
    protected void onDraw(Canvas canvas) { 
            // TODO Auto-generated method stub 
            super.onDraw(canvas); 
            
    } 

} 
class Marker extends View { 
	String mesaj; 
	double roll;
    public Marker(Context context) { 
            super(context); 
            // TODO Auto-generated constructor stub 
    } 
    
    public void updateMarker(double roll){
    	this.roll = roll;
    }
    public Marker(Context context,String mesaj,float roll) { 
        super(context); 
        this.mesaj = mesaj;
        this.roll = roll;
        // TODO Auto-generated constructor stub 
    } 
    
        
    @Override  
    protected void onDraw(Canvas canvas) { 
            // TODO Auto-generated method stub 
    		
            Paint paint = new Paint(); 
            paint.setStyle(Paint.Style.FILL); 
            paint.setColor(Color.RED); 
            paint.setTextAlign(Align.CENTER);
            paint.setTextSize(30);
            Log.d("RollHere",Double.toString(roll));
            //canvas.drawText(Double.toString(roll)+ "\n",this.getWidth()/2,this.getHeight()/2, paint);
            if((-130 >= roll && roll >=-180) ||( roll >= 130 && roll <= 180) ){
            	canvas.drawText("Acesta este un mesaj",this.getWidth()/2, this.getHeight()/2, paint);
                super.onDraw(canvas);
            }
    }
            

}

class MarkerViews extends View { 
	
	double  azimuth;
	double  srclat,srclng;
	double aux;	
    public MarkerViews(Context context) { 
            super(context); 
            // TODO Auto-generated constructor stub 
    } 
    public void updateMarker(){
    }
    
    @Override  
    protected void onDraw(Canvas canvas) { 
            // TODO Auto-generated method stub 

    	
            super.onDraw(canvas); 
    } 


}

