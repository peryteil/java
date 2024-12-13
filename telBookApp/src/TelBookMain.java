import dto.TelBookDto;
import view.TelBookView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TelBookMain {

    public static void main(String[] args) {
        TelBookView view = new TelBookView();
        TelBookView update = new TelBookView();
        Scanner scanner = new Scanner(System.in);
        int number=0;
        while (true) {
            System.out.println("1.입력 2.수정 3.삭제 4.전체출력 5.아이디검색 6.종료");
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    view.inputView();
                    break;
                case 2:
                    view.updateMenu();
                    break;
                case 3:
                    System.out.println("삭제처리장소");
                    break;
                case 4:
                    System.out.println("전체출력");
                    break;
                case 5:
                    System.out.println("아이디검색");
                    break;
                case 6: // 완료
                    System.out.println("종료합니다.");
                    return;
                default:
                    System.out.println("잘 못입력하셨습니다.");
            }
        }
    }
}
