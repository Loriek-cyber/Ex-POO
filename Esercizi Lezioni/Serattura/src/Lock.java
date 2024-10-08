import javax.lang.model.type.NullType;

public class Lock {
    private String code="000";
    private boolean locked = false;
    public String userCode ="";

    private String secret = "A daniele puzzano i piedi";

    public Lock(String code) {
        this.code = code;
        locked = true;
    }

    public boolean isLocked(){
        return locked;
    }

    public boolean unlock(){
        if(userCode.equals(code)){
            locked = false;
            return true;
        }
        else
            return false;
    }

    public void setPosition(char s){
        if(userCode.isEmpty()){
            userCode = String.valueOf(s);
        }
        else
            userCode += String.valueOf(s);
    }

    public String getSecret(){
        if(isLocked())
            return "Non sono cazzi tua";
        else
            return secret;
    }
}
