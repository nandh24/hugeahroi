class eight{
    public static void main(String[] args){
        //8 
        String bub = "* ";
        String ayo = "     ";
        for(int i=0; i < 5; i++){
            System.out.print(ayo.substring(0, 5-i));
            System.out.println(bub);
            bub += "* ";
        }
        System.out.println();
        //8 bonus
        String buub = "*";
        String ayoo = "        ";
        for(int i=0; i < 8; i++){
            System.out.print(ayoo.substring(0, 8-i));
            System.out.println(buub);
            buub += "**";
        }
    }
}