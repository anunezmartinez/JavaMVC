package JavaMVC.model;

public class ExecuteQuery {

    public String filterDB(String section, String country){
        test="";

        if(section.equals("All") && !country.equals("All")){
            test="Country selected";
        }else if(!section.equals("All") && country.equals("All")){
            test="Section selected"; 
        }else{  
            test="Both selected";
        };

        return test;
    }




    private String test;
}