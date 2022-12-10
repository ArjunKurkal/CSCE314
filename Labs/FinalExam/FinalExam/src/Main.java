import java.util.*;

public class Main {
    public static void main(String[] args) {
        // you can un-comment out tests for your questions  and run them one-by one to test your code
        
        testSum(); // Question 1 : complete the code in method sum
       test_people(); // Question 2 : complete the code in methods create_people, sort_people and create_map
        testQuadrilateral(); // Question 3
       test_queue(); // Question 4
        //testLRUCache(); // Question 4



    }

    // *************************************************************
    // Question 1 Supporting Code
    // *************************************************************

    public static void testSum(){
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 2; i<10; i=i+2)
        {
            a.add(i);
        }
        int [] res =sum(a,14) ;
        System.out.println(res[0]+" "+res[1]);
        System.out.println(sum(a, 45));
        // answer should be
//        2 3
//        null
    }

    public static int[] sum(ArrayList<Integer> nums, int target) {
        //  TODD: Question 1: impletement this as given in the question
        int [] solution = new int[2];
        for(int i = 0; i < nums.size(); i++){
            if(nums.contains(target - nums.get(i))){
                solution[0] = i;
                solution[1] = nums.indexOf(target - nums.get(i));
                return solution;
            }
        }
        return null;
    }

    // *************************************************************
    // Question 2 Supporting Code
    // *************************************************************

    public static ArrayList<Person> create_people() {
        ArrayList<Double> heights = new ArrayList<>();
        ArrayList<Double> weights = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> countries = new ArrayList<>();
        ArrayList<Person> people = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        double seed = 130;
        for (int i = 1; i <= 10; i++) {
            heights.add(seed);
            weights.add(seed);
            seed = seed +10;
            ages.add(i*2);
           sb.append('a');
           names.add(sb.toString());
            countries.add("United States");
        }
        for (int i = 0; i<10;i++)
        {
            double height = heights.get(i);
            double weight = weights.get(i);
            int age = ages.get(i);
            String name = names.get(i);
            String country = countries.get(i);
            // TODO : Question 2: complete the following lines to create a Person Object and add it to the arraylist in people
            people.add(new Person(height, weight, age, name, country));
        }
        return people;
    }
    public static Person returnMaxAge(ArrayList<Person> p){
        Person answ = p.get(0);
        for(int i = 0; i < p.size(); i++){
            if(p.get(i).getName().compareTo(answ.getName()) > 0){
             answ = p.get(i);
            }
            else if(p.get(i).getName().compareTo(answ.getName()) == 0){
                if (p.get(i).getAge() < answ.getAge()) answ = p.get(i);
            }
        }
        return answ;
    }
    public static Person returnMaxWeight(ArrayList<Person> p){
        Person answ = p.get(0);
        for(int i = 0; i < p.size(); i++){
            if(p.get(i).getWeight() > answ.getWeight()){
                answ = p.get(i);
            }
            else if(p.get(i).getWeight() == answ.getWeight()){
                if (p.get(i).getHeight() > answ.getHeight()) answ = p.get(i);
            }
        }
        return answ;
    }
    public static Person returnMaxHeight(ArrayList<Person> p){
        Person answ = p.get(0);
        for(int i = 0; i < p.size(); i++){
            if(p.get(i).getHeight() < answ.getHeight()) {
                answ = p.get(i);
            }
        }
        return answ;
    }
    public static void sort_people()
    {
        ArrayList<Person> people = create_people();
        // TODO : Question 2: Sort the list by name and age
        ArrayList<Person> peeps = new ArrayList<Person>(people.size());
        for(int i = 0; i < people.size(); i++){
            peeps.add(i, returnMaxAge(people));
            people.remove(peeps.get(i));
            --i;
        }
        people = peeps;
        System.out.println(people.toString());
        // TODO : Question 2: Sort the list by height and weight in descending order
        ArrayList<Person> peeps2 = new ArrayList<Person>(people.size());
        for(int i = 0; i < people.size(); i++){
            peeps2.add(i, returnMaxWeight(people));
            people.remove(peeps.get(i));
            --i;
        }
        people = peeps2;
        System.out.println(people.toString());
    }
    public static void create_map()
    {
        ArrayList<Person> people= create_people();
        Map<Double, Person> map = new HashMap<>();
        // TODO: create a map with height as key and People as value
        Person temp;
        for(int i = 0; i < people.size(); i++){
            temp = returnMaxHeight(people);
            map.put(temp.getHeight(), temp);
            people.remove(temp);
            --i;
        }
        System.out.println(map);
    }
    public static void test_people()
    {
        sort_people();
        create_map();
        // answer should be
//        [Person{name='a', country='United States', age=2, height=130.0, weight=130.0}, Person{name='aa', country='United States', age=4, height=140.0, weight=140.0}, Person{name='aaa', country='United States', age=6, height=150.0, weight=150.0}, Person{name='aaaa', country='United States', age=8, height=160.0, weight=160.0}, Person{name='aaaaa', country='United States', age=10, height=170.0, weight=170.0}, Person{name='aaaaaa', country='United States', age=12, height=180.0, weight=180.0}, Person{name='aaaaaaa', country='United States', age=14, height=190.0, weight=190.0}, Person{name='aaaaaaaa', country='United States', age=16, height=200.0, weight=200.0}, Person{name='aaaaaaaaa', country='United States', age=18, height=210.0, weight=210.0}, Person{name='aaaaaaaaaa', country='United States', age=20, height=220.0, weight=220.0}]
//        [Person{name='aaaaaaaaaa', country='United States', age=20, height=220.0, weight=220.0}, Person{name='aaaaaaaaa', country='United States', age=18, height=210.0, weight=210.0}, Person{name='aaaaaaaa', country='United States', age=16, height=200.0, weight=200.0}, Person{name='aaaaaaa', country='United States', age=14, height=190.0, weight=190.0}, Person{name='aaaaaa', country='United States', age=12, height=180.0, weight=180.0}, Person{name='aaaaa', country='United States', age=10, height=170.0, weight=170.0}, Person{name='aaaa', country='United States', age=8, height=160.0, weight=160.0}, Person{name='aaa', country='United States', age=6, height=150.0, weight=150.0}, Person{name='aa', country='United States', age=4, height=140.0, weight=140.0}, Person{name='a', country='United States', age=2, height=130.0, weight=130.0}]
//        {130.0=Person{name='a', country='United States', age=2, height=130.0, weight=130.0}, 140.0=Person{name='aa', country='United States', age=4, height=140.0, weight=140.0}, 150.0=Person{name='aaa', country='United States', age=6, height=150.0, weight=150.0}, 160.0=Person{name='aaaa', country='United States', age=8, height=160.0, weight=160.0}, 170.0=Person{name='aaaaa', country='United States', age=10, height=170.0, weight=170.0}, 180.0=Person{name='aaaaaa', country='United States', age=12, height=180.0, weight=180.0}, 190.0=Person{name='aaaaaaa', country='United States', age=14, height=190.0, weight=190.0}, 200.0=Person{name='aaaaaaaa', country='United States', age=16, height=200.0, weight=200.0}, 210.0=Person{name='aaaaaaaaa', country='United States', age=18, height=210.0, weight=210.0}, 220.0=Person{name='aaaaaaaaaa', country='United States', age=20, height=220.0, weight=220.0}}

    }


    // *************************************************************
    // Question 3 Supporting Code
    // *************************************************************
    
    public static void testQuadrilateral()
    {
        Quadrilateral rectangle = new Rectangle(4,5);
        Quadrilateral square = new Square(7);
        Quadrilateral square1 = new Square(7);
        Quadrilateral q2 = new Rectangle(5,4);
        System.out.println(rectangle.toString());
        System.out.println(square.toString());
        System.out.println(q2.toString());
        System.out.println(rectangle.compareTo(q2));
        System.out.println(square.compareTo(square1));
        // Your answer should look like this
//        Rectangle{length=4.0, width=5.0}
//        Square{Side =7.0}
//        Rectangle{length=5.0, width=4.0}
//        -1
//        0
    }
/*
    // *************************************************************
    // Question 4 Supporting Code
    // *************************************************************
    public static void testLRUCache()
    {
        // your code should work with the example given here
        LRUCache lRUCache = new LRUCache(2);
        // in the below example key=1, value=1
        lRUCache.put(1, 1); // cache is {1=1}

        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        System.out.println(lRUCache.get(1));    // return 1
        lRUCache.put(3, 3); // LRU key was 2, since it is least recently used cache evicts key 2, cache is {1=1, 3=3}
        System.out.println(lRUCache.get(2));    // returns -1 (not found)
        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        System.out.println(lRUCache.get(1));    // return -1 (not found)
        System.out.println(lRUCache.get(3));    // return 3
        System.out.println(lRUCache.get(4));    // return 4
    }
*/
    // *************************************************************
    // Question 4 Supporting Code
    // *************************************************************

    public static void test_queue()
    {
        Queue<Integer> q1 = new Queue<>();
        q1.enqueue(5);
        q1.enqueue(10);
        q1.enqueue(20);
        System.out.println("q1 after enqueue of 3 elements:\n" + q1);
        q1.dequeue();
        System.out.println("q1 after dequeue :\n" + q1);
        Queue<String> q2 = new Queue<>();
        q2.enqueue("Final");
        q2.enqueue("Exam");
        q2.enqueue("Now");
        System.out.println("\nq2 after enqueue of 3 elements:\n" + q2);
        System.out.println("q2 front = " + q2.front()
                + ", q2 rear = " + q2.rear());
        Queue<Float> q3 = new Queue<>();
        System.out.println("\nCreated new Float type queue q3...");
        System.out.println("Checking if queue is empty or not :\n"
                        + q3.empty());

        // answer should be
        //        q1 after enqueue of 3 elements:
        //    5->10->20
        //        q1 after dequeue :
        //    10->20
        //
        //        q2 after enqueue of 3 elements:
        //    Final->Exam->Now
        //        q2 front = Now, q2 rear = Final
        //
        //        Created new Float type queue q3...
        //        Checking if queue is empty or not :
        //    true

    }


}
