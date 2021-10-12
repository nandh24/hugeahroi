class desiie{
    public static void main(String[] args){
        for(int i=0; i < 5; i++){
            for(int j=0; j<5-i; j++){
                System.out.print(" ");
            }  
            System.out.print("*");  
            for(int k=0; k<(2*i)-1; k++){
                System.out.print(" ");
            }
            if(i != 0){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i < 4; i++){
            for(int j=0; j<(i+2); j++){
                System.out.print(" ");
            }  
            System.out.print("*");  
            for(int k=0; k<(2*(4-i))-3; k++){
                System.out.print(" ");
            }
            if(i != 3){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}