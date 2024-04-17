package lab8.Variant28;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Smartphone extends Telephone {

  public Smartphone(String phoneNumber) {
    super(phoneNumber);
  }

  public Smartphone(String[] phoneNumbers) {
    super(phoneNumbers);
  }

  public Smartphone(List<String> phoneNumbers) {
    super(new ArrayList<>(phoneNumbers));
  }

  public Smartphone addPhoneNumber(String phoneNumber) {
    if (isValidPhoneNumber(phoneNumber)) {
      List<String> newPhoneNumbers = new ArrayList<>(getPhoneNumbers());
      newPhoneNumbers.add(phoneNumber);
      return new Smartphone(new ArrayList<>(newPhoneNumbers));
    } else {
      throw new IllegalArgumentException("Invalid phone number");
    }
  }

  public ArrayList<String> getPhoneNumbers() {
    return (ArrayList<String>)this.phoneNumbers.clone();
  }

  private boolean isValidPhoneNumber(String phoneNumber) {
    String phoneRegex = "\\d{10}";
    return phoneNumber != null && phoneNumber.matches(phoneRegex);
  }

  @Override
  public String toString() {
    String str = "Smartphone's Numbers: ";
    for(String element : this.phoneNumbers){
      str += element + " ";
    }

    return str;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Smartphone smartphone = (Smartphone) o;
    return Objects.equals(getPhoneNumbers(), smartphone.getPhoneNumbers());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getPhoneNumbers());
  }

  public Smartphone newPhoneNumbers(String phoneNumber) {
    List<String> newPhoneNumbers = new ArrayList<>(this.getPhoneNumbers());
    if (isValidPhoneNumber(phoneNumber)) {
      newPhoneNumbers.add(phoneNumber);
    } else {
      throw new IllegalArgumentException("Invalid phone number");
    }
    return new Smartphone(new ArrayList<>(newPhoneNumbers));
  }

  public Smartphone newPhoneNumbers(String[] phoneNumbers) {
    List<String> newPhoneNumbers = new ArrayList<>(getPhoneNumbers());
    for (String phoneNumber : phoneNumbers) {
      if (isValidPhoneNumber(phoneNumber)) {
        newPhoneNumbers.add(phoneNumber);
      }
    }
    return new Smartphone(new ArrayList<>(newPhoneNumbers));
  }

  public Smartphone newPhoneNumbers(ArrayList<String> phoneNumbers) {
    List<String> newPhoneNumbers = new ArrayList<>(getPhoneNumbers());
    for (String phoneNumber : phoneNumbers) {
      if (isValidPhoneNumber(phoneNumber)) {
        newPhoneNumbers.add(phoneNumber);
      }
    }
    return new Smartphone(new ArrayList<>(newPhoneNumbers));
  }
}
