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
    }
}