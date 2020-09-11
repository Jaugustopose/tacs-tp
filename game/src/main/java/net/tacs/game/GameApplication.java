package net.tacs.game;

import net.tacs.game.model.Match;
import net.tacs.game.model.Municipality;
import net.tacs.game.model.Province;
import net.tacs.game.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class GameApplication {

<<<<<<< HEAD
	private static List<Match> matches;
	private static List<Province> provinces;
	private static List<Municipality> municipalities;
	private static List<User> users;

=======
>>>>>>> e948dff49ed358d6fefba7b80274808399db8955
	public static void main(String[] args) {
		SpringApplication.run(GameApplication.class, args);
	}

	public static void addMatch(Match newMatch) {
		matches.add(newMatch);
	}

	public static void addProvince(Province province) {
		provinces.add(province);
	}

	public static void addMunicipality(Municipality newMunicipality) {
		municipalities.add(newMunicipality);
	}

	public static void addUser(User newUser) {
		users.add(newUser);
	}

	//Agregar los métodos para buscar/guardar en memoria que hagan falta (hasta que tengamos persistencia)

}
