package assignment06;

public class Ada extends ProgrammingLanguage {

    public Ada(){
        super("Ada");
    }

    @Override
    public String forLayout(String... parts){
        if (parts!=null&&parts.length==1){
            return "for x in " + parts[0] + " loop \n\n\n\nend loop;";
        }else{
            throw new IllegalArgumentException("bad arguments");
        }
    }
}
