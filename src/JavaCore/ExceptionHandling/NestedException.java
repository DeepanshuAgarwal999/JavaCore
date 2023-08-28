package JavaCore.ExceptionHandling;

public class NestedException {

    public static void main(String[] args) {
        try{
            test();
        }
        catch(Exception e){
            System.out.println("Error Handled");
        }
        finally {
            System.out.println("Code executed successfully");
        }
    }
    public static void test() throws ArrayIndexOutOfBoundsException{ // shows that given method can raise exception
        try{
            throw new ArrayIndexOutOfBoundsException();
        }
        catch(Exception e){
            System.out.println("Error-Index is not valid:"+e);
        }
    }
}
