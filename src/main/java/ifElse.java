public class ifElse {
    public ifElse(){
    }
    public boolean checkStringLength(String input){
        if (input.length()>7){
            return true;
        }else{
            return false;
        }
    }
    public String printStringsOnly(String input){
        //index 0 is the first thing in any collection
        char firstLetter=input.charAt(0);


        if (String.valueOf(firstLetter).toLowerCase().equals("t")){
            return input + " begins with the letter 't' ";
        }else {
            return "Did this word begin with the letter 't'? : " + input;
        }


    }
}
