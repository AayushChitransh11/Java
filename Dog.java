public class Dog {
    private String dogType;
    private String dogName;
    private String dogColor;
    private int dogAge;

    public Dog(String dogType, String dogName, String dogColor, int dogAge){
        this.dogType=dogType;
        this.dogName=dogName;
        this.dogColor=dogColor;
        this.dogAge=dogAge;
    }

    public String getDog(){
        return "Dog type:"+dogType+"Dog name:"+dogName+"Dog Color:"+dogColor+"Dog age:"+dogAge;
    }
    public String getDogType(){
        return dogType;
    }
        
    public void setDog(String dogType, String dogName, String dogColor, int dogAge){
        this.dogType=dogType;
        this.dogAge=dogAge;
        this.dogName=dogName;
        this.dogColor=dogColor;
    }
    public String toString(String dogType, String dogName, String dogColor, int dogAge){
        return "Dog type:"+dogType+"Dog name:"+dogName+"Dog Color:"+dogColor+"Dog age:"+dogAge;
    
    }
   
    
}
