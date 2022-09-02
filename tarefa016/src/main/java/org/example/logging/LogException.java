package org.example.logging;
import org.apache.log4j.Logger;
public class LogException {
    final static Logger logger = Logger.getLogger(LogException.class);
    public void divisao(int a,int b){
        try {
            System.out.println("A divisão é " + a/b);
        }catch (ArithmeticException e){
            logger.error(e.getMessage(),e);
        }
    }
    public static void main(String[] args) {
        LogException log = new LogException();
        log.divisao(3,4);
        log.divisao(1,0);

    }
}
