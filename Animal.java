 class Animal
 {
    public void sounds()
    {
        System.out.println("All animal sound");
    }
}
class pig extends Animal
{
    public void sounds()
    {
        System.out.println("pig - pig");
    }
}

class Dog extends Animal
{
    public void sounds()
    {
        System.out.println("bow bow");
    }
}
class Cat extends Animal
{
    public void sounds()
    {
        System.out.println("maow maow");
    }
}
class Main
{
public static void main(String[] args) {
    Animal obj =new Animal();
    Animal p=new pig();
    Animal d =new Dog();
    Animal c= new Cat();
    obj.sounds();
    p.sounds();
    d.sounds();
    c.sounds();
}
}
