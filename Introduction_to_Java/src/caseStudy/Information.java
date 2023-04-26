package caseStudy;

public class Information {
    private String title;
    private InformationDetail[] informationDetails;

    public Information(String title, InformationDetail[] informationDetails) {
        this.title = title;
        this.informationDetails = informationDetails;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public InformationDetail[] getInformationDetails() {
        return informationDetails;
    }

    public void setInformationDetails(InformationDetail[] informationDetails) {
        this.informationDetails = informationDetails;
    }
}
