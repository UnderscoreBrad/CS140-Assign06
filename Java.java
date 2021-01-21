package assignment06;

public class Java extends ProgrammingLanguage{

    public Java (){
        super("Java");
    }

    @Override
    public String forLayout(String... parts){
        if(parts!=null){
            if(parts.length==1){
                return "for(var x : " + parts[0] + ")\n{\n\n\n}";
            }else if(parts.length==3){
                return "for(" + parts[0] + "; " + parts[1] + "; " + parts[2] + ")\n{\n\n\n}";
            }
        }
        throw new IllegalArgumentException("bad arguments");
    }
}
