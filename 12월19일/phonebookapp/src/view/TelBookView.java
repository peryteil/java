package view;

import dto.TelBookDTO;
import service.PhoneBookService;

import java.util.List;

public class TelBookView implements ViewInterface{
    PhoneBookService bookService = new PhoneBookService();


    @Override
    public void insertView() {
        System.out.println("[TelBookView]-insertView");
    }

    @Override
    public void updateView() {
        System.out.println("[TelBookView]-updateView");
    }

    @Override
    public void deleteView() {
        System.out.println("[TelBookView]-deleteView");
    }

    @Override
    public void searchAllView() {
        System.out.println("[TelBookView]-searchAllView");
        List<TelBookDTO> dtoList = bookService.getAllListService();
        // 출력해 보기
        linePrint();
        printTitle();
        linePrint();
        for (TelBookDTO dto : dtoList) {
            System.out.println(dto);
        }
        linePrint();
        //System.out.println(dtoList);
    }

    public void printTitle() {
        System.out.println("ID \t 이름 \t 나이 \t 주소 \t \t 전화번호 \t \t \t 입력 \t \t 수정");
    }

    public void linePrint() {
        System.out.println("==================================================================================");
    }

    @Override
    public void searchNameView() {
        System.out.println("[TelBookView]-searchNameView");
    }

    @Override
    public void searchPhoneView() {
        System.out.println("[TelBookView]-searchPhoneView");
    }
}
