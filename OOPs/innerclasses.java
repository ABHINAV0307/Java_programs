class test{
    static String name;
    public test(String name){
        test.name=name;
public class innerclasses {
        test a=new test("abhi");
        System.out.println(a.name);
    }

}
