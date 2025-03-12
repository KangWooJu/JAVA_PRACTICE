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

        /*
        int n,m;
        int result;
        while(true) {
            try {
                System.out.print("곱하고자 하는 정수 2개 입력>>");
                n = scanner.nextInt();
                m = scanner.nextInt();
                result = n * m;
            } catch (InputMismatchException e) {
                System.out.print("정수를 입력하세요!");
            }
            System.out.println(n + "x" + "=" + n * m);
        }

         */
    }
}