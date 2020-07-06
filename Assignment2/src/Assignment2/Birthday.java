package Assignment2;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JOptionPane;
public class Birthday {


	public static void main(String[] args) {
		String name;
		String inputString; //reading age input
		int age;
		String toyOption;
		Toy gift = new Toy();
		String card;
		String balloon;
		String cancelRequest;
		double firstGift;
		String anotherGift;
		int orderNum;
		//dollar format
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		
		JOptionPane.showMessageDialog(null, "Welcome to the Toy Company to choose gifts for young children");

		
		name = JOptionPane.showInputDialog("Enter the name of the child");
		inputString = JOptionPane.showInputDialog("How old is the child?");
		//convert input to int
		age = Integer.parseInt(inputString);
		gift.setAge(age);
		toyOption = JOptionPane.showInputDialog("Choose a toy: plushie, blocks, or a book");
		gift.setToy(toyOption);
		gift.setCost(toyOption);
		if (!gift.ageOK()) {
			JOptionPane.showMessageDialog(null, "Toy is not age appropriate");
			cancelRequest = JOptionPane.showInputDialog("Cancel toy request? Yes or No");
			if (cancelRequest.equals("Yes") || cancelRequest.equals("yes") ) {
				name = JOptionPane.showInputDialog("Enter the name of the child");
				inputString = JOptionPane.showInputDialog("How old is the child?");
				age = Integer.parseInt(inputString);
				gift.setAge(age);
				toyOption = JOptionPane.showInputDialog("Choose a toy: plushie, blocks, or a book");
				gift.setToy(toyOption);
				gift.setCost(toyOption);
			} else {
				gift.setToy(toyOption);
				gift.setCost(toyOption);
				card = JOptionPane.showInputDialog("Do you want a card with the gift? Yes or No");
				gift.addCard(card);
				balloon = JOptionPane.showInputDialog("Do you want a balloon with the gift? Yes or No");
				gift.addBalloon(balloon);
			}
			
		} else {
			card = JOptionPane.showInputDialog("Do you want a card with the gift? Yes or No");
			gift.addCard(card);
			balloon = JOptionPane.showInputDialog("Do you want a balloon with the gift? Yes or No");
			gift.addBalloon(balloon);
		}
		
		firstGift = gift.getCost();
		System.out.println("The gift for " + name + gift.toString());
		
		anotherGift = JOptionPane.showInputDialog("Do you want another toy? Yes or No");
		
		// if user wants another gift
		if (anotherGift.equals("Yes") || anotherGift.equals("yes")) {
			name = JOptionPane.showInputDialog("Enter the name of the child");
			inputString = JOptionPane.showInputDialog("How old is the child?");
			//convert input to int
			age = Integer.parseInt(inputString);
			gift.setAge(age);
			toyOption = JOptionPane.showInputDialog("Choose a toy: plushie, blocks, or a book");
			gift.setToy(toyOption);
			gift.setCost(toyOption);
			if (!gift.ageOK()) {
				JOptionPane.showMessageDialog(null, "Toy is not age appropriate");
				cancelRequest = JOptionPane.showInputDialog("Cancel toy request? Yes or No");
				if (cancelRequest.equals("Yes") || cancelRequest.equals("yes") ) {
					name = JOptionPane.showInputDialog("Enter the name of the child");
					inputString = JOptionPane.showInputDialog("How old is the child?");
					age = Integer.parseInt(inputString);
					gift.setAge(age);
					toyOption = JOptionPane.showInputDialog("Choose a toy: plushie, blocks, or a book");
					gift.setToy(toyOption);
					gift.setCost(toyOption);
				} else {
					gift.setToy(toyOption);
					gift.setCost(toyOption);
					card = JOptionPane.showInputDialog("Do you want a card with the gift? Yes or No");
					gift.addCard(card);
					balloon = JOptionPane.showInputDialog("Do you want a balloon with the gift? Yes or No");
					gift.addBalloon(balloon);
				}
				
			} else {
				card = JOptionPane.showInputDialog("Do you want a card with the gift? Yes or No");
				gift.addCard(card);
				balloon = JOptionPane.showInputDialog("Do you want a balloon with the gift? Yes or No");
				gift.addBalloon(balloon);
			}
			
			System.out.println("The gift for " + name + gift.toString());
			//random order number
			orderNum = 10000 + new Random().nextInt(90000);
			System.out.println("The total cost of your order is " + "$" + (dollar.format(firstGift + gift.getCost())));
			System.out.println("Order number is " + orderNum);
			System.out.println("Programmer: Jane Jeong");
			
		} else {
			orderNum = 10000 + new Random().nextInt(90000);
			System.out.println("The total cost of your order is " + "$" + dollar.format(firstGift));
			System.out.println("Order number is " + orderNum);
			System.out.println("Programmer: Jane Jeong");
			
		}
		

	}

}
