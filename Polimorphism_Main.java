class Animal{
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public String speak(){
        return getName() + " konusuyor...";
    }
}

class Cat extends Animal{

    public Cat(String name){
        super(name);
    }

    public String speak(){
        return this.getName() +" miyavlıyor...";
    }
}


class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    public String speak(){
        return this.getName() + " havlıyor...";
    }
}


class Horse extends Animal{
    public Horse(String name){
        super(name);
    }

    public String speak(){
        return getName() + " kişniyor...";
    }
}


class Bird extends Animal{
    public Bird(String name){
        super(name);
    }

    public String speak(){
        return getName() + " ötüyor...";
    }
}

public class Polimorphism_Main {

    public static void Make_It_Talk(Object object){
        if(object instanceof Dog){
            Dog kopek = (Dog) object;
            System.out.println(kopek.speak());
        }else if(object instanceof Cat){
            Cat kedi =(Cat) object;
            System.out.println(kedi.speak());
        }else if (object instanceof Horse){
            Horse at =(Horse) object;
            System.out.println(at.speak());
        }else if (object instanceof Animal){
            Animal hayvan = (Animal) object;
            System.out.println(hayvan.speak());
        }else if(object instanceof Bird){
            Bird kus = (Bird) object;
            System.out.println(kus.speak());
        }
    }
    public static void main(String[] args) {
        /* Birinci gösterim(Uzun Hali)
        Animal hayvan1 = new Animal("Limon");
        Animal hayvan2 = new Cat("Tekir");
        Animal hayvan3 = new Dog("Karabaş");
        Animal hayvan4 = new Horse("Gece");

        System.out.println(hayvan1.speak());
        System.out.println(hayvan2.speak());
        System.out.println(hayvan3.speak());
        System.out.println(hayvan4.speak()); */

        /* İkinci Gösterim(Yukarıdaki gösterimin kısa hali)
        Make_It_Talk(new Cat("Tekir"));
        Make_It_Talk(new Dog("Karabaş"));
        Make_It_Talk(new Horse("Şahbatur")); */

       /* instanceof Yapısı :
       Dog kopek = new Dog("Karabaş");
        if(kopek instanceof Animal){    //instanceof yapısını bir nesnenin hangi class'a ait olduğunu sorgulamak için kullanırız.
            System.out.println("Bu nesne Animal sınıfına aittir."); 
        } */

        Dog kopek = new Dog("Karabaş");
        Cat kedi = new Cat("Tekir");
        Horse at = new Horse("Şahbatur");
        Animal hayvan = new Animal("Limon");
        Bird kus = new Bird("Maviş");

        Make_It_Talk(kopek);
        Make_It_Talk(kedi);
        Make_It_Talk(at);
        Make_It_Talk(hayvan);
        Make_It_Talk(kus);

    }
}
