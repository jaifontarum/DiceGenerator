package day29dice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DiceController {
	
	@RequestMapping("/randomNumber")
	public List<Dice> dice(){
		List <Dice> randomDice = new ArrayList<Dice>();
		
	
		Random random = new Random();
		Dice dice = new Dice();
		
		int n1 = dice.getDice1();
		int n2 = dice.getDice2();
		int n3 = dice.getDice3();
		
		n1= random.nextInt(6)+1;
		n2= random.nextInt(6)+1;
		n3= random.nextInt(6)+1;
		
		dice.setDice1(n1);
		dice.setDice2(n2);
		dice.setDice3(n3);

		randomDice.add(dice);
		return randomDice;
	}
}
