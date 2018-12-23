public class Play1000SlotMachines {
    public static void main(String[] args) {

        SlotMachine slotMachine = new SlotMachine();
        int count = 0;

        for (int i = 0; i < 1000; i++) {
            slotMachine.playMachine();
            if (slotMachine.isWinner())
                count++;
        }
        System.out.println("From 1000 slot machines, " + count + " were winners.");
    }
}