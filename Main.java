public class Main {
    public static void main(String[] args) {
        String[][] map = new String[64][64];
        for (int x = 0; x < map.length; x++){
            for (int y = 0; y < map[0].length; y++){
                map[x][y] = "#";
            }
        }
        Map mainMap = new Map(map);
    }
}