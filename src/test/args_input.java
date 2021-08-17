class args_input{
    public static void main(String args[]){
        System.out.println("ㅁㅐ개변수 개수 : "+args.length);

        for(int i=0; i<args.length; i++){
            System.out.println("args["+i+"] : "+args[i]);
        }
    }
}
// yerimlee@iyelim-ui-MacBookPro test % java args_input.java test1 test2 
// ㅁㅐ개변수 개수 : 2
// args[0] : test1
// args[1] : test2
