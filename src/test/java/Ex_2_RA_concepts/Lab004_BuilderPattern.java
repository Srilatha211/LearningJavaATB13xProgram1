package Ex_2_RA_concepts;

public class Lab004_BuilderPattern {
//Here instead of returring void u return ur self
    //public void step1() {
public Lab004_BuilderPattern step1() {
        System.out.println("Step1");
        return this;
    }

    public Lab004_BuilderPattern step2() {
        System.out.println("Step2");
        return this;
    }

    public Lab004_BuilderPattern step3(String name) {
        System.out.println("Step3");
        return this;
    }

    public static void main(String[] args) {
        Lab004_BuilderPattern BP = new Lab004_BuilderPattern();
        BP.step1().step2().step3("sri");
        //Here this is the advantage of using the Buider Pattern
    }
}

