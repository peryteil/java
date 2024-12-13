package service;

import dto.TelBookDto;
import repository.TelBookRepository;

public class TelBookService {
    TelBookRepository telBookRepository = new TelBookRepository();

    public void saveTelbook(TelBookDto telBookDto) {
        telBookRepository.insert(telBookDto);

    }
}
