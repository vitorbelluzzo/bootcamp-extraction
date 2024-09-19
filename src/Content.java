public abstract class Content {
    protected static final double standardXP = 10d;
    private String title;
    private String description;


    public abstract double calcXP();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return title;
    }

    public void setName(String name) {
        this.title = name;
    }
}
