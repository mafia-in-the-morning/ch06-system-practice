package Tv;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        int sys=1;
        while(sys==1){
        System.out.println("==========Tv운영 시스템==========");
        System.out.println("1. 전원켜기");
        System.out.println("2. 전원끄기");
        System.out.println("3. 볼륨 높히기");
        System.out.println("4. 볼륨 낮추기");
        System.out.println("5. 채널 높히기");
        System.out.println("6. 채널 낮추기");
        System.out.println("7. 넷플릭스 기능");

        int no = sc.nextInt();
        switch(no){
            case 1: user.On();break;
            case 2: user.Off();break;
            case 3: user.VolUp();break;
            case 4: user.VolDown();break;
            case 5: user.ChUP();break;
            case 6: user.ChDown();break;
            case 7: user.Netflix();break;
        }}
    }
}
