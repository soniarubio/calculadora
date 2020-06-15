package JavaApplication4;

/**
 *
 * @author redes
 * @since 14/12/2020
 * @version 2.0
 * @see JavaApplication4
 */
public class JavaApplication4 {
    private int num1;
    private int num2;
    
    /**
     *
     * @param a
     * @param b
     */
    public JavaApplication4(int a, int b){
        num1=a;
        num2=b;
    }
    
    /**
     *
     * @return
     * 
     */
    public int suma(){
        int result=num1+num2;
        return result;
    }
    
    /**
     *
     * @return
     */
    public int resta(){
        int result;
        if (resta2())   result = num1-num2;
        else            result = num2-num1;
        return result;
    }
        
    /**
     *
     * @return
     * @deprecated 
     */
    public boolean resta2(){
        if (num1 > num2)    return true;
        else                return false;
    }
    
    /**
     *
     * @return
     */
    public int multiplica(){
        int result=num1*num2;
        return result;
    }
    
    /**
     *
     * @return
     */
    public int divide(){
        int result=num1/num2;
        return result;
    }
    
    /**
     *
     * @return
     */
    public Integer divide2(){
        if(num2==0) return null;
        int result=num1/num2;
        return result;
    }

    /**
     *
     * @return
     * @exception java.lang.ArithmeticException si es menor que 0
     * @throws java.lang.ArithmeticException si es mayor que 0
     */
    public int divide0(){
        if(num2==0) 
            throw new java.lang.ArithmeticException("División por 0");
        else{
            int result=num1/num2;
            return result;
        }
    }
     
    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String[] args) {
        // TODO code application logic here
        JavaApplication4 calcu = new JavaApplication4(20, 10);
        System.out.println(calcu.suma());
    }
    */
}
