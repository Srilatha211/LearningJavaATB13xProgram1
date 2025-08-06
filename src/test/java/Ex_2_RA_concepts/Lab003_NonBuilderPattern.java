package Ex_2_RA_concepts;

public class Lab003_NonBuilderPattern {
    public static void main(String[] args) {
//No design pattern
        Lab003_NonBuilderPattern NBP = new Lab003_NonBuilderPattern();
        NBP.step1();
        NBP.step2();
        NBP.step3("sri");
        //Here this is not a builder pattern
        //Evene we can do randomly but also not a builder pattern
        NBP.step2();
        NBP.step1();
        NBP.step3("sri");


    }
        public void step1(){
            System.out.println("Step1");
    }
    public void step2(){
        System.out.println("Step2");
    }
    public void step3(String name){
        System.out.println("Step3");
    }
}
