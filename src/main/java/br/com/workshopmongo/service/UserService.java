package br.com.workshopmongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.workshopmongo.domain.User;
import br.com.workshopmongo.domain.dto.UserDto;
import br.com.workshopmongo.repository.UserRepository;
import br.com.workshopmongo.service.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findById(String id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));

	}

	public User insert(User obj) {

		return userRepository.insert(obj);

	}

	public User fromDTO(UserDto objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}

	public void delete(String id) {
		findById(id);
		userRepository.deleteById(id);
	}

}
