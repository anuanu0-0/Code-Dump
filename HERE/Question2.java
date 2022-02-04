package HERE;

class ExceptionImplementation {
    public String checkForException (double number1, double number2, char opr) {

        try {
            if(number1 > 1000 || number2 > 1000) {
                throw new NumberIsLargerException("Number is greater than 1000");
            } else if(number1 < 0 || number2 < 0) {
                throw new NumberIsNegativeException("Number is negative");
            } else if(opr!='+' && opr!='-' && opr!='*') {
                throw new Exception(opr + " is not a valid operator");
            }
        } catch (Exception e) {
           return e.getMessage();
        }

        return "No Exception Found";
    }

    public double evaluate(double val1, double val2, char opr) {
        String errorCode = checkForException(val1, val2, opr);
        System.out.println(errorCode);

        double result = 0.0;
        if(errorCode.equals("No Exception Found")) {
            switch (opr) {
                case '+':
                    result = val1 + val2;
                    break;
                case '-':
                    result = val1 - val2;
                    break;
                case '*':
                    result = val1 * val2;
                    break;
                default:
                    result = 0.0;
            }
        }
        return result;
    }
}

class NumberIsLargerException extends Exception {
    public NumberIsLargerException(String s) {
        super(s);
    }
}

class NumberIsNegativeException extends Exception {
    public NumberIsNegativeException(String s) {
        super(s);
    }
}

public class Source2 {
    public static void main(String[] args) throws Exception{
        ExceptionImplementation exe = new ExceptionImplementation();
        System.out.println(exe.evaluate(-10, 12000, '/'));
    }
}
