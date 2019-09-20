public class Description {

    private String description;

    public Description() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String displaytxt(){
        String display= "\t\t"+getDescription();

        return  display;
    }
}
