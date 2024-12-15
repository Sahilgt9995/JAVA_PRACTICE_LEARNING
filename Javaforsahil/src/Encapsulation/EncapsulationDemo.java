package Encapsulation;

class Encapsulation {
    private int rating;
    private String coder;
    private int age;

    public int getRating(){
        return rating;
    }

    public String getCoder(){
        return coder;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int newValue){
        age = newValue;

    }
    public void setCoder(String  newValue){
        coder = newValue;

    }
    public void setRating(int newValue){
        rating = newValue;

    }


}

class EncaosulationDeo{
    public static void main(String[] args){

        Encapsulation encap = new Encapsulation();
        encap.setCoder("Prasad");
        encap.setAge(22);
        encap.setRating(1600);

        System.out.println("coder" + encap.getCoder());
        System.out.println("Age" + encap.getAge());
        System.out.println("Rating" + encap.getRating());

    }
}