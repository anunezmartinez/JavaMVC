package JavaMVC.model;

public class Model {
    
    public Model() {
        vArticle = "";
        vType = "";
        vName = "";
        vCountry = "";
    }

    private String vArticle;
    private String vType;
    private String vName;
    private String vCountry;

    public String getvArticle() {
        return vArticle;
    }

    public void setvArticle(String vArticle) {
        this.vArticle = vArticle;
    }

    public String getvType() {
        return vType;
    }

    public void setvType(String vType) {
        this.vType = vType;
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

    public String getvCountry() {
        return vCountry;
    }

    public void setvCountry(String vCountry) {
        this.vCountry = vCountry;
    }

    


}