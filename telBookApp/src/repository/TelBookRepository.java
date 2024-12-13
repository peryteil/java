package repository;

import dto.TelBookDto;
import myInterface.CrudInterface;

import java.util.List;

public class TelBookRepository implements CrudInterface {
    @Override
    public int insert(TelBookDto telBook) {//저장하기
        InitDate.telBookDtos.add(telBook);
        System.out.println(InitDate.telBookDtos);
        return 1;
    }

    @Override
    public int update(TelBookDto telBook) {//수정하기
        return 0;
    }

    @Override
    public int delete(int id) {//삭제하기
        return 0;
    }

    @Override
    public List<TelBookDto> getListAll() {//전체리스트가져오기
        return List.of();
    }

    @Override
    public TelBookDto getOne(String name) {//이름검색
        return null;
    }
}
