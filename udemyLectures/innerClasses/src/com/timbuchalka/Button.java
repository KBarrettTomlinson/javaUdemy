package com.timbuchalka;

/**
 * Created by dev on 4/10/2015.
 */
public class Button {
    private String title;
    private OnClickListener onClickLister;

    // constructor
    public Button(String title) {
        this.title = title;
    }

    //getter
    public String getTitle() {
        return title;
    }

    //method
    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickLister = onClickListener;
    }

    //method
    public void onClick() {
        this.onClickLister.onClick(this.title);
    }

    //???
    public interface OnClickListener {
        public void onClick(String title);
    }

}
