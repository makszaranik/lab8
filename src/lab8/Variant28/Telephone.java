package lab8.Variant28;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Telephone {
  protected ArrayList<String> phoneNumbers;

  private boolean isPhoneNumber(String phoneNumber){
    String phoneRegex = "\\d{10}";
    Pattern pattern = Pattern.compile(phoneRegex);
    Matcher matcher = pattern.matcher(phoneNumber);

    return matcher.matches();
  }

  public Telephone(String phoneNumber){
    this.phoneNumbers = new ArrayList();
    if(isPhoneNumber(phoneNumber) == true){
      this.phoneNumbers.add(phoneNumber);
    }
    else{
      System.out.println("It's not phone number");
    }
  }

  public Telephone(String[] phoneNumbers){
    this.phoneNumbers = new ArrayList();
    for(int i = 0; i < phoneNumbers.length; i++){
      if (isPhoneNumber(phoneNumbers[i]) == true){
        this.phoneNumbers.add(phoneNumbers[i]);
      }
      else{
        System.out.println("String[" + i + "] is not phone number");
      }
    }
  }

  public Telephone(ArrayList<String> phoneNumbers){
    this.phoneNumbers = new ArrayList();
    for(int i = 0; i < phoneNumbers.size(); i++){
      if (isPhoneNumber(phoneNumbers.get(i)) == true){
        this.phoneNumbers.add(phoneNumbers.get(i));
      }
      else{
        System.out.println("String[" + i + "] is not phone number");
      }
    }
  }

  public ArrayList<String> getPhoneNumbers() {
    return phoneNumbers;
  }

  public Telephone newPhoneNumbers(String phoneNumber){

    ArrayList<String> newPhoneNumbers = new ArrayList();
    newPhoneNumbers = (ArrayList<String>)this.phoneNumbers.clone();

    if(isPhoneNumber(phoneNumber) == true){
      newPhoneNumbers.add(phoneNumber);

    }
    return new Telephone(newPhoneNumbers);
  }

  public Telephone newPhoneNumbers(String[] phoneNumbers){
    ArrayList<String> newPhoneNumbers = new ArrayList();
    newPhoneNumbers = (ArrayList<String>)this.phoneNumbers.clone();

    for(int i = 0; i < phoneNumbers.length; i++){
      if(isPhoneNumber(phoneNumbers[i]) == true){
        newPhoneNumbers.add(phoneNumbers[i]);
      }
    }
    return new Telephone(newPhoneNumbers);
  }

  public Telephone newPhoneNumbers(ArrayList<String> phoneNumbers){
    ArrayList<String> newPhoneNumbers = new ArrayList();
    newPhoneNumbers = (ArrayList<String>)this.phoneNumbers.clone();

    for(int i = 0; i < phoneNumbers.size(); i++){
      if(isPhoneNumber(phoneNumbers.get(i)) == true){
        newPhoneNumbers.add(phoneNumbers.get(i));
      }
    }
    return new Telephone(newPhoneNumbers);
  }

  @Override
  public String toString() {
    String str = "Telephone Numbers: ";
    for(String element : this.phoneNumbers){
      str += element + " ";
    }

    return str;
  }

  public boolean equals(Telephone other) {
    return this.phoneNumbers == other.phoneNumbers;
  }



}