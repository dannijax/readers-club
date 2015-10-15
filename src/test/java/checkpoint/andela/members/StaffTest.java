package checkpoint.andela.members;


import checkpoint.andela.main.ReaderClub;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * A test for Staff Class
 */
public class StaffTest {

    @Test
    public void isStaffShouldReturnTrue(){
        Staff member = new Staff();
        assertTrue(member.isStaff());
    }

    @Test
    public void isStudentShouldreturnFalse() {
        Staff member = new Staff();
        assertFalse(member.isStudent());
    }
}
