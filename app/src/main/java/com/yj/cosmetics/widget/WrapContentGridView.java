package com.yj.cosmetics.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * Created by Suo on 2017/4/17.
 */

public class WrapContentGridView extends GridView {
        public WrapContentGridView(Context context) {
            super(context);
        }


        public WrapContentGridView(Context context, AttributeSet attrs) {
            super(context, attrs);
        }


        public WrapContentGridView(Context context, AttributeSet attrs, int defStyle) {
            super(context, attrs, defStyle);
        }


        @Override
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            int heightSpec;

            int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                    MeasureSpec.AT_MOST);
            super.onMeasure(widthMeasureSpec, expandSpec);


           /* if (getLayoutParams().height == LayoutParams.WRAP_CONTENT) {
                // The great Android "hackatlon", the love, the magic.
                // The two leftmost bits in the height measure spec have
                // a special meaning, hence we can't use them to describe height.
                heightSpec = MeasureSpec.makeMeasureSpec(
                        Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
            }
            else {
                // Any other height should be respected as is.
                heightSpec = heightMeasureSpec;
            }


            super.onMeasure(widthMeasureSpec, heightSpec);
        }*/
        }
}
