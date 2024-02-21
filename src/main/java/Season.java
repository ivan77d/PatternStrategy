public class Season {
    Activity activity;

    void setActivity(Activity activity){
        this.activity = activity;
    }

    void execute(){
        activity.activity();
    }
}
