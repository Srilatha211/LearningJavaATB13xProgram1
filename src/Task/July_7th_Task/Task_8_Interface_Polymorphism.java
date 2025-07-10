package Task.July_7th_Task;

public class Task_8_Interface_Polymorphism {
    public static void main(String[] args) {

        // This is  Playable Reference
        Playable instrument;

        // Assigning Guitar object and call play()
        instrument = new Guitar();
        instrument.Play();

        // Assigning Piano object and call play()
        instrument = new Piano();
        instrument.Play();

    }
}
interface Playable{
    void Play();
}

class Guitar implements Playable{
    @Override
    public void Play() {
        System.out.println("Playing Guitar!");
    }
}

class Piano implements Playable{
    @Override
    public void Play() {
        System.out.println("Playing Piano!");
    }
}