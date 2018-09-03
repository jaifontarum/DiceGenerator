package day29dice;

import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DiceController {
	
	
	@RequestMapping("/randomNumber")
	public List<Dice> dice(){
//		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		DBConnectionFactory myFactory = DBConnectionFactory.getInstance();
//		Connection conn = myFactory.getConnection();
//		PreparedStatement ps =null;
//		String query ="";
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
		
//	try {
//		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//			query ="insert into random_number (dice1, dice2, dice3, timestamp) values(?,?,?,?)";
//			ps= conn.prepareStatement(query);
//			
//			ps.setInt(1, randomDice.get(0).getDice1());
//			ps.setInt(2, randomDice.get(0).getDice2());
//			ps.setInt(3, randomDice.get(0).getDice3());
//		
//			ps.setString(4, sdf.format(timestamp));
//			
//			
//			ps.executeUpdate();
//
//		} catch (SQLException e){
//			e.printStackTrace();
//		}

	return randomDice;
	}
}

