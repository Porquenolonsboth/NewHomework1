import java.util.Random;

class SlotMachine {
        private int[] row1 = new int[3];
        private int[] row2 = new int[3];
        private int[] row3 = new int[3];

        SlotMachine(){
            playMachine();
        }

        void playMachine(){

            Random slotValue = new Random();

            for (int counter = 0; counter < 3; counter++) {
                row1[counter] = slotValue.nextInt(10);
            }

            for (int counter = 0; counter < 3; counter++) {
                row2[counter] = slotValue.nextInt(10);
            }

            for (int counter = 0; counter < 3; counter++) {
                row3[counter] = slotValue.nextInt(10);
            }
        }

        boolean isWinner() {

            if (row1[0] == row1[1]) {
                if (row1[0] == row1[2]) {
                    return true;
                }
            }

            if (row2[0] == row2[1]) {
                if (row2[0] == row2[2]) {
                    return true;
                }
            }

            if (row3[0] == row3[1]) {
                if (row3[0] == row3[2]) {
                    return true;
                }
            }

            return false;
        }


    }


