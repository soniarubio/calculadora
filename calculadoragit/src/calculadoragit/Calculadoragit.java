package calculadoragit;

public class Calculadoragit{

    private int num1;
    private int num2;
    
public Calculadoragit(int a,int b) {
    num1=a;
    num2=b;
}
public int suma() {
    int result=num1+num2;
    return result;
}
public int resta() {
    int result= num1-num2;
    return result;
}
public int multiplica(){
          int result= num1*num2;
          return result;        
        }
public int divide() {
    int result= num1/num2;
    return result;
}

    public static void main(String[] args) {
        
    }
    
}

