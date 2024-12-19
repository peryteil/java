package service;

import dto.TelBookDTO;
import repository.PhoneBookRepository;

import java.util.List;

public class PhoneBookService implements ServiceInterface {

    PhoneBookRepository bookRepository = new PhoneBookRepository();

    @Override
    public int insertService(TelBookDTO dto) {
        System.out.println("[PhoneBookService]-insertData");
        return 0;
    }

    @Override
    public int updateService(TelBookDTO dto) {
        System.out.println("[PhoneBookService]-updateService");
        return 0;
    }

    @Override
    public int deleteService(Long id) {
        System.out.println("[PhoneBookService]-deleteService");
        return 0;
    }

    @Override
    public List<TelBookDTO> getAllListService() {
        System.out.println("[PhoneBookService]-getAllListService");
        return bookRepository.getAllList();
    }

    @Override
    public TelBookDTO findByIdService(Long id) {
        System.out.println("[PhoneBookService]-findByIdService");
        return null;
    }

    @Override
    public List<TelBookDTO> findByNameService(String name) {
        System.out.println("[PhoneBookService]-findByNameService");
        return List.of();
    }

    @Override
    public List<TelBookDTO> findByPhoneService(String phone) {
        System.out.println("[PhoneBookService]-findByPhoneService");
        return List.of();
    }
}
