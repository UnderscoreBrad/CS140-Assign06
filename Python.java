package assignment06;

public class Python extends ProgrammingLanguage{

    public Python(){
        super("Python");
    }

    @Override
    public String forLayout(String... parts){
        if(parts!=null&&parts.length==1){
            return "for x in " + parts[0];
        }else{
            throw new IllegalArgumentException("bad arguments");
        }
    }
}
