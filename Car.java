class Car {
    String brandName;
    String model;
    int price;
  
    // public void setDetail(String brandName, String model, int price){
    // by using constructor 
    public Car (){
      this.brandName= brandName;
      this.model= model;
      this.price= price;
    }
    public String getDetail(){
        return this.brandName+this.model+this.price;
    }
}
