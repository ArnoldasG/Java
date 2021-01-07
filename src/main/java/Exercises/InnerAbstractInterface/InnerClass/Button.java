package main.java.Exercises.InnerAbstractInterface.InnerClass;
        // Local class pavyzdys
public class Button {
    private String title;
    private OnClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(OnClickListener onClickListener){
        this.onClickListener = onClickListener;
    }
    public void onClick() {
        this.onClickListener.onClick(this.title);
    }

    // Susikuriam interface:
    public interface OnClickListener {
        public void onClick(String title);
    }
}
