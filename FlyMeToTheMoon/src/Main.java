public class Main {

    public static void main(String[] args) {
        Simulation s=new Simulation();
        System.out.println(s.runSimulation(s.loadU1(s.loadItems("Phase-1.txt"))));
//        s.loadU2(s.loadItems("Phase-2.txt"));
    }
}
