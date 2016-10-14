package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else if(text.contains(",") || text.contains("\n")){
			return sum(splitNumbers(text));
		}
		else
			return Integer.parseInt(text);
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers){
	    return numbers.split(",|\n");
	}

    private static int sum(String[] numbers){
 	    int total = 0;
 	    String neg = null;

 	    for(String number : numbers){
		    if(toInt(number) < 0){
		    	neg = neg + "," + number;
			}
		}
 	 
 	 	if(neg == null){
		   	for(String number : numbers){
		   		 total += toInt(number);
			}
		}
		else{
			String negative = neg.substring(5);
			throw new IllegalArgumentException("Negatives not allowed: " + negative);		
		}
       
		return total;
    }



}