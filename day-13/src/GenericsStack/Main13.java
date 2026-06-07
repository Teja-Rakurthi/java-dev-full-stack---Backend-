package src.GenericsStack;
public class Main13{
    public static void main(String[] args){
        GenericStack<Integer> intStack= new GenericStack<>(5);
        intStack.push(5);
        intStack.push(10);
        System.out.println(intStack.pop());

        GenericStack<String> strstack= new GenericStack<>(5);
        strstack.push("teja");
        strstack.push("chintu");
        System.out.println(strstack.peek());

        GenericStack<Student> stustack = new GenericStack<>(5);
        stustack.push(new Student("bangaram"));
        System.out.println(stustack.pop());
        System.out.println(stustack.isEmpty());

    }
}