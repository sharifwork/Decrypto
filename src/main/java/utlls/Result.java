package utlls;

public class Result {
    private boolean isSuccessful;
    private String massage;

    public Result(boolean isSuccessful, String massage) {
        this.isSuccessful = isSuccessful;
        this.massage = massage;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }

    public String getMassage() {
        return massage;
    }
}
