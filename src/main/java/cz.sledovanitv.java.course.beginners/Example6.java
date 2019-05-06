package cz.sledovanitv.java.course.beginners;

import cz.sledovanitv.java.course.beginners.animal.*;

import java.util.*;
import java.util.stream.Collectors;

public class Example6 {

    public static void main(String[] args) {
        Arrays.asList(new Dragon[] { new SpikedDragon(), new HornedDragon()});
        Arrays.asList(new SpikedDragon(), new HornedDragon());

        List<Dragon> dragonList = new ArrayList<>();
        dragonList.add(new SpikedDragon());
        dragonList.add(new HornedDragon());
        dragonList.add(new WoundedDragon());
        System.out.println(dragonList);
        dragonList.forEach(dragon -> {
            System.out.println(dragon);
        });
        dragonList.add(new SpikedDragon());
        List<Dragon> filtredDragons = dragonList.stream()
            .filter(dragon -> dragon.getNumberOfLegs() == 4 && dragon.getNumberOfEyes() == 2)
            .collect(Collectors.toList());
        System.out.println(filtredDragons);
        boolean isThereADragonWithTwoEyes = filtredDragons.stream().anyMatch(dragon -> dragon.getNumberOfEyes() == 2);
        System.out.println(isThereADragonWithTwoEyes);
        Set<Dragon> dragonSet = new HashSet<>();
        dragonSet.add(new SpikedDragon());
        dragonSet.add(new PartiallyWoundedDragon());
        dragonSet.add(new PartiallyWoundedDragon());
        System.out.println(dragonSet);
        Set<Dragon> sortedDragons = new TreeSet<>(dragonSet);
        System.out.println(sortedDragons);
        sortedDragons.add(new HornedDragon());
        sortedDragons.add(new WoundedDragon());
        System.out.println(sortedDragons);
        dragonList.sort(Comparator.naturalOrder());
        System.out.println(dragonList);
        Collections.reverse(dragonList);
        System.out.println(dragonList);

        Map<DragonType, Dragon> dragonMap = new HashMap<>();
        dragonMap.put(DragonType.SPIKED, new SpikedDragon());
        dragonMap.put(DragonType.HORNED, new WoundedDragon());
        dragonMap.put(DragonType.HORNED, new HornedDragon());
        System.out.println(dragonMap);
        dragonMap.forEach((dragonType, dragon) -> {
            System.out.println("Appeared dragon type "+dragonType + ": " + dragon);
        });
        System.out.println(dragonMap.get(DragonType.HORNED));
    }

}