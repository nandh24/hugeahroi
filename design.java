class design{
    public static void main(String[] args){
        String hi = "";
        for(int i=1; i<9; i++){
            hi += "*";
            System.out.println(hi);
        }
        hi = "";
        System.out.println();
        for(int i=1; i<9; i++){
            for(int j=10-i; j > 0; j--){
                System.out.print(" ");
            }
            hi += "*";
            System.out.println(hi);
        }
        
    }

}