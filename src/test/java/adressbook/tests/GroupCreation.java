package adressbook.tests;
import adressbook.model.GroupData;
import org.junit.Test;

public class GroupCreation extends TestBase {

  @Test
  public void testMethodOne() {
    app.getNavigationHelper().goToGroups();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test3", "test4", "test5"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }

}
