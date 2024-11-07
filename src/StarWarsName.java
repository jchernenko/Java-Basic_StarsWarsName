// to create your Star Wars Name - scroll down to Main at the bottom and change the information to your own.

public class StarWarsName {
	
	private String name;
	private String firstName;
	private String lastName;
	private String mothersMaidenName;
	private String birthCity;
	
	public StarWarsName(String name) throws IllegalArgumentException {
		
		if(name == null || name == "") {
			throw new IllegalArgumentException("missing data input");
		}
		else {
			this.name = name;
		}
		
		String words[] = name.split("\\|");
		
		if(words.length == 4) {
			if(words[0] != null || words[0] != "") {
				this.firstName = words[0];
			}
			else {
				throw new IllegalArgumentException("invalid first name");
			}
			
			if(words[1] != null || words[1] != "") {
				this.lastName = words[1];
			}
			else {
				throw new IllegalArgumentException("invalid last name");
			}
			
			if(words[2] != null || words[2] != "") {
				this.mothersMaidenName = words[2];
			}
			else {
				throw new IllegalArgumentException("invalid maiden name");
			}
			
			if(words[3] != null || words[3] != "") {
				this.birthCity = words[3];
			}
			else {
				throw new IllegalArgumentException("invalid birth city");
			}
			
		}
		else {
			throw new IllegalArgumentException("incorrect number of words provided");
			//System.exit(-1); *** this did not work for me.
		}

		
		System.out.format("Your Star Wars name is: %s%s %s%s", firstName.substring(0, 3), lastName.substring(0, 2).toLowerCase(), mothersMaidenName.substring(0, 2), birthCity.substring(0, 3).toLowerCase());
			
	}
	

	
	
	public static void main(String[] args) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
		new StarWarsName("Ted|Wizard|Smith|Boston");

	}

}
