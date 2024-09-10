class Inheritance {

    public String B="BMW";
    public void modelName(){
        System.out.println("GT506");

    }
}
    class NewClass extends Inheritance
    { 
        String B1="Verna";
        public void modelName1()
        {
            System.out.println("duwbfueb");
        }
        public static void main(String[] args) {
            NewClass obj=new NewClass();
            System.out.println("Parrent Class Brand name and model name"+obj.B);
            obj.modelName();
            System.out.println("Sub Class Brand name and model name"+obj.B1);
            obj.modelName1();

        }

    }




