public class StringPermutation {

    public void permute(String str1, String str2){
        if(str1.isEmpty()){
            System.out.println(str2);
            return;
        }

        for(int i=0; i< str1.length(); i++){
            Character c = str1.charAt(i);
            String partStr = str1.substring(0,i) + str1.substring(i+1);
            permute(partStr, str2+c);
          }
    }

    public static void main(String[] args) {
        StringPermutation s = new StringPermutation();
        String str = "abc";
        s.permute(str, "");
    }
}
