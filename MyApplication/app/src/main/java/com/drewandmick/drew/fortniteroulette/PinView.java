package com.drewandmick.drew.fortniteroulette;

import android.content.Context;
import android.graphics.*;
import android.util.AttributeSet;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.drewandmick.drew.fortniteroulette.R.drawable;


public class PinView extends SubsamplingScaleImageView {

    private final Paint paint = new Paint();
    private final PointF vPin = new PointF(80,80);
    private PointF[] sPin0 = {new PointF(532,213),new PointF(399,186),new PointF(196,133),new PointF(408,280),new PointF(308,290),
            new PointF(271,334),new PointF(196,338),new PointF(450,334),new PointF(386,377),new PointF(531,375),
            new PointF(500,458),new PointF(376,492),new PointF(348,539),new PointF(255,482),new PointF(238,494),
            new PointF(106,446),new PointF(128,557),new PointF(233,624),new PointF(283,684),new PointF(348,631),
            new PointF(477,603),new PointF(513,718),new PointF(354,745),new PointF(446,828),new PointF(372,881),
            new PointF(554,916),new PointF(586,809),new PointF(575,602),new PointF(871,749),new PointF(749,742),
            new PointF(716,664),new PointF(876,583),new PointF(772,544),new PointF(755,526),new PointF(648,394),
            new PointF(715,425),new PointF(665,327),new PointF(879,408),new PointF(826,357),new PointF(766,312),
            new PointF(882,212),new PointF(814,225),new PointF(732,221)};
    private Bitmap pin;

    public PinView(Context context) {
        this(context, null);
    }

    public PinView(Context context, AttributeSet attr) {
        super(context, attr);
        initialise();
    }

    public void setPin(PointF sPin) {
        this.sPin0[0] = sPin;
        initialise();
        invalidate();
    }

    private void initialise() {
        float density = getResources().getDisplayMetrics().densityDpi;
        pin = BitmapFactory.decodeResource(this.getResources(), drawable.pin);
        float w = (density/1500f) * pin.getWidth();
        float h = (density/1500f) * pin.getHeight();
        pin = Bitmap.createScaledBitmap(pin, (int)w, (int)h, true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // Don't draw pin before image is ready so it doesn't move around during setup.
        if (!isReady()) {
            return;
        }

        paint.setAntiAlias(true);


        if (sPin0 != null && pin != null) {
            for (int i=0;i<43;i++) {
                sourceToViewCoord(sPin0[i], vPin);
                float vX = vPin.x - (pin.getWidth() / 2);
                float vY = vPin.y - pin.getHeight();
                canvas.drawBitmap(pin, vX, vY, paint);
            }

        }

    }

}