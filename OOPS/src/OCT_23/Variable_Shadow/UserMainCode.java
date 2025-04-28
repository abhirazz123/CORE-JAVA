package OCT_23.Variable_Shadow;

import java.io.*;
import java.util.*;

class UserMainCode {

    public int partyMode(int input1) {
        // Toggle 1st, 3rd, and 5th bits from the right (1-based indexing)
        return input1 ^ 21;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        UserMainCode obj = new UserMainCode();
        int result = obj.partyMode(input);

        System.out.println(result);
    }
}
