public class DecryptMsg {
    public void withoutShiftk(String msg){
        for (int i = 0;i<=25;i++){
            StringBuilder sb = new StringBuilder();
            for(char c : msg.toCharArray()){
                if(Character.isLetter(c)){
                    char base = Character.isLowerCase(c) ? 'a' : 'A';
                    char b = (char) ((c - base - i + 26) % 26 + base);
                    sb.append(b);
                } else{
                    sb.append(c);
                }
            }
            System.out.println(sb.toString());
        }
}
}
