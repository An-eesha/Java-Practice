public class test {
    public static void main(String [] args){
        Car c = new Car("BYD", "Atto ", 1000);    //by using constructor

        // c.setDetail("BYD", "Atto", 40000); // without constructor
        // String carDetail=c.getDetail();
    
        System.out.println(c.getDetail());
    }
}