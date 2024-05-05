import java.util.ArrayList;
import java.util.List;

public abstract class Form implements Validationable {
  private List<String> errorMessages = new ArrayList<String>();

  // public abstract boolean validate();

  public abstract boolean save();

  public abstract void print();

  public abstract void reset();

  public List<String> getErrorMessages() {
    return errorMessages;
  }

  protected void addErrorMessages(String message) {
    this.errorMessages.add(message);
  }
}
