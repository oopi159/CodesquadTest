package step2;

import java.util.Scanner;

public class CubeMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cube cube = new Cube();
        String input;

        cube.print();
        while (true) {
            System.out.print("CUBE> ");
            input = scan.nextLine();
            System.out.println();
            if (!validInput(input)) {
                continue;
            } else if (isClose(input)) {
                break;
            }
            cube.execute(input);
        }

        scan.close();
    }

    private static boolean isClose(String actionInput) {
        if(actionInput.equals("Q")) {
            System.out.println("GoodBye~~~");
            return true;
        }
        return false;
    }

    private static boolean validInput(String actionList) {
        try {
            if (actionList.contains(" ") || actionList.length() == 0) {
                throw new IllegalStateException();
            }
        } catch (IllegalStateException e) {
            System.out.println("값을 다시 입력해주세요.\n");
            return false;
        }
        return true;
    }
}
