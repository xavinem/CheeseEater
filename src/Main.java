public class Main {
    public static void main(String[] args){
        char[][] room = new char [10][20];
		for(int i=0; i<room.length; i++) {
			for(int j=0; j<room[i].length; j++) {
				room[i][j]='.';
			}
		}
    }

    //public static void placeWalls(char[][] room, int numberOfWalls, Random randGen) {}
    //public static void placeCheeses(int[][] cheesePositions, char[][] room, Random randGen) {}
    //public static void printRoom(char[][] room, int[][] cheesePositions, int mouseX, int mouseY) {}
    //public static int[] moveMouse(int mouseX, int mouseY, char[][] room, char move) {}
    //public static boolean tryToEatCheese(int mouseX, int mouseY, int[][] cheesePositions) {}
}
