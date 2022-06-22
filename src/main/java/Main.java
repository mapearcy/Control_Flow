public class Main {
    public static void main(String [] args){
        ifElse ifelse = new ifElse();
        //String newString = "Hello World";
        //System.out.println(ifelse.printStringsOnly("Tiffany!"));
        //System.out.println(ifelse.printStringsOnly(newString));

        //ForLoop
        //here we are creating the string inside the param of the method
        //ForLoops.printAssociatesNames(new String[] {"JoJo", "CJ", "DeeAnne", "Shane"});
        //we can also declare the array first and then use in the method
        String[] arrayNames= {"Shaq", "Mark", "Shelby", "Shane"};
        //System.out.print(ForLoops.printTotalAssociatesNamesCount(arrayNames));

        //WhileLoops
        //WhileLoops.printFirst3Indexes(arrayNames);
        //DoWhile dowhile = new DoWhile();
        //dowhile.printValueIfTrue();

        SwitchStatements sS = new SwitchStatements();
        sS.gradeCalculator(120);
    }
}
