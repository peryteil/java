package view;

import dto.TelBookDto;
import repository.InitDate;
import service.TelBookService;

import java.util.Scanner;

public class TelBookView {
    TelBookService telBookService = new TelBookService();
    Scanner scanner = new Scanner(System.in);
    public void inputView() {
        System.out.println("❤ 데이터를 입력하는 화면입니다.");

        System.out.println("이름 :");
        String name = scanner.next();
        System.out.println("나이 :");
        int age = scanner.nextInt();
        System.out.println("주소 :");
        String adress = scanner.next();
        System.out.println("전화번호 :");
        String phone = scanner.next();

        TelBookDto telBookDto = new TelBookDto(InitDate.id, name, age, adress, phone);
        telBookService.saveTelbook(telBookDto);

    }
    public void viewAllList() {
        List<TelBookDto> telBookDtoList = new InitDate<>();
        printHeader();
        // 출력
        // 1. 서비스에 전체 리스트 요청
        productList = adminService.getAllList();
        // 2. 상품리스트가 비어있을 경우
        if (productList.size() == 0) {
            System.out.println("현재 자판기에 상품이 없습니다.");
        } else {
            // 3. 받은 리스트를 출력
            for (Product x : productList) {
                System.out.println(x);
            }
        }
        printLine();
    }
    }
}
