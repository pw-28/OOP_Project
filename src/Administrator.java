public class Administrator extends Person {
    private String jobTitle;

    public Administrator(String email, String password, String username, String jobTitle) {
        super(email, password, username);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {

        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {

        this.jobTitle = jobTitle;
    }


}
