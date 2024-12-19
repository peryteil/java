package repository;

import db.DBConn;
import dto.TelBookDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PhoneBookRepository implements RepositoryInterface {

    int result = 0; // 쿼리실행 결과를 담을 변수(성공 : 양수, 실패 : 0)
    Connection dbConn = DBConn.getConnection();
    PreparedStatement psmt = null;
    String sql;


    @Override
    public int insertData(TelBookDTO dto) {
        System.out.println("[PhoneBookRepository]-insertData");
        return 0;
    }

    @Override
    public int updateData(TelBookDTO dto) {
        System.out.println("[PhoneBookRepository]-updateData");
        return 0;
    }

    @Override
    public int deleteData(Long id) {
        System.out.println("[PhoneBookRepository]-deleteData");
        return 0;
    }

    @Override
    public List<TelBookDTO> getAllList() {
        System.out.println("[PhoneBookRepository]-getAllList");
        List<TelBookDTO> dtoList = new ArrayList<>();
        ResultSet rs = null;

        try {
            sql = "SELECT * FROM phone_book ORDER BY id ASC";
            psmt = dbConn.prepareStatement(sql);
            // 쿼리 실행할 결과 -> ResultSet
            rs = psmt.executeQuery();
            // ResultSet의 내용을 하나씩 읽어서 dtoList 에 담는다.
            while (rs.next()) {
                // ResultSet에 있는 레코드를 하나씩 읽어서 담을 DTO
                TelBookDTO dto = new TelBookDTO();
                // 레코드를 하나씩 읽어서 DTO에 담는 작업
                dto.setId(rs.getLong("id"));
                dto.setName(rs.getString("name"));
                dto.setAge(rs.getInt("age"));
                dto.setPhone(rs.getString("phone"));
                dto.setAddress(rs.getString("address"));
                dto.setCreatedAt(rs.getTimestamp("created_at")
                        .toLocalDateTime());
                if (rs.getTimestamp("updated_at") != null) {
                    dto.setUpdateAt(rs.getTimestamp("updated_at")
                            .toLocalDateTime());
                }

                // 담은 DTO를 리스트에 담는다.

                dtoList.add(dto);
            }
            // ResultSet 담기
            rs.close();
            // PreparedStatement 담기
            psmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
       // System.out.println(dtoList);
        return dtoList;
    }

    @Override
    public TelBookDTO findById(Long id) {
        System.out.println("[PhoneBookRepository]-findById");
        return null;
    }

    @Override
    public List<TelBookDTO> findByName(String name) {
        System.out.println("[PhoneBookRepository]-findByName");
        return List.of();
    }

    @Override
    public List<TelBookDTO> findByPhone(String phone) {
        System.out.println("[PhoneBookRepository]-findByPhone");
        return List.of();
    }
}
