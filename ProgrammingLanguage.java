package assignment06;

public class ProgrammingLanguage {

    private String languageName;

    public ProgrammingLanguage(String languageName) {
        if(languageName == null){
            this.languageName = "";
        }
        this.languageName = languageName;
    }

    public String forLayout(String... parts){
        return "no \"for\" construct";
    }
}
