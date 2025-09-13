
public class EncryptMsg {
    
    public String encryptTheMsg(String msg,int shiftk){
        int actualk = shiftk % 26;

        StringBuilder sb = new StringBuilder();

        for (char c : msg.toCharArray()){
            if ( Character.isLetter(c) ){
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                char shifted = (char) ((c - base + shiftk )  % 26 + base);
                sb.append(shifted);
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
