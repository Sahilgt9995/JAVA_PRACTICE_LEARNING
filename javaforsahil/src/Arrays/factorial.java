package Arrays;

class factorial{
    public static void main(String args[]){
        int i;
        int num=1;
        int number=5;
        for(i=1;i<=number;i++){
            num=num*i;
        }
        System.out.println("Factorial of "+number+" is: "+num);
    }
}
