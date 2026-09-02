package br.com.mohanna.test.service;

import br.com.mohanna.test.database.model.User;
import br.com.mohanna.test.dto.UserDTO;
import br.com.mohanna.test.exception.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private static final List<User> users = new ArrayList<>();

    static {
        users.add(User.builder()
                .id(1)
                .name("Gustavo")
                .cpf("443.178.578-71")
                .email("gmohanna@gmail.com")
                .build());
        users.add(User.builder()
                .id(2)
                .name("Fernanda")
                .cpf("123.456.789-01")
                .email("fernanda@gmail.com")
                .build());
    }

    public List<User> findAll(){
        return new ArrayList<>(users);
    }

    public User findById(Integer id){
        return users.stream()
                .filter(u -> u.getId().equals(id))
                .findAny()
                .orElseThrow(() -> new NotFoundException("User not found"));
    }

    public User save(UserDTO userDTO){

        Integer identificador = users.stream()
                .mapToInt(User::getId)
                .max()
                .orElse(0) + 1;

        User user = User.builder()
                .id(identificador)
                .name(userDTO.getName())
                .cpf(userDTO.getCpf())
                .email(userDTO.getEmail())
                .build();

        users.add(user);
        return user;
    }

    public User update(Integer id, UserDTO userDto){

        User user = users.stream()
                .filter(u -> u.getId().equals(id))
                .findAny()
                .orElseThrow(() -> new NotFoundException("User not found"));

        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setCpf(userDto.getCpf());
        return user;
    }

    public void delete(Integer id){
        users.removeIf(u -> u.getId().equals(id));
    }
}
