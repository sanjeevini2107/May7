public class Employee {
    String name;
    int id;
    double salary;
    public Employee(String name,int id ,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void diaplayInfo(){
        System.out.println("Employee ID:"+id);
        System.out.println("E,ployee Name"+name);
        System.out.println("E,ployee Name"+name);

        
    }
    public static void main(String[] args) {
        Employee emp1= new Employee("XYZ",101,50000.0);
        emp1.diaplayInfo();
    }
}
    

