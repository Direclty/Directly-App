package com.directly.luckyboard.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.directly.luckyboard.R;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/29 14:04
 */

public class QqHealthView extends View {

    //数字颜色，字体颜色，运动步数，运动排名，运动平均步数，虚线下方的蓝色指示条的长度会随着平均步数改变而进行变化

    private Context mContext;

    private TypedArray a;

    /**
     * 背景宽度
     */
    private int widthBg;
    /**
     * 背景高度
     */
    private int heightBg;

    /**
     * 标题的颜色
     */
    private int titleColor = Color.BLACK;
    /**
     * 下划线的颜色
     */
    private int lineColor = Color.RED;

    /**
     * 背景hua bi
     */
    private Paint backgroundPaint;
    /**
     * 背景路径
     */
    private Path pathBg;

    private Paint arcPaint;
    private Paint textPaint;
    /**
     * 背景弧度
     */
    private int radiusBg;

    private RectF arcRect;
    /**
     * 圆弧的弧度值
     */
    private float arcNum = 100;
    private Paint linePaint;
    private Path linePath;
    private Paint rectPaint;
    private Path rectPath;
    private Paint weavPaint;
    private Path weavPath;

    public QqHealthView(Context context) {
        this(context, null);
    }

    public QqHealthView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public QqHealthView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr) {

        this.mContext = context;

        try {

            a = mContext.obtainStyledAttributes(attrs, R.styleable.QqHealthView, defStyleAttr, 0);
            titleColor = a.getColor(R.styleable.QqHealthView_titleColor, Color.BLACK);
            lineColor = a.getColor(R.styleable.QqHealthView_lineColor, Color.BLACK);

        } finally {
            a.recycle();
        }

        backgroundPaint = new Paint();

        arcPaint = new Paint();

        textPaint = new Paint();

        linePaint = new Paint();

        rectPaint = new Paint();

        weavPaint = new Paint();

        pathBg = new Path();

        linePath = new Path();

        rectPath = new Path();

        weavPath = new Path();

    }

    /**
     * 使wrap_content生效
     *
     * @param widthMeasureSpec
     * @param heightMeasureSpec
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        int widthMode = MeasureSpec.getMode(widthMeasureSpec);

        int widthSize = MeasureSpec.getSize(widthMeasureSpec);

        int heightMode = MeasureSpec.getMode(heightMeasureSpec);

        int heightSize = MeasureSpec.getSize(heightMeasureSpec);

        int width;

        int height;

        if (widthMode == MeasureSpec.EXACTLY) {
            width = widthSize;
        } else {
            width = widthSize / 2;
        }

        if (heightMode == MeasureSpec.EXACTLY) {
            height = heightSize;
        } else {
            height = heightSize * 3 / 4;
        }

        widthBg = width;

        heightBg = height;

        setMeasuredDimension(width, height);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        radiusBg = widthBg / 20;

        pathBg.moveTo(0, widthBg);

        pathBg.moveTo(0, heightBg);

        pathBg.lineTo(0, radiusBg);

        pathBg.quadTo(0, 0, radiusBg, 0);

        pathBg.lineTo(widthBg - radiusBg, 0);

        pathBg.quadTo(widthBg, 0, widthBg, radiusBg);

        pathBg.lineTo(widthBg, heightBg);

        pathBg.lineTo(0, heightBg);

        backgroundPaint.setColor(Color.BLACK);

        canvas.drawPath(pathBg, backgroundPaint);


        //绘制圆弧
        arcPaint.setStrokeWidth(widthBg / 20);
        //设置空心
        arcPaint.setStyle(Paint.Style.STROKE);
        //防抖动
        arcPaint.setDither(true);
        //连接处为圆弧
        arcPaint.setStrokeJoin(Paint.Join.ROUND);
        //画笔的笔触为圆角
        arcPaint.setStrokeCap(Paint.Cap.ROUND);
        arcPaint.setColor(Color.RED);
        //圆弧范围
        arcRect = new RectF(widthBg * 1 / 4, widthBg * 1 / 4, widthBg * 3 / 4, widthBg * 3 / 4);
        //绘制背景大圆弧
        canvas.drawArc(arcRect, 120, 300, false, arcPaint);
        arcPaint.setColor(Color.WHITE);
        //绘制分数小圆弧
        canvas.drawArc(arcRect, 120, arcNum, false, arcPaint);


        //绘制圆圈内的数字
        textPaint.setColor(Color.WHITE);
        textPaint.setTextSize(widthBg / 10);
        char[] walkNum = {10000};
        canvas.drawText(String.valueOf(walkNum), widthBg * 3 / 8, widthBg * 1 / 2 + 20, textPaint);
        //绘制名次
        textPaint.setTextSize(widthBg / 15);
        char[] rankNum = {6};
        canvas.drawText(String.valueOf(rankNum), widthBg * 1 / 2 - 15, widthBg * 3 / 4 + 10, textPaint);

        //绘制其他文字
        textPaint.setColor(Color.RED);
        textPaint.setTextSize(widthBg / 25);
        canvas.drawText("截止13:45已走", widthBg * 3 / 8 - 10, widthBg * 5 / 12 - 10, textPaint);
        canvas.drawText("好友平均2781步", widthBg * 3 / 8 - 10, widthBg * 2 / 3 - 20, textPaint);
        canvas.drawText("第", widthBg * 1 / 2 - 50, widthBg * 3 / 4 + 10, textPaint);
        canvas.drawText("名", widthBg * 1 / 2 + 30, widthBg * 3 / 4 + 10, textPaint);

        //绘制圆圈外的文字
        canvas.drawText("最近7天", widthBg * 1 / 15, widthBg, textPaint);
        char[] averageSize = {100};
        String myaverageTxt = String.valueOf(averageSize);
        canvas.drawText("平均", widthBg * 10 / 15 - 15, widthBg, textPaint);
        canvas.drawText(myaverageTxt, widthBg * 11 / 15, widthBg, textPaint);
        canvas.drawText("步/天", widthBg * 12 / 15 + 20, widthBg, textPaint);


        //绘制虚线
        linePaint.setStyle(Paint.Style.STROKE);
        linePaint.setStrokeWidth(2);
        linePaint.setColor(lineColor);
        linePath.moveTo(widthBg * 1 / 15, widthBg + 80);
        linePath.lineTo(widthBg * 14 / 15, widthBg + 80);
        linePaint.setPathEffect(new DashPathEffect(new float[]{5, 5}, 1));
        canvas.drawPath(linePath, linePaint);

        int rectSize = widthBg / 12;
        int rectAgHeight = widthBg / 10;
        //绘制虚线上的圆角竖线
//        for (int i = 0; i < 7; i++) {
//            rectPaint.setStrokeWidth(widthBg / 25);
//            rectPaint.setStyle(Paint.Style.STROKE);
//            rectPaint.setStrokeJoin(Paint.Join.ROUND);
//            rectPaint.setStrokeCap(Paint.Cap.ROUND);
//            float startHeight = widthBg + 90 + rectAgHeight;
//            rectPath.moveTo(rectSize, startHeight);
//            double percentage = Double.valueOf(FourActivity.sizes.get(i)) / Double.valueOf(averageSize);
//            double height = percentage * rectAgHeight;
//            rectPath.lineTo(rectSize, (float) (startHeight - height));
//            rectPaint.setColor(Color.WHITE);
//            canvas.drawPath(rectPath, rectPaint);
//            //绘制下方的文字
//            textPaint.setColor(lineColor);
//            canvas.drawText("0" + (i + 1) + "日", rectSize - 25, startHeight + 50, textPaint);
//            rectSize += widthBg / 7;
//        }


        //绘制底部波纹
        weavPaint.setColor(Color.RED);
        weavPath.reset();
        weavPath.moveTo(0, heightBg);
        weavPath.lineTo(0, heightBg * 10 / 12);


        /**
         *weavX,weavX
         */

        weavPath.cubicTo(50, 40, widthBg * 3 / 10, heightBg * 11 / 12, widthBg, heightBg * 10 / 12);


        weavPath.lineTo(widthBg, heightBg);
        weavPath.lineTo(0, heightBg);
        canvas.drawPath(weavPath, weavPaint);

        //绘制底部文字
        weavPaint.setColor(Color.WHITE);
        weavPaint.setTextSize(widthBg / 20);
        canvas.drawText("成绩不错,继续努力哟!", widthBg * 1 / 10 - 20, heightBg * 11 / 12 + 50, weavPaint);
    }
}
