package racingcar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RacingCar {

    public static void main(String[] args) throws IOException {
        System.out.println("시도할 회수는 몇회인가요?");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());

    }
}
