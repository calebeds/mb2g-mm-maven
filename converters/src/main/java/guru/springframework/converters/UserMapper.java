package guru.springframework.converters;


import guru.springframework.domain.UserCommand;
import guru.springframework.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserCommand userToCommand(User user);
    User userCommmandToUser(UserCommand userCommand);
}
