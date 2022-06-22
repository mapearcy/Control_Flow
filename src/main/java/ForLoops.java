public class ForLoops {
    public ForLoops(){

    }
    //public: is the access modifier
    //static: access type means it can accessed directly from the class
    //void means there is no returntype
    //method name
    //parameter type and parameter name
    public static void printAssociatesNames(String[] names){
        for (int i=0; i< names.length;i++){
            System.out.println(names[i]);
        }
    }
    public static int printTotalAssociatesNamesCount(String[] associatesArray){
        int counter = 0;
        //here we have an enhanced ForLoop
        for (String singleAssociate:associatesArray){
            //here we are adding the length of each name
            counter +=singleAssociate.length();
        }
        return counter;
    }

}
