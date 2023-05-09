package Tv;

public class Tv {
    static boolean OnOff;
    static int ch;
    static int vol;
    static boolean Netflix;

    public static void Off() {
        if(OnOff==false){
            System.out.println("이미 껴져있는 상태입니다.");
        } else if (OnOff==true) {
            System.out.println("전원이 꺼집니다.");
            OnOff=false;
        }
    }

    public static void On() {
        if(OnOff==true){
            System.out.println("이미 켜져있는 상태입니다.");
        } else if (OnOff==false) {
            System.out.println("전원이 켜집니다.");
            OnOff=true;
        }
    }

    public static void VolUP() {
        if(OnOff==true&&vol<=30){
            vol++;
            System.out.println("볼륨이 증가합니다..현재 볼륨:"+vol);
        }else if(OnOff==false||vol>30){
            System.out.println("tv가 꺼져있거나 볼륨을 더이상 높힐 수 없습니다.");
        }
    }

    public static void VolDown() {
        if(OnOff==true&&vol>=0) {
            vol--;
            System.out.println("볼륨이 감소합니다..현재 볼륨:" + vol);
        }else if(OnOff==false||vol<0){
            System.out.println("tv가 꺼져있거나 볼륨을 더이상 낮출 수 없습니다.");
        }
    }

    public static void ChUp() {
        if(OnOff==true&&ch<=200){
            ch++;
            System.out.println("채널이 증가합니다..현재 채널:"+ch);
        }else if(OnOff==false||ch>200){
            System.out.println("tv가 꺼져있거나 채널을 더이상 높힐 수 없습니다.");
        }
    }

    public static void ChDown() {
        if(OnOff==true&&ch>=0) {
            ch--;
            System.out.println("채널이 감소합니다..현재 채널:" + vol);
        }else if(OnOff==false||ch<0){
            System.out.println("tv가 꺼져있거나 채널을 더이상 낮출 수 없습니다.");
        }
    }

    public static void Netflix() {
        if(OnOff==true&&Netflix==false){
            System.out.println("넷플릭스가 실행됩니다.");
            Netflix=true;
        }else if(OnOff==true&&Netflix==true)
        {
            System.out.println("넷플릭스가 종료됩니다.");
            Netflix=false;
        }

    }
}
