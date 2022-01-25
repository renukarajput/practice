package leetcode_14days;

import leetcode_14days.day1.VersionControl;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class VersionControlTest {

    @Test
    public void firstBadVersion() {
        assertThat(
                new VersionControl(new boolean[]{false, false, true, true, true}).firstBadVersion(5),
                is(2));
    }

    @Test
    public void firstBadVersion_01() {
        assertThat(
                new VersionControl(new boolean[]{false, true, true, true, true}).firstBadVersion(5),
                is(1));
    }

    @Test
    public void firstBadVersion_02() {
        assertThat(
                new VersionControl(new boolean[]{false, false, false, false, true}).firstBadVersion(5),
                is(4));
    }

    @Test
    public void firstBadVersion_03() {
        assertThat(
                new VersionControl(new boolean[]{false, true}).firstBadVersion(2),
                is(1));
    }

    @Test
    public void firstBadVersion_04() {
        assertThat(
                new VersionControl(new boolean[]{true}).firstBadVersion(1),
                is(1));
    }
}