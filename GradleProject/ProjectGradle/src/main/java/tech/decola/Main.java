package tech.decola;

import org.mapstruct.factory.Mappers;
import tech.decola.dto.UserDTO;
import tech.decola.mapper.UserMapper;
import tech.decola.model.UserModel;

import java.time.LocalDate;

public class Main {

    private static final UserMapper mapper = Mappers.getMapper(UserMapper.class);

    public static void main(String[] args) {

        var model = new UserModel();
        model.setUsername("Vanessa");
        model.setCode(1);
        model.setBirthday(LocalDate.now().minusYears(46));
        System.out.println(mapper.toDTO(model));

        var dto = new UserDTO();
        dto.setName("Bete");
        dto.setId(2);
        dto.setBirthday(LocalDate.now().minusYears(65));
        System.out.println(mapper.toModel(dto));

    }

}