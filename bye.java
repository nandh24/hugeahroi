class hi{
    public static void main(String[] args){
        int x = 2;
        for (int i=0; i < 4; i++){
            if(i == 0 || i % 3 == 0){
                for(int j=0; j<4; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                System.out.print("*");
                for(int k=0; k<x; k++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
        System.out.println();
        int y = 6;
        for (int i=0; i < 8; i++){
            if(i == 0 || i % 7 == 0){
                for(int j=0; j<8; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                System.out.print("*");
                for(int k=0; k<y; k++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}