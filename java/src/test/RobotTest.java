package test;

import main.Robot;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class RobotTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Robot robot = new Robot(1241445699, "Wall-e","07/12/2021" );
        Robot robotClone = robot.clone();
        robotClone.setName("Wall-e 2.0");
        robotClone.setSerialNumber(2143124124);
        robotClone.setReleaseDate("07/12/2021");

        assertEquals("Robot{serialNumber: 2143124124, name: Wall-e 2.0, releaseDate: 07/12/2021}",robotClone.toString());
        assertEquals("Robot{serialNumber: 1241445699, name: Wall-e, releaseDate: 07/12/2021}",robot.toString());

    }

}