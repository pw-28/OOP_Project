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

    //An Administrator must be able to decline an Order by
    //setting the declined flag, the Administrator that declined
    //the order is saved in the Order
}
