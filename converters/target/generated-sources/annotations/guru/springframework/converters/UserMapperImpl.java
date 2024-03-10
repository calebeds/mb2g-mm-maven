package guru.springframework.converters;

import guru.springframework.domain.UserCommand;
import guru.springframework.entities.User;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-10T14:42:33-0300",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 11.0.22 (Ubuntu)"
)
*/
public class UserMapperImpl implements UserMapper {

    @Override
    public UserCommand userToCommand(User user) {
        if ( user == null ) {
            return null;
        }

        UserCommand userCommand = new UserCommand();

        userCommand.setFirstName( user.getFirstName() );
        userCommand.setLastName( user.getLastName() );
        userCommand.setEmail( user.getEmail() );

        return userCommand;
    }

    @Override
    public User userCommmandToUser(UserCommand userCommand) {
        if ( userCommand == null ) {
            return null;
        }

        User user = new User();

        user.setFirstName( userCommand.getFirstName() );
        user.setLastName( userCommand.getLastName() );
        user.setEmail( userCommand.getEmail() );

        return user;
    }
}
