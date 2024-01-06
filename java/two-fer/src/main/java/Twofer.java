public class Twofer {
    public String twofer(String name) {
        String res="";
        if(name==null){
            res="One for you, one for me.";
        }else{
            res = "One for "+name+", one for me.";
        }
        return res;
    }
}
