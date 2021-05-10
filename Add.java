public class Add {
    public static void main(String[] args) {
        int hab=0;

        for(int i=0; i<args.length;i++){
            try{
                hab +=Integer.parseInt(args[i]);
            }
            catch (NumberFormatException j){
                continue;
            }
        }
        System.out.println(hab);
    }
}
