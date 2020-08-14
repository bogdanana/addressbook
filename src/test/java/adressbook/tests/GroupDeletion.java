package adressbook.tests;

import org.junit.Test;

public class GroupDeletion extends TestBase{

    @Test
    public void testMethodOne() {
        app.getNavigationHelper().goToGroups();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroup();
        app.getGroupHelper().returnToGroupPage();
    }
}
