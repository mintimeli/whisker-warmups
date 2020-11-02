import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PromptGenerator {

	//Constructors 
	
	public PromptGenerator() {
		
	}

	//Methods
	
	public String getNoun(String noun) {
		noun = noun.toLowerCase();
		String animal = "";
		if (noun.equals("dog")) {
			animal = "Dog";
		}
		else if (noun.equals("cat")) {
			animal = "Cat";
		}
		else if (noun.equals("either")) {
			List<String> nouns = new ArrayList<>();
			nouns.add("Cat");
			nouns.add("Dog");
			Random rand = new Random(); 
			String animalList = "";
	        int randomIndex = rand.nextInt(nouns.size()); 
	        animalList = (nouns.get(randomIndex));
	        return animalList; 
		}
		else {
			System.out.println("Error: incorrect entry.");
			return null;
		}
		return animal;
	}
	public String getRandomDescription () {
		List<String> descriptions = new ArrayList<>();
		descriptions.add("wearing a fancy hat");
		descriptions.add("looking eating some ice cream");
		descriptions.add("wearing a tie");
		descriptions.add("wearing a warm scarf");
		descriptions.add("skateboarding");
		descriptions.add("baking a cake");
		descriptions.add("having fun in the summer heat");
		descriptions.add("enjoying an autumn day");
		descriptions.add("dealing with the winter weather");
		descriptions.add("enjoying a spring day");
		descriptions.add("playing with a ball");
		descriptions.add("wearing a costume");
		descriptions.add("wearing a cowboy hat");
		descriptions.add("dressed up as a witch");
		descriptions.add("with a knife");
		descriptions.add("dreaming");
		descriptions.add("eating good good food");
		descriptions.add("as a suhi chef");
		descriptions.add("as a butler");
		descriptions.add("as a business animal");
		descriptions.add("looking nervous");
		descriptions.add("feeling hyper");
		descriptions.add("dressed up as a detective");
		descriptions.add("dressed up as a videogame character");
		descriptions.add("dressed as an athletic champion");
		descriptions.add("dressed up as a dessert");
		descriptions.add("dressed up as a food");
		descriptions.add("dressed up as a magical girl");
		descriptions.add("living the high life");
		descriptions.add("looking tired");
		descriptions.add("but anime");
		descriptions.add("celebrating a holiday");
		descriptions.add("as a plant");
		descriptions.add("surrounded by plants");
		descriptions.add("in love");
		descriptions.add("as inspired by a book/comic/movie");
		
		Random rand = new Random(); 
		String newList = "";
        int randomIndex = rand.nextInt(descriptions.size()); 
        newList = (descriptions.get(randomIndex));
        return newList; 
	}

}
