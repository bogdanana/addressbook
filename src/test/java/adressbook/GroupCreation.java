package adressbook;
import org.junit.Test;

public class GroupCreation extends TestBase {

  @Test
  public void testMethodOne() {
    goToGroups();
    initGroupCreation();
    fillGroupForm(new GroupData("test3", "test4", "test5"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
