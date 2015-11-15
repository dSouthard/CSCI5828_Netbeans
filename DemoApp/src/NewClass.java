
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diana
 */
public class NewClass {
    private int variable1;
    private String variable2;
    private boolean variable3;
    private ArrayList<Double> variable4;

    public int getVariable1() {
        return variable1;
    }

    public void setVariable1(int variable1) {
        this.variable1 = variable1;
    }

    public String getVariable2() {
        return variable2;
    }

    public void setVariable2(String variable2) {
        this.variable2 = variable2;
    }

    public boolean isVariable3() {
        return variable3;
    }

    public void setVariable3(boolean variable3) {
        this.variable3 = variable3;
    }

    public ArrayList<Double> getVariable4() {
        return variable4;
    }

    public void setVariable4(ArrayList<Double> variable4) {
        this.variable4 = variable4;
    }
    
    public static void main() {
        NewClass newClass = new NewClass();
        newClass.setVariable1(1);
        newClass.setVariable2("New");
        System.out.println("This");
        System.out.println(newClass.getVariable2());
    }
}
