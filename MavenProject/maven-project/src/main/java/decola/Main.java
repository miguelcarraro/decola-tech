package decola;

import decola.dto.UserDTO;
import decola.mapper.UserMapper;
import decola.model.UserModel;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;

public class Main {

    private final static UserMapper mapper = Mappers.getMapper(UserMapper.class);

    public static void main(String[] args) {
        var model = new UserModel();
        model.setCode(1);
        model.setUserName("Kev");
        model.setBirthday(LocalDate.now().minusYears(22));

        var dto = new UserDTO();
        dto.setId(2);
        dto.setName("Miguel");
        dto.setBirthday(LocalDate.now().minusYears(26));

        System.out.println(mapper.toModel(dto));
        System.out.println(mapper.toDTO(model));

    }

}
