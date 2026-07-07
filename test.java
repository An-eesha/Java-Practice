public class test {
    public static void main(String [] args){
        Car c = new Car("BYD", "Atto ", 1000);    //by using constructor
        String carDetail =c.getDetail();
        System.out.println(carDetail);

        // Car c1 = new Car("BYD", "Atto ", 1000);    //by using constructor
        // String carDetail =c1.getDetail();
        // System.out.println(c1Detail);
        
        // Car c2 = new Car("BYD", "Atto ", 1000);    //by using constructor
        // String carDetail =c2.getDetail();
        // System.out.println(c2Detail);
        
        // c.setDetail("BYD", "Atto", 40000); // without constructor
        // String carDetail=c.getDetail();
        //  System.out.println(c.getDetail());
    }
}