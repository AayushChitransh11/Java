class Data{
    private Integer age;
    private String name;
    private InternalData revenue;
    Data(int age,String name, int revenue){
            this.age=age;
            this.name=name;
            this.revenue=new InternalData(revenue);

    }
    public void setRevenue(InternalData revenue){
        this.revenue=revenue;
    }
    InternalData getRevenue(){
        return revenue;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }

    Integer getAge(){
        return age;
    }

    String getName(){
        return name;
    }

}

class InternalData{
    public Integer revenue;
    InternalData(Integer revenue){
        this.revenue=revenue;
    }
}

public class Collection {
    public static void main(String[] args) {
        Data obj=new Data(11,"aayush",1000000);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        obj.setAge(100);
        System.out.println(obj.getAge());
        obj.setName("Chitransh");
        System.out.println(obj.getName());

        System.out.println(obj.getRevenue());
       
        System.out.println(obj.getName());
    }
}
