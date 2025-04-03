import java.util.*;

public class Main {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // 문제풀이용 Scanner 클래스

        /* 챕터2_실전문제_2번 문제
        int birthday = scanner.nextInt();
        int year = birthday/10000;
        int month = (birthday - ( year * 10000 ))/100;
        int day = birthday - (( year * 10000 ) + ( month * 100));

        System.out.println(year+"년 "+month+"월 "+day+"일");
         */


        /* 챕터2_실전문제_8번
        System.out.println("연산 입력>>");
        double first = scanner.nextDouble();
        String op = scanner.next();
        double second = scanner.nextDouble();
        double result;

        switch(op){
            case "곱하기":
                result = first * second;
                System.out.println(first+" "+op+" "+second+"의 계산 결과는 "+result);
                break;

            case "나누기":
                result = first / second;
                System.out.println(first+" "+op+" "+second+"의 계산 결과는 "+result);
                break;

            case "더하기":
                result = first + second;
                System.out.println(first+" "+op+" "+second+"의 계산 결과는 "+result);
                break;

            case "빼기":
                result = first - second;
                System.out.println(first+" "+op+" "+second+"의 계산 결과는 "+result);
                break;

        }
         */

        /* 챕터2_실전문제_9번
        int first_x = 10;
        int first_y = 10;
        int second_x = 200;
        int second_y = 300;

        System.out.println("점 (x,y)의 좌표 입력>>");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if(( x < second_x )&( x > first_x )){
            if(( y < second_y )&( y > first_x )){
                System.out.println("("+x+","+y+")"+"는 사각형 안에 있습니다.");
            }

            if((y > second_y)||(y<first_y)){
                System.out.println("("+x+","+y+")"+"는 사각형 밖에 있습니다.");
            }
        }

        if((x==first_x)||(x==second_x)){
            if((y<=second_y)&(y>=first_y)){
                System.out.println("("+x+","+y+")"+"는 사각형 선 상에 있습니다.");
            }

            if((y>second_y)||(y<first_y)){
                System.out.println("("+x+","+y+")"+"는 사각형 밖에 있습니다.");
            }
        }
         */

        /* 챕터3_실전문제_

        */



        /* 쳅터4_오픈첼린지



        class Player{

            String name;
            String word;

        }
        int player_num;
        String word = "아버지";
        int lastIndex = word.length()-1;
        char lastChar = word.charAt(lastIndex);
        char firstChar = word.charAt(0);
        int iter = 0;

        System.out.println("끝말잇기 게임을 시작합니다...");
        System.out.print("게임에 참가하는 인원은 몇명입니까?>>");
        player_num = scanner.nextInt();
        Player[] players = new Player[player_num]; // 입력받은 플레이어 수에 맞춰 Player 클래스 객체 생성

        for(int i=0;i<player_num;i++){
            players[i] = new Player();
            System.out.print("참가자의 이름을 입력하세요>>");
            players[i].name = scanner.next();
        }

        System.out.println("시작하는 단어는 아버지입니다.");
        while(true){

            // 최대 인원 충족시 iter 변수를 초기화
            if(iter==player_num){
                iter = 0;
            }
            System.out.print(players[iter].name+">>");
            players[iter].word = scanner.next();
            int lastIndex_players = players[iter].word.length() - 1;
            char firstChar_players = players[iter].word.charAt(0);
            char lastChar_players = players[iter].word.charAt(lastIndex_players);
            if(lastChar==firstChar_players){
                iter++;
                lastChar = lastChar_players;
                continue;
            }
            else{
                System.out.println(players[iter].name+"이 졌습니다.");
                break;
            }

        }

         */

        /* 4장_실전문제_9번



         Random random = new Random();


         class Player{
             String name;
             int score_accum;
             int input;

             public Player(String name){
                 this.name = name;
                 this.score_accum = 0;
             }

         }

         System.out.println("*** 예측 게임을 시작합니다.");
         System.out.print("게임에 참여할 선수 수>>");
         int num_player = scanner.nextInt();
         Player[] player = new Player[num_player];

         for(int i=0;i<num_player;i++){
             System.out.print("선수 이름>>");
             String user_name = scanner.next();
             player[i] = new Player(user_name);
         }

         while(true) {
             System.out.println("1~100사이의 숫자가 결정되었습니다. 선수들은 맞추어 보세요.");
             int num = random.nextInt(100)+1;
             int best = 100;
             int best_scorer = 0;
             int best_one = 0;
             String good = "start";
             for(int s=0;s<player.length;s++){
                 System.out.print(player[s].name+">>");
                 int scan = scanner.nextInt();
                 player[s].input = scan;
             }

             for(int k=0;k<player.length;k++){
                 if(num>=player[k].input){
                     player[k].input = num - player[k].input;
                 }
                 else {
                     player[k].input = player[k].input - num;
                 }
             }

             for(int m = 0;m<player.length;m++){
                 if(best>player[m].input){
                     best = player[m].input;
                     good = player[m].name;
                     best_one = m;
                 }
             }

             player[best_one].score_accum++;
             System.out.println("정답은 "+num+". "+player[best_one].name+"이 이겼습니다. 승점 1점 확보!");
             System.out.print("계속하시려면 yes 입력>>");
             String yesOrNo = scanner.next();
             if(yesOrNo.equals("yes")){
                 continue;
             }
             else if(yesOrNo.equals("no")){
                 for(int q=0;q<player.length;q++){
                     System.out.print(player[q].name+":"+player[q].score_accum+" ");
                 }
                 for(int a=0;a<player.length;a++){
                     if(best_scorer<player[a].score_accum){
                         best_scorer = player[a].score_accum;
                     }
                 }
                 System.out.println(player[best_scorer].name+"가 최종 승리하였습니다.");
                 break;
             }

         }



         */

        /* 5장_실전문제

         */

        /* 6장_실전문제 업로드
        System.out.println("테스트중");
        String input = scanner.nextLine();
        char[] input_char = input.toCharArray();
        int input_length = input_char.length;

        for(int c = 0 ; c<input_length;c++){
            System.out.print(input_char[c]);
        }

        for(int a = 0;a<input_length;a++){

            for(int c= input_length;c>a;c--){
                System.out.print(input_char[input_length-c]);
            }

            for(int b = 0;b<a;b++){
                System.out.print(input_char[b]);
            }
            System.out.print("\n");
        }
         */

        /* 7장_실전문제 업로드

         */

        /* 4장_Velog 정리용 코드

        class staticMethod {

            static int m;
            int n;
            void f1( int x ){ // 정상
                n = x;
            }
            void f2( int x ){ // 정상
                m = x;
            }

            static void s1(int x){
                n = x; // 컴파일 오류 : static 메소드에 일반 맴버 변수 사용 불가
            }

            static void s2(int x){
                m = x; // 정상 : static 메소드는 static 필드 사용 가능
            }
        }



        final class FinalClass { // 해당 클래스는 상속 불가

        }

        class SubClass extends FinalClass{ // 컴파일 오류 발생

        }



        public class SuperClass {
            protected final int finalMethod(){
                System.out.println("final Method");
            }
        }

        class SubClass extends SuperClass{
            @Override // 컴파일 오류
            protected int finalMehtod(){

            }
        }




        public class FinalClass {
            final int ROWS = 10;
            void f(){
                int[] intArray = new int[ROWS];
                ROWS = 30; // 컴파일 오류
            }

        }


         */

    }
}