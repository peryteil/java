package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        //<> : Generic(제네릭)
        List<Integer> intData = new ArrayList<>();
        List<String> strData = new ArrayList<>();
        // 리스트 생성 시 초기값 부여하는 방법
        List<Integer> init = new ArrayList<>(Arrays.asList(1, 2, 3));
//        System.out.println(init);
        for (Integer i : init) {
            System.out.println(i);
        }
        // CRUD(Create, Read, Update, Delete)
        //Create : 데이터 입력
        strData.add("김형민");
        strData.add("장원영");
        strData.add("로제");
        System.out.println(strData);
        // 갯수 확인
        System.out.println(strData.size());
        // 인덱스로 값 찾기
        System.out.println(strData.get(1));
        // 로제 출력
        // 1. 로제의 인덱스 값 찾기
        int index = strData.indexOf("로제");
        System.out.println(index);
        System.out.println(strData.get(2));
        // 삭제하기
        strData.remove("김형민");
        System.out.println(strData);
        // 데이터의 수정
        // 김형민 추가
        strData.add("김형민");
        System.out.println(strData);
        // 김형민을 홍길동으로 수정
        //1. 김형민의 위치 찾기
        //2. 해당 인덱스를 찾으며 값 수정하기
        index = strData.indexOf("김형민");
        strData.set(index, "홍길동");
        System.out.println(strData);
    }
}
