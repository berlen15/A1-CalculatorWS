
package client;

public class Client {

    public static void main(String[] args) {
        int n1=5;
        int n2= 4;
        System.out.println("La suma entre " + n1 + " y " + n2+ " da como resultado: " +sum(n1,n2));
    }

    private static int sum(int n1, int n2) {
        pack.Calc_Service service = new pack.Calc_Service();
        pack.Calc port = service.getCalcPort();
        return port.sum(n1, n2);
    }
    
}
