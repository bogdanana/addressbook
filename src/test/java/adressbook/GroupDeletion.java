package adressbook;

import org.junit.Test;

public class GroupDeletion extends TestBase{

    @Test
    public void testMethodOne() {
        goToGroups();
        selectGroup();
        deleteSelectedGroup();
        returnToGroupPage();
    }
}
