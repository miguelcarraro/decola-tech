package tech.decola.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import tech.decola.dto.UserDTO;
import tech.decola.model.UserModel;

@Mapper
public interface UserMapper {

    @Mapping(target = "code", source = "id")
    @Mapping(target = "username", source = "name")
    UserModel toModel(final UserDTO dto);

    @Mapping(target = "id", source = "code")
    @Mapping(target = "name", source = "username")
    UserDTO toDTO(final UserModel model);
}
