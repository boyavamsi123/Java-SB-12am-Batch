class Employee1{
    private int empId;
    private String empName;
    public void setEmpName(String name){
        this.empName=name;
    }
    public String getEmpName(){
        return this.empName;
    }
    public static void main(String[] args) {
        Employee1 e1 = new  Employee1();
        e1.setEmpName("Rahul");

        System.out.println(e1.getEmpName());
    }
}