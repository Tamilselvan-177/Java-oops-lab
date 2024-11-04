class week42{
    private String name;
    private int rollNo;
    public week42(){
        System.out.println("No-arg constructor is invoked");
        this.name = null;
        this.rollNo=0;
    }
    public week42(String name){
        System.out.println("1 arg constructor is invoked");
        this.name = name;
        this.rollNo=0;
    }
    public week42(String name,int rollNo){
        System.out.println("2 arg constructor is invoked");
        this.name = name;
        this.rollNo = rollNo;
    }
    public void display(){
        System.out.println("Name ="+name+" , Roll no = "+rollNo);
    }
    public static void main(String[] args){
        week42 student1 = new week42();
        week42 student2 = new week42("Rajalakshmi");
        week42 student3 = new week42("Lakshmi",101);
        student1.display();
        student2.display();
        student3.display();
    }
}