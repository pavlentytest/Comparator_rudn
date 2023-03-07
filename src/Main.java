import java.util.*;

public class Main {
    public static void main(String[] args) {

       int[] array = {5, 12, -5, 99, 45};
       Arrays.sort(array);
       for(int i: array) {
           System.out.print(i + " ");
       }
       Arrays.binarySearch(array, 45);

       Integer[] array_obj = {5, 12, -5, 99, 45};
       List<Integer> arrayList = Arrays.asList(array_obj);
       System.out.println();
        System.out.println(arrayList.size());
       for(int i=0;i<arrayList.size();i++) {
           System.out.print(arrayList.get(i)+ " ");
       }
       Collections.sort(arrayList);
        System.out.println();
       for(Integer a: arrayList) {
           System.out.print(a + " ");
       }
        int x = Collections.binarySearch(arrayList, 199);
        System.out.println();
        System.out.println(x);

        class City implements Comparable<City>{
            public String name;
            public int population;

            public City(String name, int population) {
                this.name = name;
                this.population = population;
            }

            @Override
            public int compareTo(City o) {
                //return o.name.compareTo(this.name);
                return  this.population - o.population;
            }
        }
        List<City> cities = new ArrayList<>();
        cities.add(new City("Moscow",10000000));
        cities.add(new City("Berlin", 3000000));
        cities.add(new City("St.Petersburg", 5000000));
        cities.add(new City("Munich",1500000));

        Comparator<City> rule = new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                //return o1.name.compareTo(o2.name);
                return o2.population-o1.population;
            }
        };


        Collections.sort(cities, rule);
        for(City c: cities) {
            System.out.println(c.name + ", "+c.population);
        }
    }
}