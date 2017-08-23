import com.whiteboard.repositories.ProfileRepository;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ProfileTest {

    @Before
    public void setUp() {

    }

    @Test(timeout=1000)
    public void testA() throws Exception {
        Class<?> profileClass = Profile.class;
        Method testMethod = profileClass.getMethod("getById", int.class);
        Type testType = testMethod.getReturnType();
        //System.out.println(testType);
    }

    @Test
    public void testGetProfileById() {
        int id = 1;
        Profile profile = mock(Profile.class);
        when(profile.getById(id)).thenReturn("1002");

        ProfileRepo profileRepo = new ProfileRepo(profile);
        String profileId = profileRepo.getId(id);
        //System.out.println(profileId);

        assertEquals(profileId, "1002");
    }

}