package rpg_lab;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class HeroTest {

    @Test
    public void test_HeroGainsXP_WhenKillingTarget_Mocking() {

        Weapon weapon = Mockito.mock(Weapon.class);
        Hero hero = new Hero("Pesho", weapon);
        assertEquals(0, hero.getExperience());
        Target target = Mockito.mock(Target.class);

        when(target.isDead()).thenReturn(true);
        when(target.giveExperience()).thenReturn(200);

        hero.attack(target);

        assertEquals(200, hero.getExperience());

    }
}