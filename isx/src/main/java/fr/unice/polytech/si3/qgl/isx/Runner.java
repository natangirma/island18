package fr.unice.polytech.si3.qgl.isx;

import java.io.File;
import static eu.ace_design.island.runner.Runner.*;

public class Runner {

  public static void main(String[] args) throws Exception {

    run(Explorer.class)
        .exploring(new File(Runner.class.getResource("/map.json").toURI()))
        .withSeed(0L)
        .startingAt(1, 1, "EAST")
        .backBefore(7000)
        .withCrew(15)
        .collecting(1000, "WOOD")
        .collecting(300,  "QUARTZ")
        .collecting(10,   "FLOWER")
        .storingInto(".")
        .fire();

	}
}