public class Jobs {
    private String company;
    private String title;
    private String startdate;
    private String enddate;
    private String description;

    public Jobs() {
    }

    public Jobs(String company, String title, String startdate, String enddate, String description) {
        this.company = company;
        this.title = title;
        this.startdate = startdate;
        this.enddate = enddate;
        this.description = description;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String displayJob(){
        String jobIn= "Company: "+getCompany()+"\n\tTitle: "+getTitle()+"\n\tStarting working date: "
                +getStartdate()+"\n\tEnd working date: "+getEnddate()+"\n\t\tDiscription:";

        return  jobIn;
    }
}
