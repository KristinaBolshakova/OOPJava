package units;

import java.util.ArrayList;

public interface HeroInterface {
    void step(ArrayList<BaseHero> heroList);
    String getInfo();
}
